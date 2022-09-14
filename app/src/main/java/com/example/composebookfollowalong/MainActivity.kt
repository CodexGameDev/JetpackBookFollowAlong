package com.example.composebookfollowalong
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Card
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
  CardTest()

}









