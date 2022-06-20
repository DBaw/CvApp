package com.example.cvapp.screens.functions

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cvapp.ui.theme.Paddings

@Composable
fun CvSkillsInterestsData(text: String, head: Boolean = false){
    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.Top,
        modifier = Modifier.fillMaxWidth()
    ) {

        Text(
            text = text,
            color = MaterialTheme.colors.onBackground,
            fontSize = if (!head) MaterialTheme.typography.h6.fontSize else MaterialTheme.typography.h4.fontSize,
            fontWeight = if (!head) FontWeight.Medium else FontWeight.Bold,
            letterSpacing = if (!head) 1.sp else 3.sp,
            modifier = Modifier.padding(
                horizontal = Paddings.Big.padding
            )
                .padding(
                    top = if (!head) Paddings.Small.padding else Paddings.Big.padding,
                    bottom = if (!head) Paddings.Medium.padding else Paddings.Medium.padding
                )
        )
    }
}