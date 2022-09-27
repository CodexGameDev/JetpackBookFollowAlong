package com.example.composebookfollowalong

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.Group
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign

@Composable
fun WeightColumns()
{
    Row(modifier = Modifier.fillMaxHeight(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,



    ) {


        Column(modifier = Modifier.weight(1f))
        {

           TextField(value = "", onValueChange = {})

        }
        Column(modifier = Modifier.weight(1f))
        {

            Text(text = "Testing", textAlign = TextAlign.Center, modifier = Modifier.align(CenterHorizontally))
        }
        Column(modifier = Modifier.weight(1f))
        {

            Image(painter = painterResource(id = R.drawable.tux) , contentDescription = "Tux")
        }
    }
}