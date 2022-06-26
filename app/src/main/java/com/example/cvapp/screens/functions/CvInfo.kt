package com.example.cvapp.screens.functions

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.cvapp.ui.theme.Shapes
import com.example.cvapp.ui.theme.padding

@Composable
fun CvInfoData(name: String, data: String) {
    Box(
        modifier = Modifier
            .clip(shape = Shapes.medium)
            .background(Color.Transparent)
    ) {

        Column {
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .background(Color.Transparent)
                    .fillMaxWidth()
                    .padding(horizontal = MaterialTheme.padding.big)
                    .padding(top = MaterialTheme.padding.medium, bottom = MaterialTheme.padding.small)
            ) {
                Text(
                    text = "$name :",
                    fontWeight = FontWeight.Bold,
                    fontSize = MaterialTheme.typography.h5.fontSize,
                    fontFamily = MaterialTheme.typography.h6.fontFamily,
                    letterSpacing = MaterialTheme.typography.body2.letterSpacing,
                    color = MaterialTheme.colors.onBackground
                )
            }
            Row(
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .background(Color.Transparent)
                    .fillMaxWidth()
                    .padding(horizontal = MaterialTheme.padding.big)
                    .padding(top = MaterialTheme.padding.big, bottom = MaterialTheme.padding.medium)
            ) {
                Text(
                    text = data,
                    fontWeight = FontWeight.Normal,
                    fontSize = MaterialTheme.typography.h6.fontSize,
                    color = MaterialTheme.colors.primary,
                    textAlign = TextAlign.End
                )

            }
        }

    }
}