package com.example.cvapp.screens.functions

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.cvapp.ui.theme.Paddings

@Composable
fun ExpEduData(
    mainText: String? = null,
    description: String? = null,
    head: String? = null,
    icon: Painter? = null,
    responsibilities: String? = null
) {
    if (responsibilities == null) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = if (head != null) Paddings.Big.padding else Paddings.Large.padding,
                    end = if (head != null) Paddings.Big.padding else Paddings.Large.padding,
                    top = if (head != null) Paddings.Large.padding else Paddings.Medium.padding,
                    bottom = if (head != null) Paddings.Medium.padding else Paddings.Small.padding,
                ),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = head ?: "$mainText :",
                fontWeight = FontWeight.Bold,
                fontSize = if (head == null) MaterialTheme.typography.h5.fontSize else MaterialTheme.typography.h4.fontSize,
                fontFamily = if (head == null) MaterialTheme.typography.h6.fontFamily else MaterialTheme.typography.h4.fontFamily,
                letterSpacing = MaterialTheme.typography.body2.letterSpacing,
                color = MaterialTheme.colors.onBackground,
            )
            if (head == null) {
                if (description != null) {
                    Text(
                        text = description,
                        fontWeight = FontWeight.Normal,
                        fontSize = MaterialTheme.typography.h6.fontSize,
                        color = MaterialTheme.colors.onBackground,
                        textAlign = TextAlign.End
                    )
                }
            } else {
                if (icon != null) {
                    Icon(painter = icon, contentDescription = "$head", Modifier.size(40.dp))
                }
            }
        }
    } else {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = Paddings.Big.padding,
                    end = Paddings.Big.padding,
                    top = Paddings.Large.padding,
                    bottom = Paddings.Big.padding
                ),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Responsibilities :",
                fontWeight = FontWeight.Bold,
                fontSize = MaterialTheme.typography.h5.fontSize,
                fontFamily = MaterialTheme.typography.h6.fontFamily,
                letterSpacing = MaterialTheme.typography.body2.letterSpacing,
                color = MaterialTheme.colors.onBackground,
            )
            Text(
                text = responsibilities,
                fontWeight = FontWeight.Normal,
                fontSize = MaterialTheme.typography.h6.fontSize,
                color = MaterialTheme.colors.onBackground,
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(vertical = Paddings.Medium.padding, horizontal = Paddings.Big.padding)
            )
        }
    }
}