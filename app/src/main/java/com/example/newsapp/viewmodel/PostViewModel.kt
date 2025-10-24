package com.example.newsapp.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapp.repository.PostRepository
import com.example.newsapp.retrofit.Post
import kotlinx.coroutines.launch

class PostViewModel : ViewModel() {                                                                 // inherited "ViewModel"


    // connecting viewmodel with the repository

    private val repository = PostRepository()

    var posts by mutableStateOf<List<Post>>(emptyList())                                    // initializes the state with am empty list of the post objects
        private set


    init {

        viewModelScope.launch{

            // fetching the data
            val fetchedPosts = repository.getPosts()

            // updating the states :  any update to posts will trigger a recomposition  of any composable  that read this state, posts gets updated as fetchedPosts
            posts = fetchedPosts

        }

    }


}