package com.example.composebookfollowalong

import androidx.compose.foundation.layout.*
import androidx.compose.material.ContentAlpha
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.LocalContentColor
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier


@Composable
fun FadedText(notFaded : String, faded : String)
{
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
        Text(text = notFaded )

        CompositionLocalProvider(LocalContentAlpha provides .3f) {
            Text(text = faded)

        }
    }
}

@Composable
fun FadedPyramid(stringsList : ArrayList<String>)
{
    var counter = 0
    Column(verticalArrangement = Arrangement.SpaceEvenly){

        while (counter < stringsList.size)
        {
            CompositionLocalProvider(LocalContentAlpha provides 1 /(counter.toFloat() + 1)) {

                Text(text = stringsList.get(counter))
            }
            counter += 1
        }
    }
}