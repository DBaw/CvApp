package com.example.cvapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Color(0xFFB3AA08),
    primaryVariant = Color(0xCD7E7704),
    secondary = Color(0xFF0E0E0E),
    background = Color(0xFF0C0C0C),
    surface = Color(0xCD413E04),
    error = Color.Red,
    onPrimary = Color.Black,
    onSecondary = Color.Black,
    onBackground = Color.White,
    onSurface = Color(0xFFADABA9),
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
    onBackground = Color.Black,
    onSurface = Color(0xFF000000),
    onError = Color.White
)

@Composable
fun CvAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}