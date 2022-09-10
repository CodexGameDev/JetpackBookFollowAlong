package com.example.composebookfollowalong

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.core.animate
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideIn
import androidx.compose.animation.slideOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.graphics.rotationMatrix
import java.security.cert.TrustAnchor

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
                        modifier = Modifier.clickable {
                            rotation.value += 90f

                        }
                            .rotate(rotation.value)
                      )
                  }
              }

        }


}






@Composable
@Preview(showBackground = true, showSystemUi = true)
fun Preview()
{
    RowTest()
}