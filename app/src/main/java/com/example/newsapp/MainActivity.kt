package com.example.newsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsapp.screens.PostScreen
import com.example.newsapp.ui.theme.NewsAppTheme
import com.example.newsapp.viewmodel.PostViewModel


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


    private val  myViewModel: PostViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Column(
                modifier = Modifier.padding(4.dp).systemBarsPadding()
            ) {
                Header()

                PostScreen(viewModel = myViewModel)
            }
        }
    }
}


@Composable
fun Header(){

    Column(
        modifier = Modifier.fillMaxWidth().padding(6.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = "News App", fontWeight = FontWeight.Bold, fontSize = 30.sp, color = Color.Blue)
        Text(text = "Get Latest News", fontSize = 18.sp)
    }

}
