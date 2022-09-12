package com.example.composebookfollowalong
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.compose.rememberImagePainter
import coil.size.Scale
import coil.transform.CircleCropTransformation

data class WebImg(val name: String, val imageUrl: String)


@Composable
fun ImageItem(webImg: WebImg) {

// This uses the coil library to create a persistent image ie. rememberImagePainter. This is used to query the webImg object URL that was passed to the function. Until it gets the image in return it shows the placeholder image.
    Image(
        painter = rememberImagePainter(
            data = webImg.imageUrl,

            builder = {
                scale(Scale.FILL)
                placeholder(R.drawable.tux)
                transformations(CircleCropTransformation())

            }
        ),
        contentDescription = webImg.name,
        modifier = Modifier
            .fillMaxHeight()

    )






}



@Composable
fun WebImgConstructor(name : String, url : String)
{
    ImageItem(webImg = WebImg(name , url ))
}

// To run put this code in main preview:
//WebImgConstructor("Bacon" , "https://media.istockphoto.com/id/1284240219/photo/tasty-fried-crispy-bacon-slices.webp?s=612x612&w=is&k=20&c=Lm_m6XwB9sU4ygqkm6GcgdZHyd8qVYethk58jlTow64=")