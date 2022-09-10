package com.example.composebookfollowalong

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.core.animate
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideIn
import androidx.compose.animation.slideOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.rotationMatrix
import java.security.cert.TrustAnchor
import kotlin.random.Random

//ToDo Create column test for the alignment and arrangment bc I am a bit confused about it.
@Composable
fun RowTest()
{
    var rotation = remember {
        mutableStateOf(0f)
    }

        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxSize()) {

            Column() {
                Text(text = "Text 1")
            }
            Column() {
                Text(text = "Text 2")
            }


              Column() {
                  Box(
                      modifier = Modifier
                          .fillMaxWidth(.2f)
                          .fillMaxHeight(.1f)
                  )
                  {
                      Image(
                          painter = painterResource(id = R.drawable.tux),
                          contentDescription = "Tux",
                          contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .clickable {
                                rotation.value += 90f

                            }
                            .rotate(rotation.value)
                      )
                  }
              }

        }


}


@Composable
fun ColumnTest()
{
    var rotation1 = remember {
        mutableStateOf(0f)
    }
    var rotation2 = remember {
        mutableStateOf(0f)
    }
    var rotation3 = remember {
        mutableStateOf(0f)
    }
    var color : Color = colorResource(R.color.teal)
    if(rotation1.value > 200f)
    {
        color = colorResource(R.color.white)
    }



    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(color)





    )
    {


            Text("Text 1", modifier = Modifier.rotate(rotation3.value))


            Text("Text 2", modifier = Modifier.rotate(rotation2.value))


           Box(modifier = Modifier.fillMaxSize(.1f)){
               Image(painter = painterResource(id = R.drawable.tux), contentDescription = "Tux", contentScale = ContentScale.Fit, modifier = Modifier
                   .clickable
                   {

                       rotation1.value = Random.nextFloat() * 360
                       rotation2.value = Random.nextFloat() * 360
                       rotation3.value = Random.nextFloat() * 360


                   }
                   .rotate(rotation1.value)
               )

    }


            if(rotation2.value > 200f)
            {

                Text(text = "200+ Achieved!!!!!!!!!!!!!!!" , fontSize = 30.sp)
            }

    }
}



@Composable
@Preview(showBackground = true, showSystemUi = true)
fun Preview()
{
    ColumnTest()
}