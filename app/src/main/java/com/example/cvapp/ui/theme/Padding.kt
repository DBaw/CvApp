package com.example.cvapp.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Padding(
    val default: Dp = 0.dp,
    val small: Dp = 4.dp,
    val medium: Dp = 8.dp,
    val big: Dp = 16.dp,
    val large: Dp = 32.dp,
    val doubleLarge: Dp = 64.dp
)

val LocalPadding = compositionLocalOf { Padding() }

val MaterialTheme.padding: Padding
    @Composable
    @ReadOnlyComposable
    get() = LocalPadding.current
