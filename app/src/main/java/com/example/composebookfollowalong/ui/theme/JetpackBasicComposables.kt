package com.example.composebookfollowalong.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebookfollowalong.R


@Composable
fun ButtonTestingAndText()
{
    Button(onClick = { /*TODO*/ },

        modifier = Modifier
            .fillMaxHeight(.1f)
            .fillMaxWidth(.4f)

        ,
        colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id =   R.color.teal)),
        shape = RoundedCornerShape(20)

    ) {


        Text(text = "Click Me", textAlign = TextAlign.Right, color = colorResource(id = R.color.purple_700), fontSize = 20.sp, fontWeight = FontWeight.Bold)



    }



}


@Composable
//@Preview (    name = "BlueBox" , showSystemUi = true)
fun BlueBoxPrev(

)
{
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Blue))
    {
        Text(text = "Test")
    }
}


@Composable
//@Preview (    name = "RedBox" , showSystemUi = true)
fun RedBoxPrev(

)
{
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Red))
    {
        Text(text = "Test")
    }
}






@Composable
fun tuxButton()
{
    androidx.compose.material.Button(onClick = { /*TODO*/ },
        modifier = Modifier

            .fillMaxHeight(.4f)
            .fillMaxWidth(.5f),
        colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.teal_700))

    )
    {
        Column(
            modifier = Modifier
                .fillMaxSize()
            ,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        )
        {
            Image(painter = painterResource(id = R.drawable.tux), contentDescription = "Tux Image")
            Text(text = "Click on Tux!!")
        }
    }
}

@Composable
fun imageButton()
{

    androidx.compose.material.Button(onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.teal))

    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = 5.dp, bottom = 5.dp)

        ) {
            Image(painter = painterResource(id = R.drawable.tux), "Tux Is Happy")
            Text(text = "Click the happy penguin", fontSize = 23.sp)

        }
    }
}




@Composable
fun imgButton()
{

    //Full screen tux button with text

    Button(onClick = { /*TODO*/ },
        modifier = Modifier,
        colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.teal_200) )

    )
    {

        Column(
            modifier = Modifier
                .fillMaxSize()
            ,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center


        ) {
            Image( painter = painterResource(id = R.drawable.tux), "Tux")
            Text(text = "This is Tux Click Him!")
        }
    }


}





