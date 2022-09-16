import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composebookfollowalong.RandomTextLong

@Composable
fun AllText()
{
    Column(modifier = Modifier
        .fillMaxWidth()
        .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    )
    {
        HeadingText1(text = "Heading One")
        HeadingText2(text = "Heading Two")
        HeadingText3(text = "Heading Three")
        HeadingText4(text = "Heading Four")

        BodyText(RandomTextLong() , 15f)

    }
}



@Composable
fun HeadingText1(text : String)
{
    Text(text = text, style = MaterialTheme.typography.h1, modifier = Modifier, maxLines = 1)

}


@Composable
fun HeadingText2(text : String)
{
    Text(text = text, style = MaterialTheme.typography.h2, modifier = Modifier, maxLines = 1)


}
@Composable
fun HeadingText3(text : String)
{
    Text(text = text, style = MaterialTheme.typography.h3, modifier = Modifier, maxLines = 1)

}

@Composable
fun HeadingText4(text : String)
{
    Text(text = text, style = MaterialTheme.typography.h4, modifier = Modifier, maxLines = 1)

}
@Composable
fun BodyText(text: String , padding : Float)
{
    Text(text = text, style = MaterialTheme.typography.body1, modifier = Modifier
        .padding(top = padding.dp))
}