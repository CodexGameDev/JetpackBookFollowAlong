
package com.example.composebookfollowalong

import android.graphics.ColorFilter
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.nio.file.Files.size
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

Column(
    modifier = Modifier
        .fillMaxSize()

) {

    Column() {


          colorChangingBox()

            }
        }
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
fun colorChangingBox()
{
  var color =  remember {
        mutableStateOf(Color.Red)
    }

    Box(modifier = Modifier.background(color.value).fillMaxSize()
        .clickable {
            color.value = Color(Random.nextFloat(),Random.nextFloat(),Random.nextFloat())

        }

        )

}


