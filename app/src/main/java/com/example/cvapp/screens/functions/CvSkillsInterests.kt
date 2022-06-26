package com.example.cvapp.screens.functions


import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cvapp.ui.theme.padding

@Composable
fun CvSkillsInterestsData(text: String, image: Painter ?= null, icon: Boolean = false, head: Boolean = false) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = MaterialTheme.padding.big)
    ) {

        Text(
            text = text,
            color = if (!head) MaterialTheme.colors.primary else MaterialTheme.colors.onBackground,
            fontSize = if (!head) MaterialTheme.typography.h6.fontSize else MaterialTheme.typography.h5.fontSize,
            fontFamily = if (!head) MaterialTheme.typography.h4.fontFamily else MaterialTheme.typography.h6.fontFamily,
            fontWeight = if (!head) FontWeight.Normal else FontWeight.Bold,
            letterSpacing = if (!head) 1.sp else 3.sp,
            modifier = Modifier
                .padding(
                    top = if (!head) MaterialTheme.padding.small else MaterialTheme.padding.big,
                    bottom = MaterialTheme.padding.medium
                )
        )
        if (image != null) {
            Icon(
                painter = image,
                contentDescription = null,
                tint = if(icon) {MaterialTheme.colors.onBackground} else Color.Unspecified,
                modifier = Modifier.size(30.dp)
            )
        }
    }
}