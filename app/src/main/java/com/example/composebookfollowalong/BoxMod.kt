import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.composebookfollowalong.R

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


        )


        Box(modifier = Modifier
            .size(height = currSize.value.dp, width = 100.dp)
            .background(colorResource(id = R.color.purple_700))
            .clickable {
                if (currSize.value != 100) {
                    currSize.value -= 100
                }
            }


        )



    }
}
}
