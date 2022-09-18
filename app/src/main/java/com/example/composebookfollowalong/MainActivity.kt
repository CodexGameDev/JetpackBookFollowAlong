package com.example.composebookfollowalong
import AllText
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text

import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview



class MainActivity : ComponentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainPreview()

        }



    }


}

@Preview (showSystemUi = true, showBackground = true)
@Composable
fun MainPreview()
{
    var URL = remember {
        mutableStateOf("https://picsum.photos/200")
    }
    var iteration = remember {
        mutableStateOf(0)
    }
  LoadImage2( iteration.value , URLval = URL.value){
      URL.value = it
      iteration.value += 1
      if(iteration.value == 2)
      {
          iteration.value = 0
      }
  }

    Text(text = URL.value)
}









