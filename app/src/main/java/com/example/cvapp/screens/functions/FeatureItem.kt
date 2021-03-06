package com.example.cvapp.screens.data


import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.cvapp.bars.data.NoRippleTheme
import com.example.cvapp.patterns.data.EdgeStartToEdgeEnd
import com.example.cvapp.patterns.patternPath
import com.example.cvapp.ui.theme.padding

@Composable
fun FeatureItem(
    feature: Feature,
    selectedItem: Boolean,
    title: (String) -> Unit,
    screen: (String) -> Unit
) {

    CompositionLocalProvider(LocalRippleTheme provides NoRippleTheme) {
        BoxWithConstraints(
            modifier = Modifier
                .padding(MaterialTheme.padding.medium)
                .aspectRatio(1.3f)
                .clip(RoundedCornerShape(10.dp))
                .background(if (selectedItem) feature.selectedDarkColor else feature.unselectedDarkColor)
                .clickable {
                    screen(feature.route)
                    title(feature.title)
                }
        ) {

                val width = constraints.maxWidth.toFloat()
                val height = constraints.maxHeight.toFloat()


                val firstColorPoint1 = Offset(0f, height * 0.42f)
                val firstColorPoint2 = Offset(width * 0.35f, height * 0.25f)
                val firstColorPoint3 = Offset(width * 0.65f, height * 0.75f)
                val firstColorPoint4 = Offset(width * 1.55f, 0f)

                val secondColorPoint1 = Offset(0f, height * 0.9f)
                val secondColorPoint2 = Offset(width * 0.35f, height * 0.4f)
                val secondColorPoint3 = Offset(width * 0.55f, height * 1.1f)
                val secondColorPoint4 = Offset(width * 1.4f, height)


                Canvas(modifier = Modifier.fillMaxSize()) {
                    drawPath(
                        path = patternPath(
                            points = listOf(
                                firstColorPoint1,
                                firstColorPoint2,
                                firstColorPoint3,
                                firstColorPoint4,
                            ),
                            width = width,
                            height = height,
                            startToEnd = EdgeStartToEdgeEnd.LEFTTORIGHT
                        ),
                        color = if (selectedItem)feature.selectedMediumColor else feature.unselectedMediumColor
                    )
                    drawPath(
                        path = patternPath(
                            points = listOf(
                                secondColorPoint1,
                                secondColorPoint2,
                                secondColorPoint3,
                                secondColorPoint4,
                            ),
                            width = width,
                            height = height,
                            startToEnd = EdgeStartToEdgeEnd.LEFTTORIGHT
                        ),
                        color = if (selectedItem)feature.selectedLightColor else feature.unselectedLightColor
                    )
                }
            ConstraintLayout(modifier = Modifier.fillMaxSize()) {

                val (text, icon) = createRefs()

                Text(
                    text = feature.title,
                    fontSize = MaterialTheme.typography.body2.fontSize,
                    fontWeight = MaterialTheme.typography.h6.fontWeight,
                    letterSpacing = MaterialTheme.typography.overline.letterSpacing,
                    fontFamily = MaterialTheme.typography.h6.fontFamily,
                    color = if (selectedItem)feature.selectedLightColor else feature.unselectedLightColor,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .padding(MaterialTheme.padding.small)
                        .constrainAs(text) {
                            top.linkTo(parent.top)
                            start.linkTo(parent.start)
                        }
                )

                Icon(
                    imageVector = feature.icon,
                    contentDescription = feature.title,
                    tint = if (selectedItem)feature.selectedDarkColor else feature.unselectedDarkColor,
                    modifier = Modifier
                        .padding(MaterialTheme.padding.small)
                        .size((height / 11).dp)
                        .constrainAs(icon) {
                            bottom.linkTo(parent.bottom)
                            end.linkTo(parent.end)
                        }
                )
            }

        }
        }
    }


