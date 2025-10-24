package com.example.newsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.newsapp.ui.theme.NewsAppTheme






/*



 STEPS to use RETROFIT to fetch data:


                1. Data class: for fetching response we need to create pojo class that automatically
                               parse the JSON data using GSON in background


                2. API service interface: To define our methods that will be used for network transactions.
                                          Also known as API interface.


                3. Retrofit instance: Since we are using retrofit for the network call, we create a
                                      class that provides that instance of the retrofit



 */






class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {


        }
    }
}

