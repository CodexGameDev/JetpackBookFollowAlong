package com.example.composebookfollowalong.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlin.random.Random
//Lot of the logic done by the constructor. This is just a clickable box that returns a random color. The constructor would decide what to do with the color.

@Composable
fun colorChangingBox(colorUpdate : (Color) -> Unit)
{


    Box(modifier = Modifier
        .background(Color.Red)
        .fillMaxHeight(.5f)
        .fillMaxWidth()
        .clickable {
            colorUpdate(Color(Random.nextFloat(), Random.nextFloat(), Random.nextFloat()))

        }

    )

}


@Composable
fun ClickToChangeColor(ChangeColor : (Color) -> Unit)
{
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Blue)
        .clickable {
            ChangeColor(
                Color(Random.nextFloat(), Random.nextFloat(), Random.nextFloat())
            )
        }


    )
    {


    }


}