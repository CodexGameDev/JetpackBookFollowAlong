package com.example.composebookfollowalong

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
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

    CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.high) {
        Text(text = notFaded)
    }
    //The float .2f can also be replaced by ContentAlpha.high or .low depending on use case.






}