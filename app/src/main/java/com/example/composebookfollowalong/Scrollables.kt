package com.example.composebookfollowalong

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import kotlin.random.Random
import kotlin.random.nextInt




@Composable
fun ScrollComposable(numChars : Int, horizontal : Boolean)
{
    var i = 0
if(horizontal)
{
    Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
        while (i < numChars)
        {
            Text((Random.nextInt(0,100)).toString())
            i += 1
        }
    }
}
else
{

}
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        while (i < numChars)
        {
            Text((Random.nextInt(0,100)).toString())
            i += 1
        }
    }
}


