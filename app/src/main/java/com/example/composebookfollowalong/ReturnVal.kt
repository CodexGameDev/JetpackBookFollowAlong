package com.example.composebookfollowalong

import androidx.compose.runtime.Composable
import kotlin.random.Random

@Composable
fun ReturnString(returnVal : (String) -> Unit)
{
    returnVal(Random.nextFloat().toString())
}