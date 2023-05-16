package me.simple.compose.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import me.simple.compose.AppPreview
import me.simple.compose.R

//https://developer.android.com/jetpack/compose/graphics/images
@Composable
fun ImagePage() {
    val state = rememberScrollState()
    Column(modifier = Modifier.verticalScroll(state)) {
        ImageWithPainter()
        ImageWithVector()
        ImageWithImageBitmap()
        ImageAlignment()
        ImageContentScale()
        ImageCircleClip()
        ImageColorFilter()
    }
}

@AppPreview
@Composable
fun ImageWithPainter() {
    Image(
        painter = painterResource(id = R.drawable.ic_app_empty),
        contentDescription = null
    )
}

@AppPreview
@Composable
fun ImageWithVector() {
    Image(
        imageVector = Icons.Default.Face,
        contentDescription = null
    )
}

@AppPreview
@Composable
fun ImageWithImageBitmap() {
    Image(
        bitmap = ImageBitmap.imageResource(id = R.drawable.ic_app_empty),
        contentDescription = null
    )
}

@AppPreview
@Composable
fun ImageAlignment() {
    Image(
        painter = painterResource(id = R.drawable.ic_app_empty),
        contentDescription = null,
        modifier = Modifier
            .size(100.dp)
            .background(Color.Black),
        alignment = Alignment.TopEnd
    )
}

@AppPreview
@Composable
fun ImageContentScale() {
    Image(
        painter = painterResource(id = R.drawable.ic_app_empty),
        contentDescription = null,
        modifier = Modifier
            .size(150.dp)
            .background(Color.Yellow),
        contentScale = ContentScale.FillWidth
    )
}

@AppPreview
@Composable
fun ImageCircleClip() {
    Image(
        painter = painterResource(id = R.drawable.ic_dog),
        contentDescription = null,
        modifier = Modifier
            .size(150.dp)
            .clip(CircleShape),
        contentScale = ContentScale.Crop,
    )
}

@AppPreview
@Composable
fun ImageColorFilter() {
    Image(
        painter = painterResource(id = R.drawable.ic_dog),
        contentDescription = null,
        modifier = Modifier
            .size(150.dp)
            .clip(CircleShape),
        contentScale = ContentScale.Crop,
//        colorFilter = ColorFilter.tint(Color.Red, blendMode = BlendMode.Darken)
        colorFilter = ColorFilter.lighting(Color.White, Color.Black)
    )
}