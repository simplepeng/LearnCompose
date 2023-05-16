@file:OptIn(ExperimentalMaterial3Api::class)

package me.simple.compose.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import me.simple.compose.App
import me.simple.compose.AppPreview

@AppPreview
@Composable
fun TextFiledPage() {
    Column {
        TextFiledSample()
        OutlineTextFiledSample()
        BasicTextFieldSample()
        TextStyleTextFiled()
        EnableTextFiled()
        ReadOnlyTextFiled()
        LabelTextFiled()
        KeyboardOptionsTextFiled()
        KeyboardActionsTextFiled()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFiledSample() {
    var value by remember {
        mutableStateOf("Hello")
    }
    TextField(value = value,
        onValueChange = {
            value = it
        })
}

@Composable
fun TextFiledSample2() {

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OutlineTextFiledSample() {
    var value by remember {
        mutableStateOf("Hello")
    }
    OutlinedTextField(value = value,
        onValueChange = {
            value = it
        })
}

@Composable
fun BasicTextFieldSample() {
    var value by remember {
        mutableStateOf("Hello")
    }
    BasicTextField(value = value,
        onValueChange = {
            value = it
        })
}

@Composable
fun TextStyleTextFiled() {
    var value by remember {
        mutableStateOf("TextStyle")
    }
    BasicTextField(
        value = value,
        onValueChange = {
            value = it
        },
        textStyle = TextStyle(
            color = Color.Red,
            fontSize = 18.sp
        )
    )
}

@Composable
fun KeyboardOptionsTextFiled() {
    var value by remember {
        mutableStateOf("KeyboardOptions")
    }
    BasicTextField(
        value = value,
        onValueChange = {
            value = it
        },
        keyboardOptions = KeyboardOptions()
    )
}

@Composable
fun KeyboardActionsTextFiled() {
    var value by remember {
        mutableStateOf("KeyboardOptions")
    }
    BasicTextField(
        value = value,
        onValueChange = {
            value = it
        },
        keyboardActions = KeyboardActions(
            onDone = {
                App.toast("onDone")
            },
            onGo = {
                App.toast("onGo")
            },
            onNext = {
                App.toast("onNext")
            },
            onPrevious = {
                App.toast("onPrevious")
            },
            onSearch = {
                App.toast("onSearch")
            },
            onSend = {
                App.toast("onSend")
            })
//        keyboardActions = KeyboardActions(onAny = {
//
//        }),
    )
}

@Composable
fun EnableTextFiled() {
    var value by remember {
        mutableStateOf("Hello")
    }
    TextField(
        value = value,
        onValueChange = {
            value = it
        },
        enabled = false
    )
}

@Composable
fun ReadOnlyTextFiled() {
    var value by remember {
        mutableStateOf("Hello")
    }
    TextField(
        value = value,
        onValueChange = {
            value = it
        },
        readOnly = true
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LabelTextFiled() {
    var value by remember {
        mutableStateOf("Hello")
    }
    TextField(
        value = value,
        onValueChange = {
            value = it
        },
        label = {
            Text(text = "Label")
        }
    )
}

