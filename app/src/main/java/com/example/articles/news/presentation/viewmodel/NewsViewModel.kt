package com.example.articles.news.presentation.viewmodel

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import javax.inject.Inject
import com.example.articles.news.domain.UseCase


class NewsViewModel @Inject constructor(
    private val mUseCase: UseCase
) : ViewModel() {


//code to be deleted
//if you don't need to change your source you can do like this
//    val articleResult = liveData {
//        emitSource(getArticlesUseCase.getArticles())
//    }

//
//    val articleResult = MediatorLiveData<Result<List<Article>>>()
//
//
//    init {
//        loadArticles(false)
//    }
//
//    fun loadArticles(mustFetchFromNetwork: Boolean) {
//        viewModelScope.launch {
//            articleResult.addSource(getArticlesUseCase.getArticles(mustFetchFromNetwork)) {
//                articleResult.value = it
//            }
//        }
//    }
//
//    val singleArticleResult = MediatorLiveData<Result<Article>>()
//
//    fun loadSingleArticle(id: Long) {
//        viewModelScope.launch {
//            singleArticleResult.addSource(getSingleArticleUseCase.getArticleById(id)) {
//                singleArticleResult.value = it
//            }
//        }
//    }


}