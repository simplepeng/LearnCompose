@file:OptIn(ExperimentalMaterial3Api::class)

package me.simple.compose.pages

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.simple.compose.App
import me.simple.compose.AppPreview

@AppPreview
@Composable
fun TextFiledPage() {
    val state = rememberScrollState()
    Column(modifier = Modifier.verticalScroll(state)) {
        TextFiledSample()
        OutlineTextFiledSample()
        BasicTextFieldSample()
        TextStyleTextFiled()
        EnableTextFiled()
        ReadOnlyTextFiled()
        LabelTextFiled()
        KeyboardOptionsTextFiled()
        KeyboardActionsTextFiled()
        LinesTextFiled()
        MaxLengthTextFiled()
        VisualTransformationTextFiled()
        OnTextLayoutTextFiled()
        InteractionSourceTextFiled()
        CursorBrushTextFiled()
        DecorationBoxTextFiled()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFiledSample() {
    var value by remember {
        mutableStateOf("Hello")
    }
    TextField(
        value = value,
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
    OutlinedTextField(
        value = value,
        onValueChange = {
            value = it
        })
}

@Composable
fun BasicTextFieldSample() {
    var value by remember {
        mutableStateOf("Hello")
    }
    BasicTextField(
        value = value,
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
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .padding(vertical = 5.dp),
        //兼容性不行，有些键盘都没适配，比如百度输入法
        keyboardOptions = KeyboardOptions(
            capitalization = KeyboardCapitalization.Characters,
            keyboardType = KeyboardType.Password,
            imeAction = ImeAction.Go
        )
    )
}

@Composable
fun KeyboardActionsTextFiled() {
    var value by remember {
        mutableStateOf("KeyboardActions")
    }
    BasicTextField(
        value = value,
        onValueChange = {
            value = it
        },
        keyboardOptions = KeyboardOptions(
            capitalization = KeyboardCapitalization.Characters,
            keyboardType = KeyboardType.Password,
            imeAction = ImeAction.Go
        ),
        //需要搭配keyboardOptions
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
            }),
//        keyboardActions = KeyboardActions(onAny = {
//            App.toast("onAny")
//        }),
    )
}

@Composable
fun LinesTextFiled() {
    var value by remember {
        mutableStateOf("Lines")
    }
    BasicTextField(
        value = value,
        onValueChange = {
            value = it
        },
        maxLines = 3,
        minLines = 2
    )
}

@Composable
fun MaxLengthTextFiled() {
    val maxLength = 15
    var value by remember {
        mutableStateOf("MaxLength")
    }
    BasicTextField(
        value = value,
        onValueChange = {
            if (it.length <= maxLength) {
                value = it
            }
        },
    )
}

//VisualTransformation 视觉转换
@Composable
fun VisualTransformationTextFiled() {
    var value by remember {
        mutableStateOf("VisualTransformation")
    }
    BasicTextField(
        value = value,
        onValueChange = {
            value = it
        },
        visualTransformation = {
            TransformedText(
                AnnotatedString("*".repeat(it.text.length)),
                OffsetMapping.Identity
            )
        }
    )
}

@Composable
fun OnTextLayoutTextFiled() {
    var value by remember {
        mutableStateOf("OnTextLayout")
    }
    BasicTextField(
        value = value,
        onValueChange = {
            value = it
        },
        onTextLayout = {

        }
    )
}

@Composable
fun InteractionSourceTextFiled() {
    var value by remember {
        mutableStateOf("InteractionSource")
    }
    BasicTextField(
        value = value,
        onValueChange = {
            value = it
        },
        interactionSource = MutableInteractionSource()
    )
}

@Composable
fun CursorBrushTextFiled() {
    var value by remember {
        mutableStateOf("CursorBrush")
    }
    BasicTextField(
        value = value,
        onValueChange = {
            value = it
        },
        cursorBrush = SolidColor(Color.Green)
    )
}

@Composable
fun DecorationBoxTextFiled() {
    var value by remember {
        mutableStateOf("DecorationBox")
    }
    BasicTextField(
        value = value,
        onValueChange = {
            value = it
        },
        decorationBox = {

        }
    )
}

@Composable
fun EnableTextFiled() {
    var value by remember {
        mutableStateOf("EnableTextFiled")
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
        mutableStateOf("ReadOnlyTextFiled")
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

