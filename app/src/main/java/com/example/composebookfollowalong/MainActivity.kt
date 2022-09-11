package com.example.composebookfollowalong
import android.icu.number.Scale
import android.os.Bundle
import android.view.Gravity.FILL
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation
import kotlinx.coroutines.launch


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
MovieItem(webImg = WebImg("coco" , "https://upload.wikimedia.org/wikipedia/commons/3/31/Made20bacon.png" ))
}





@Composable
fun MovieItem(webImg: WebImg) {



                Image(
                    painter = rememberImagePainter(
                        data = webImg.imageUrl,

                        builder = {
                            scale(coil.size.Scale.FILL)
                            placeholder(R.drawable.tux)
                            transformations(CircleCropTransformation())

                        }
                    ),
                    contentDescription = webImg.name,
                    modifier = Modifier
                        .fillMaxHeight()

                )






        }




