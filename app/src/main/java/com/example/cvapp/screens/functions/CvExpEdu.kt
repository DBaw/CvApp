package com.example.cvapp.screens.functions

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.cvapp.ui.theme.Paddings



@Composable
fun CvExpEduData(name: String, data: String, top: Boolean = false){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = if (!top) {Alignment.CenterVertically} else Alignment.Top,
        modifier = Modifier
            .background(Color.Transparent)
            .fillMaxWidth()
            .padding(horizontal = Paddings.Large.padding, vertical = Paddings.Small.padding)
    ) {
        Text(
            text = "$name :",
            fontWeight = FontWeight.Bold,
            fontSize = MaterialTheme.typography.h5.fontSize,
            fontFamily = MaterialTheme.typography.h6.fontFamily,
            letterSpacing = MaterialTheme.typography.body2.letterSpacing,
            color = MaterialTheme.colors.onBackground
        )
        Text(
            text = data,
            fontWeight = FontWeight.Normal,
            fontSize = MaterialTheme.typography.h6.fontSize,
            color = MaterialTheme.colors.onBackground,
            textAlign = TextAlign.End
        )
    }
}