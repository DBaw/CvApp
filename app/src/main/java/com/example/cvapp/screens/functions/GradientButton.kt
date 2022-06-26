package com.example.cvapp.screens.functions

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.cvapp.ui.theme.Shapes
import com.example.cvapp.ui.theme.padding

@Composable
fun GradientButton(
    text: String,
    icon: Painter,
    gradient: Brush,
    onClick: () -> Unit
){
    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent,
        ),
        contentPadding = PaddingValues(),
        shape = Shapes.large,
        onClick = {onClick()}) {
        Row(modifier = Modifier
            .background(gradient)
            //.border(border = BorderStroke(width = 0.7.dp, color = MaterialTheme.colors.primaryVariant), shape = Shapes.large)
            .padding(horizontal = MaterialTheme.padding.big, vertical = MaterialTheme.padding.medium)
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically){
            Text(text = text, color = MaterialTheme.colors.onPrimary , fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Icon(painter = icon, contentDescription = text, tint = MaterialTheme.colors.onBackground)

        }
    }
}