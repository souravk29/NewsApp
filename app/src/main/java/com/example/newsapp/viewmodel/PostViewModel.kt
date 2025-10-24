package com.example.newsapp.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.newsapp.repository.PostRepository
import com.example.newsapp.retrofit.Post

class PostViewModel : ViewModel() {                                                                 // inherited "ViewModel"


    // connecting viewmodel with the repository

    private val repository = PostRepository()

    var posts by mutableStateOf<List<Post>>(emptyList())                                    // initializes the state with am empty list of the post objects
        private set


}