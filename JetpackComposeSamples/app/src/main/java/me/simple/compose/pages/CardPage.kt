package me.simple.compose.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable

@Composable
fun CardPage() {
    Column {
        CardSample()
        
    }
}

@Composable
fun CardSample() {
    Card {

    }
}

@Composable
fun ShapeCard() {
    Card(
        shape = CardDefaults.elevatedShape
    ) {

    }
}