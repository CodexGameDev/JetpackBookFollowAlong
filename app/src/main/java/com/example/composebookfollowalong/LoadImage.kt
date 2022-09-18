package com.example.composebookfollowalong
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import coil.ImageLoader
import coil.compose.ImagePainter
import coil.compose.rememberImagePainter
import coil.request.ImageRequest
import coil.size.Scale
import coil.transform.CircleCropTransformation
import com.example.composebookfollowalong.ui.theme.imageButton
import java.net.URL

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


@Composable
fun LoadImage2( intVersion : Int, URLval : String , returnVal : (String) -> Unit )
{

    var painterVar = rememberImagePainter(
    data = URLval)

    Image(painter = painterVar  ,
        contentDescription = URLval,
        modifier = Modifier.clickable
        {
            var temp = URLval.substring(0,URLval.length-1)
            temp += intVersion

            returnVal(temp)
        }
    )


}

fun ResetImage(remember1ImagePainter : ImagePainter)
{

}