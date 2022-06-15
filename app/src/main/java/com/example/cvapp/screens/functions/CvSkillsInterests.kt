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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.cvapp.ui.theme.Paddings

@Composable
fun cvSkillsInterestsData(text: String, head: Boolean = false){
    Row(
        horizontalArrangement = if (!head) {
            Arrangement.Start
        } else Arrangement.Center,
        verticalAlignment = Alignment.Top,
        modifier = Modifier.fillMaxWidth()
    ) {

        Text(
            text = if (!head) {
                "- $text"
            } else text,
            color = MaterialTheme.colors.onBackground,
            style = if (!head) {MaterialTheme.typography.body1} else MaterialTheme.typography.h5,
            //fontWeight = if (!head) {
            //    FontWeight.SemiBold
            //} else FontWeight.Bold,
            modifier = Modifier.padding(
                horizontal = Paddings.Big.padding,
                vertical = if (!head) {
                    Paddings.Small.padding
                } else Paddings.Big.padding
            )
        )
    }
}