package me.simple.compose.pages

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ButtonPage() {
    Column {
        ButtonSample()
        EnableButton()
        ShapeButton()
        ColorsButton()
        ElevationButton()
        BorderButton()
        ContentPaddingButton()
        InteractionSourceButton()
    }
}

@Composable
fun ButtonSample() {
    Button(onClick = { }) {
        Text(text = "Button")
    }
}

@Composable
fun EnableButton() {
    Button(
        onClick = { },
        enabled = false
    ) {
        Text(text = "Enable Button")
    }
}

@Composable
fun ShapeButton() {
    Button(
        onClick = { },
        shape = RoundedCornerShape(10.dp)
    ) {
        Text(text = "Shape Button")
    }
}

//ButtonColors将用于解析该按钮在不同状态下的颜色
@Composable
fun ColorsButton() {
    Button(
        onClick = { },
        colors = ButtonDefaults.outlinedButtonColors()
    ) {
        Text(text = "Colors Button")
    }
}

@Composable
fun ElevationButton() {
    Button(
        onClick = { },
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 10.dp
        )
    ) {
        Text(text = "Elevation Button")
    }
}

@Composable
fun BorderButton() {
    Button(
        onClick = { },
        border = BorderStroke(2.dp, Color.Black)
    ) {
        Text(text = "Border Button")
    }
}

@Composable
fun ContentPaddingButton() {
    Button(
        onClick = { },
        contentPadding = PaddingValues(10.dp)
    ) {
        Text(text = "Border Button")
    }
}

@Composable
fun InteractionSourceButton() {
    Button(
        onClick = { },
        interactionSource = remember { MutableInteractionSource() }
    ) {
        Text(text = "Border Button")
    }
}



