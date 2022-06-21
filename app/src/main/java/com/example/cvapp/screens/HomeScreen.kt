package com.example.cvapp



import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.cvapp.patterns.randomPatternPath
import com.example.cvapp.screens.functions.Hyperlinks
import com.example.cvapp.ui.theme.Paddings

@Composable
fun HomeScreen() {
    BoxWithConstraints(
        modifier = Modifier
            .background(MaterialTheme.colors.background)
            .fillMaxSize()
    ) {

        val width = constraints.maxWidth.toFloat()
        val height = constraints.maxHeight.toFloat()
        val patternColor = MaterialTheme.colors.secondary

            Canvas(modifier = Modifier.fillMaxSize()) {
                drawPath(
                    path = randomPatternPath(width, height),
                    color = patternColor
                )
            }

                ConstraintLayout(modifier = Modifier.fillMaxHeight()){
                    val (header,text,hyperlink,spacer) = createRefs()

                Text(
                    text = "HELLO!",
                    fontWeight = FontWeight.Bold,
                    fontSize = MaterialTheme.typography.h4.fontSize,
                    letterSpacing = 3.sp,
                    color = MaterialTheme.colors.primary,
                    modifier = Modifier
                        .padding(
                            horizontal = Paddings.Big.padding
                        )
                        .padding(
                            top = Paddings.Big.padding,
                            bottom = Paddings.Medium.padding
                        )
                        .constrainAs(header) {
                            top.linkTo(parent.top)
                            start.linkTo(parent.start)
                        }
                )
                Text(
                    text = "Go through this app to know me better and to see some of my skills",
                    fontWeight = FontWeight.Medium,
                    fontSize = 22.sp,
                    color = MaterialTheme.colors.primary,
                    modifier = Modifier
                        .padding(horizontal = Paddings.Big.padding)
                        .constrainAs(text) {
                            top.linkTo(header.bottom)
                            start.linkTo(parent.start)
                        }
                )
                Hyperlinks(
                    text = "App was made with Kotlin and Jetpack Compose",
                    textAlign = TextAlign.End,
                    link = listOf(
                        "Kotlin",
                        "Jetpack Compose"
                    ),
                    hyperlinks = listOf(
                        "https://kotlinlang.org",
                        "https://developer.android.com/jetpack/compose"
                    ),
                    textColor = MaterialTheme.colors.primary,
                    linkColor = MaterialTheme.colors.onBackground,
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(
                            horizontal = Paddings.Big.padding,
                            vertical = Paddings.Big.padding
                        )
                        .constrainAs(hyperlink) {
                            bottom.linkTo(spacer.top)
                            end.linkTo(parent.end)
                        }
                )
                    Spacer(modifier = Modifier.size((height*0.025).dp)
                        .constrainAs(spacer){
                            bottom.linkTo(parent.bottom)
                            start.linkTo(parent.start)
                            end.linkTo(parent.end)
                        })
            }

        }
    }




