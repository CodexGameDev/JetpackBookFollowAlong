package com.example.composebookfollowalong

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import kotlin.random.Random



@Composable
fun ReturnScrollableFloatColumn(lines : Int)
{
    Column(modifier = Modifier.verticalScroll(rememberScrollState()))
    {
        var i = 0
        while(i < lines)
        {
            var currentText = ""
            ReturnString()
            {
                currentText = it
            }
            Text(text = currentText)
            i += 1
        }
    }
}


@Composable
fun ReturnString(returnVal : (String) -> Unit)
{
    returnVal(Random.nextFloat().toString())
}