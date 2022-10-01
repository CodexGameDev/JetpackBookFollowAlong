package com.example.composebookfollowalong
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
    Column( horizontalAlignment = Alignment.Start) {

        var fade = 1f
        while(fade > 0f) {
            //This weird stuff is used to counteract the effect of float division inaccuracy
            fadedText2(text = "Top Row " + ((fade + .001) * 100).toInt() + "%" , fadePercent = fade)
            fade -= .1f


        }


    }
}









