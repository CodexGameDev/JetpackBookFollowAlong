package com.example.composebookfollowalong

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composebookfollowalong.ui.theme.ComposeBookFollowAlongTheme


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {

    var inputTxt = remember {
        mutableStateOf("")
    }
    Column(modifier = Modifier.fillMaxSize(.5f)) {
        TextInput()
        {
            if(it.length < 5) {
                inputTxt.value = it
            }

        }

        Text(text = inputTxt.value)

    }

}

@Composable
fun TextInput(returnVal : (String) -> Unit)
{
    var txtValue = remember {
        mutableStateOf("")
    }
    TextField(value = txtValue.value, label = { Text(text = "Username")}, onValueChange =
    {
        txtValue.value = it
        returnVal(it)

    } 
    
    )
}