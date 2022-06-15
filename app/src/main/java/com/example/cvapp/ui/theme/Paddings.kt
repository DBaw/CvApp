package com.example.cvapp.ui.theme


import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

sealed class Paddings(val padding: Dp){
    object Small: Paddings(4.dp)
    object Medium: Paddings(8.dp)
    object Big: Paddings(16.dp)
    object Large: Paddings(32.dp)
    object DoubleLarge: Paddings(64.dp)
}
