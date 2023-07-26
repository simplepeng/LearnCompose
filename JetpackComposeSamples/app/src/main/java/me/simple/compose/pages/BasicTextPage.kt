package me.simple.compose.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import java.time.format.TextStyle

@Composable
fun BasicTextPage() {
    Column {
        BasicText(text = "Hello BasicText")
        TextStyleBasicText()
        OnTextLayoutBasicText()
        OverflowBasicText()
    }
}

@Composable
fun TextStyleBasicText() {
    BasicText(
        text = "TextStyleBasicText",
        style = androidx.compose.ui.text.TextStyle(
            color = Color.Red,
            fontSize = 14.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Medium
        )
    )
}

@Composable
fun OnTextLayoutBasicText() {
    var text by remember {
        mutableStateOf("onTextLayout")
    }
    var layoutResult by remember {
        mutableStateOf("")
    }
    Column {
        BasicText(text = text,
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 14.sp
            ),
            onTextLayout = {
                layoutResult = it.toString()
            })
        Button(onClick = {
            text += "A"
        }) {
            Text(text = "add Text")
        }
        BasicText(
            text = layoutResult,
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 12.sp
            ),
        )
    }
}

@Composable
fun OverflowBasicText() {
    BasicText(
        text = "OverflowBasicText",
        overflow = TextOverflow.Ellipsis,
        maxLines = 2
    )
}