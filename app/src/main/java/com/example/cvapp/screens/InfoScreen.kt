package com.example.cvapp

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
import com.example.cvapp.screens.functions.CvInfoData
import com.example.cvapp.ui.theme.padding

@Composable
fun InfoScreen() {
    BoxWithConstraints(
        modifier = Modifier
            .background(Color.Transparent)
            .fillMaxSize()
    ) {

        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "INFORMATION",
                color = MaterialTheme.colors.onBackground,
                fontWeight = FontWeight.Bold,
                fontSize = MaterialTheme.typography.h4.fontSize,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .padding(horizontal = MaterialTheme.padding.big, vertical = MaterialTheme.padding.big)
            )
            CvInfoData(name = "Name", "Dominik")
            CvInfoData(name = "Surname", "Bawołek")
            CvInfoData(name = "Date of birth", "21.01.1995")
            CvInfoData(name = "Adress", "Sucha Beskidzka\nMałopolskie")
            
            Spacer(modifier = Modifier.height(MaterialTheme.padding.doubleLarge))

        }
    }
}



