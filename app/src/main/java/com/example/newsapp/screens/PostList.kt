package com.example.newsapp.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.newsapp.retrofit.Post

@Composable
fun PostList(posts: List<Post>){

    LazyColumn {
        items(posts){                                               // "items" is used to iterate over the posts list, for each item in the list it executes the lambda function
            post -> PostItem(post = post)
        }
    }
}