package me.simple.compose.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.simple.compose.AppPreview
import me.simple.compose.helpers.LogHelper

@Composable
fun TextPage() {
    Column {
        HelloWorld()
        TextSizeSample()
        FontStyleSample()
        FontFamilySample()
        LetterSpacingSample()
        TextDecorationSample()
        TextAlignSample()
//        JustifyTextAlignSample()
        LineHeightSample()
//        OverFlowSample()
    }
}

@Composable
fun BasicTextSample() {
    BasicText(text = "BasicTextSample")
}

@Composable
fun BasicTextAnnotatedStringSample() {
    BasicText(text = buildAnnotatedString {
        withStyle(style = SpanStyle(color = Color.Blue)) {
            append("H")
        }
        append("ello ")

        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color.Red)) {
            append("W")
        }
        append("orld")
    })
}

@Composable
fun BasicTextTextStyle() {
    BasicText(
        text = "BasicTextTextStyle",
        style = TextStyle.Default
    )
}

@Composable
fun HelloWorld() {
    Text(
        text = "Hello World",
    )
}

@Composable
fun TextSizeSample() {
    Text(
        text = "TextSize",
        color = Color.Red,
        fontSize = 15.sp
    )
}

@Composable
fun FontStyleSample() {
    Text(
        text = "Text FontStyle is Italic",
        fontStyle = FontStyle.Italic
    )
}

@Composable
fun FontFamilySample() {
    Text(
        text = "FontFamily Text",
        fontFamily = FontFamily.SansSerif
    )
}

@Composable
fun LetterSpacingSample() {
    Text(
        text = "LetterSpacing Text",
        letterSpacing = 2.sp
    )
}

@Composable
fun TextDecorationSample() {
    Text(
        text = "TextDecoration",
//        textDecoration = TextDecoration.Underline,
//        textDecoration = TextDecoration.LineThrough,
        textDecoration = TextDecoration.None,
    )
}

@Composable
fun TextAlignSample() {
    Text(
        text = "TextAlign",
        modifier = Modifier.fillMaxWidth(),
//        textAlign = TextAlign.End,
        textAlign = TextAlign.Center,
    )
}

@Composable
fun JustifyTextAlignSample() {
    Text(
        text = "TextAlign Justify Test,TextAlign Justify Test,TextAlign Justify Test,TextAlign Justify Test,TextAlign Justify Test,TextAlign Justify Test,TextAlign Justify Test,TextAlign Justify Test,TextAlign Justify Test,",
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Justify,
    )
}

@Composable
fun LineHeightSample() {
    Text(
        text = "Line Height Test ".repeat(10),
        fontSize = 15.sp,
        lineHeight = 20.sp
    )
}

@AppPreview
@Composable
fun OverFlowSample() {
    Text(
        text = "Over Flow Test".repeat(10),
//        overflow = TextOverflow.Ellipsis,
//        overflow = TextOverflow.Clip,
        overflow = TextOverflow.Visible,
        maxLines = 2
    )
}

@AppPreview
@Composable
fun OnTextLayoutSample() {
    var text by remember {
        mutableStateOf("hello")
    }
    Column {
        Text(text = text,
            onTextLayout = { textLayoutResult ->
                LogHelper.debug("textLayoutResult = $textLayoutResult")
            })
        Button(onClick = {
            text += " world"
        }) {
            Text(text = "Add")
        }
    }
}