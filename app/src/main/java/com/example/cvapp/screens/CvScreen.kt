package com.example.cvapp


import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.cvapp.patterns.*
import com.example.cvapp.screens.data.Feature
import com.example.cvapp.screens.data.FeatureItem



@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CvScreen(navController: NavController, features: List<Feature>) {
    BoxWithConstraints(modifier = Modifier.fillMaxSize()
        .background(MaterialTheme.colors.background)) {

        val width = constraints.maxWidth.toFloat()
        val height = constraints.maxHeight.toFloat()
        val patternColor = MaterialTheme.colors.secondary


        Canvas(modifier = Modifier.fillMaxSize()) {
            drawPath(
                path = randomPatternPath(width,height),
                color = patternColor
            )}

        LazyVerticalGrid(
            cells = GridCells.Fixed(2),
            contentPadding = PaddingValues(8.dp),
            modifier = Modifier
                .fillMaxHeight()
                //.background(MaterialTheme.colors.background)
        ) {

            items(features.size) {
                FeatureItem(feature = features[it], navController = navController)
            }
        }

    }
}