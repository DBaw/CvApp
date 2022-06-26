package com.example.cvapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Color(0xFFE7DE34),
    primaryVariant = Color(0xCD635F26),
    secondary = Color(0xFF0E0E0E),
    background = Color(0xFF0C0C0C),
    surface = Color(0xCDFFF200),
    error = Color.Red,
    onPrimary = Color.Black,
    onSecondary = Color.Black,
    onBackground = Color(0xCDD6CF69),
    onSurface = Color(0xFF383507),
    onError = Color.Black
)

private val LightColorPalette = lightColors(
    primary = Color(0xFF021279),
    primaryVariant = Color(0xCD12228D),
    secondary = Color(0xFFEBE9E7),
    background = Color(0xFFF7F5F4),
    surface = Color(0xFF2138E0),
    error = Color.Red,
    onPrimary = Color.Black,
    onSecondary = Color.White,
    onBackground = Color(0xCD04092C),
    onSurface = Color(0xFF021279),
    onError = Color.White
)

@Composable
fun CvAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }
    CompositionLocalProvider(LocalPadding provides Padding()) {
        MaterialTheme(
            colors = colors,
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}