package com.example.cvapp.screens



import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity


@ExperimentalMaterialApi
@Composable
fun ProjectsScreen() {
    Box(
        modifier = Modifier
            .background(MaterialTheme.colors.background)
            .fillMaxSize()
    ){
        var url = "https://github.com/DBaw/CvApp"
        Card(
            modifier = Modifier
                .padding(15.dp)
                .defaultMinSize(minHeight = 150.dp)
                .fillMaxWidth()
                .align(Alignment.TopCenter),
            shape = RoundedCornerShape(10.dp),
            backgroundColor = MaterialTheme.colors.background,
            elevation = 3.dp,
            onClick = {}
        ) {
            Image(
                painter = if (isSystemInDarkTheme()) {
                    painterResource(id = com.example.cvapp.R.drawable.unitconverterdark)
                } else {
                    painterResource(id = com.example.cvapp.R.drawable.unitconverterlight)
                },
                contentDescription = "Change",
                contentScale = ContentScale.FillWidth
            )
        }

    }
}