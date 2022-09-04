
package com.example.composebookfollowalong

import android.graphics.ColorFilter
import android.graphics.fonts.FontStyle
import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.nio.file.Files.size
import java.security.cert.TrustAnchor
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
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
    }
}



@Composable
fun colorChangingBox(colorUpdate : (Color) -> Unit)
{


    Box(modifier = Modifier
        .background(Color.Red)
        .fillMaxHeight(.5f)
        .fillMaxWidth()
        .clickable {
            colorUpdate(Color(Random.nextFloat(), Random.nextFloat(), Random.nextFloat()))

        }

    )

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
fun ClickToChangeColor(ChangeColor : (Color) -> Unit)
{
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Blue)
        .clickable {
            ChangeColor(
                Color(Random.nextFloat(), Random.nextFloat(), Random.nextFloat())
            )
        }


    )
    {


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

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewButonTesting()
{
    Box(modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.Center

    )
    {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {


        var textBoxVal = remember {
            mutableStateOf("")
        }
    EnterText()
    {
        textBoxVal.value = it
    }
        Text(text = textBoxVal.value)

    }
    }
}



@Composable
fun EnterText(returnVal : (String) -> Unit)
{
    var txtInput = remember {
        mutableStateOf("")
    }

    TextField(value = txtInput.value, onValueChange =  {
        txtInput.value = it
        returnVal(txtInput.value)



    }



    )



}