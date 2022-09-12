package com.example.composebookfollowalong
import BoxMod

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text

import androidx.compose.runtime.*
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
  ReturnScrollableFloatColumn(lines = 10)
}








