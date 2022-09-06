package com.example.composebookfollowalong.ui.theme

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale


//The logic for this is done via the constructor by passing in a random image when the it value is returned.

@Composable
fun ImageTux(paint: Painter, changeImage : (String) -> Unit)
{
    var counter = remember {
        mutableStateOf(0)
    }
    androidx.compose.foundation.Image(painter = paint, contentDescription = "This is Tux" , contentScale = ContentScale.Crop,modifier =
    Modifier.clickable {
        counter.value += 1
        changeImage( counter.toString())

    } .fillMaxSize())
}