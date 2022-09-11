import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composebookfollowalong.R
import java.net.URLStreamHandler

@Composable
fun BoxMod()
{
    var currSize = remember {
        mutableStateOf(100)
    }
Column() {


    Row(horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth()) {


        Box(modifier = Modifier
            .size(height = currSize.value.dp, width = 100.dp)
            .background(colorResource(id = R.color.purple_700))
            .clickable {
                currSize.value += 100
            }
            .padding(15.dp)
            .clip(shape = GenericShape { size, _ ->
                // 1)
                moveTo(size.width / 2f, 0f)

                // 2)
                lineTo(size.width, size.height)

                // 3)
                lineTo(0f, size.height)
            })
            .background(colorResource(id = R.color.teal))


        )

        

        Box(modifier = Modifier
            .size(height = currSize.value.dp, width = 100.dp)
            .background(colorResource(id = R.color.purple_700))
            .padding(12.dp)
            .clip(CircleShape)
            .background(Color.Red)
            .clickable {
                if (currSize.value != 100) {
                    currSize.value -= 100
                }
            }


        )



    }
}
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview()
{
    BoxMod()

}