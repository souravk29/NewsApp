package com.example.newsapp.retrofit



/*                                 1st STEP                                            */

/*           this serves as a template for every item of JSON response                */



data class Post(
                                                        // we didn't use item/variable "userId"
    val id: Int,
    val title: String,
    val body: String

)