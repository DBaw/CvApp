package com.example.cvapp.patterns

import androidx.compose.ui.geometry.Offset
import com.example.cvapp.patterns.data.EdgeStartToEdgeEnd

fun randomPathPoints(startToEnd: EdgeStartToEdgeEnd, width: Float, height: Float): List<Offset> {

    val zero = 0f
    val widthSecondPointFullScreen = 0.25f * width
    val widthThirdPointFullScreen = 0.5f * width
    val widthFourPointFullScreen = 0.75f * width
    val widthFullScreen = width
    val widthSecondPointRandomScreen = 0.2f * width
    val widthOppositeSecondPointRandomScreen = 0.6f * width
    val widthThirdPointRandomScreen = 0.4f * width
    val widthOppositeThreePointRandomScreen = 0.8f * width
    val widthFourPointRandomScreen = (60..100).random()/100.toFloat() * width
    val widthLastPoint = 1.25f * width

    val heightSecondPointFullScreen = 0.25f * height
    val heightThirdPointFullScreen = 0.5f * height
    val heightFourPointFullScreen = 0.75f * height
    val heightFullScreen = height
    val heightSecondPointRandomScreen = 0.2f * height
    val heightThirdPointRandomScreen = 0.4f * height
    val heightFourPointRandomScreen = (60..100).random()/100.toFloat() * height
    val heightLastPoint = 1.25f * height

    val randomWidthThreeToSeven = (30..70).random()/100.toFloat() * width
    val randomWidthOneToNine = (10..90).random()/100.toFloat() * width

    val randomHeightThreeToSeven = (30..70).random()/100.toFloat() * height
    val randomHeightOneToNine = (10..90).random()/100.toFloat() * height


    return when (startToEnd){
        EdgeStartToEdgeEnd.LEFTTOTOP -> listOf(
            Offset(zero,randomHeightThreeToSeven),
            Offset(widthSecondPointRandomScreen,randomHeightOneToNine),
            Offset(widthThirdPointRandomScreen,randomHeightOneToNine),
            Offset(widthFourPointRandomScreen,zero),
            Offset(widthLastPoint,zero)
        )
        EdgeStartToEdgeEnd.LEFTTORIGHT -> listOf(
            Offset(zero,randomHeightThreeToSeven),
            Offset(widthSecondPointFullScreen,randomHeightOneToNine),
            Offset(widthThirdPointFullScreen,randomHeightOneToNine),
            Offset(widthFourPointFullScreen,randomHeightOneToNine),
            Offset(widthFullScreen,randomHeightThreeToSeven),
            Offset(widthLastPoint,randomHeightOneToNine)
        )
        EdgeStartToEdgeEnd.LEFTTOBOTTOM -> listOf(
            Offset(zero,randomHeightThreeToSeven),
            Offset(widthSecondPointRandomScreen,randomHeightOneToNine),
            Offset(widthThirdPointRandomScreen,randomHeightOneToNine),
            Offset(widthFourPointRandomScreen,heightFullScreen),
            Offset(widthLastPoint,heightFullScreen)
        )
        EdgeStartToEdgeEnd.TOPTORIGHT -> listOf(
            Offset(randomWidthThreeToSeven,zero),
            Offset(randomWidthOneToNine,heightSecondPointRandomScreen),
            Offset(randomWidthOneToNine,heightThirdPointRandomScreen),
            Offset(widthFullScreen,heightFourPointRandomScreen),
            Offset(widthLastPoint,randomHeightOneToNine)
        )
        EdgeStartToEdgeEnd.TOPTOBOTTOM -> listOf(
            Offset(randomWidthThreeToSeven,zero),
            Offset(randomWidthOneToNine,heightSecondPointFullScreen),
            Offset(randomWidthOneToNine,heightThirdPointFullScreen),
            Offset(randomWidthOneToNine,heightFourPointFullScreen),
            Offset(randomWidthThreeToSeven,heightFullScreen),
            Offset(randomWidthOneToNine,heightLastPoint)
        )
        EdgeStartToEdgeEnd.BOTTOMTORIGHT -> listOf(
            Offset(randomWidthThreeToSeven,heightFullScreen),
            Offset(widthOppositeSecondPointRandomScreen,randomHeightOneToNine),
            Offset(widthOppositeThreePointRandomScreen,randomHeightOneToNine),
            Offset(widthFullScreen,randomHeightThreeToSeven),
            Offset(widthLastPoint,randomHeightOneToNine),
        )
    }

}
