package com.example.cvapp


import android.util.Log
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.cvapp.patterns.*
import com.example.cvapp.screens.*
import com.example.cvapp.screens.data.Feature
import com.example.cvapp.screens.data.FeatureItem
import com.example.cvapp.screens.data.SelectenScreen


@ExperimentalMaterialApi
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CvScreen(navController: NavController, features: List<Feature>) {
    BoxWithConstraints(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colors.background)) {

        var screens by remember{
            mutableStateOf(SelectenScreen.Default.screen)
        }
        var title by remember{
            mutableStateOf("")
        }
        var selected by remember {
            mutableStateOf(false)
        }

        selected = screens == title

        val scrollState = rememberScrollState()
        val navHeight = maxHeight/3
        val width = constraints.maxWidth.toFloat()
        val height = constraints.maxHeight.toFloat()
        val patternColor = MaterialTheme.colors.secondary


        Canvas(modifier = Modifier.fillMaxSize()) {
            drawPath(
                path = randomPatternPath(width,height),
                color = patternColor
            )}
        Column{
            LazyVerticalGrid(
                cells = GridCells.Fixed(3),
                contentPadding = PaddingValues(8.dp),
                modifier = Modifier.height(navHeight)
            ) {

                items(features.size) {
                    FeatureItem(
                        feature = features[it],
                        selectedItem = if (features[it].title == title) selected else false,
                        title = { title = it },
                        screen = { screens = it }
                    )
                }
            }

            Column(Modifier.verticalScroll(scrollState)) {
                when(screens){
                    SelectenScreen.Default.screen-> {}
                    SelectenScreen.Inf.screen -> InfoScreen()
                    SelectenScreen.Exp.screen -> ExperienceScreen()
                    SelectenScreen.Edu.screen -> EducationScreen()
                    SelectenScreen.Skill.screen -> SkillsScreen()
                    SelectenScreen.Int.screen -> InterestsScreen()
                    SelectenScreen.Cont.screen -> ContactScreen()
                }
            }

        }

        }
    }