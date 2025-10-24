package com.example.newsapp.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private const val BASE_URL =
        "https://jsonplaceholder.typicode.com/posts"

    val api: ApiService by lazy{                                                                    // "by lazy": delays the initialization of the property until
                                                                                                    //             it is first accessed.

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())                             // adds converter factory for serialization and deserl. of objects
            .build()                                                                                 // and "GsonConverterFactory" converts JSON responses into KOTLIN objects and vice versa

        retrofit.create(ApiService::class.java)                                                      // ApiService::class.java -> specifies the interface for retrofit to generate the implementation

    }


}


