package com.example.composebookfollowalong

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.security.cert.TrustAnchor

@Composable
fun CardTest()
{

    Card(elevation = 10.dp,
        modifier = Modifier
        .fillMaxSize(.4f)
        .padding(10.dp) )
    {
        Image(painter = painterResource(id = R.drawable.tux), contentDescription = "Tux" , modifier = Modifier.fillMaxSize())

    }
}


@Composable
@Preview(showSystemUi = true, showBackground = true)
fun PreviewCard()
{
    CardTest()
}