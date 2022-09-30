package com.example.composebookfollowalong

import android.text.Layout
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.intellij.lang.annotations.JdkConstants


@Composable
fun FadedText(notFaded : String, faded : String)
{
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
        Text(text = notFaded )

        CompositionLocalProvider(LocalContentAlpha provides .3f) {
            Text(text = faded)

        }
    }
}

@Composable
fun FadedPyramid(stringsList : ArrayList<String>)
{
    var counter = 0
    Column(verticalArrangement = Arrangement.SpaceEvenly){

        while (counter < stringsList.size)
        {
            CompositionLocalProvider(LocalContentAlpha provides 1 /(counter.toFloat() + 1)) {

                Text(text = stringsList.get(counter))
            }
            counter += 1
        }
    }
}


@Composable
fun FadedArticle(textStuff : Article)
{

    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = textStuff.Alignment  )
    {
        Text(text = textStuff.heading, style = MaterialTheme.typography.h6)

        CompositionLocalProvider(LocalContentAlpha provides .9f) {
            Text(text = textStuff.body)
        }

    }

}

data class Article(var heading : String , var body : String, var Alignment  : Alignment.Horizontal )

fun defaultArticle() : Article
{
    return Article("Hurricane Ian live updates: Biden warns of 'substantial loss of life' as storm strengthens back into a hurricane", "President Joe Biden said Hurricane Ian may be responsible for \"substantial loss of life\" and could end up being the deadliest storm in Florida history.\n" + "\n" + "By Thursday night, the death toll had climbed to 12, although the state has refused to officially comment on deaths. " , Alignment.Start)
}