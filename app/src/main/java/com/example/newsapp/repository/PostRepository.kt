package com.example.newsapp.repository

import com.example.newsapp.retrofit.Post
import com.example.newsapp.retrofit.RetrofitInstance


/*          repository acts as a mediator between data source (network api) and the ViewModel       */







class PostRepository {


    private val apiService = RetrofitInstance.api                                               // it ensures that "Post repository" has access to the methods defined in "ApiService"


    suspend fun getPosts(): List<Post>{
        return apiService.getPost()                                                             // calling the suspend function of ApiService here , if there was multiple sus fun in apiservice we'd have to call all of them tp work
    }
}