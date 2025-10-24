package com.example.newsapp.retrofit

import retrofit2.http.GET


/*

https://jsonplaceholder.typicode.com/posts :

                        Base url = "jsonplaceholder.typicode.com"
                        Endpoint = "posts"

 */

interface ApiService {

    @GET("posts")                                                    // defined endpoint
    suspend fun getPost(): List<Post>                                        // async fun => works without blocking the main thread, List<> is a return type


}