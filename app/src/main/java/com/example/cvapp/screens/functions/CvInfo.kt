package com.example.cvapp.screens.functions

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cvapp.ui.theme.Paddings
import com.example.cvapp.ui.theme.Shapes

@Composable
fun CvInfoData(name: String, data: String) {
    Box(
        modifier = Modifier
            .padding(horizontal = Paddings.Big.padding, vertical = Paddings.Medium.padding)
            .clip(shape = Shapes.medium)
            .background(Color.Transparent)
    ) {
        Column() {
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .background(Color.Transparent)
                    .fillMaxWidth()
                    .padding(horizontal = Paddings.Big.padding)
                    .padding(top = Paddings.Medium.padding, bottom = Paddings.Small.padding)
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
                    .padding(horizontal = Paddings.Big.padding)
                    .padding(top = Paddings.Small.padding, bottom = Paddings.Medium.padding)
            ) {
                Text(
                    text = data,
                    fontWeight = FontWeight.Normal,
                    fontSize = MaterialTheme.typography.h6.fontSize,
                    color = MaterialTheme.colors.onBackground,
                    textAlign = TextAlign.End
                )

            }
        }

    }
}