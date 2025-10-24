package com.example.newsapp.screens

import androidx.compose.runtime.Composable
import com.example.newsapp.viewmodel.PostViewModel

@Composable
fun PostScreen(viewModel: PostViewModel){

    // no need of "observeAs" as we are not using "LiveData", but mutableStateOf

    val posts = viewModel.posts

    PostList(posts = posts)


}