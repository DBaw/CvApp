package com.example.cvapp.patterns

import androidx.compose.ui.graphics.Path
import com.example.cvapp.patterns.data.EdgeStartToEdgeEnd

fun randomPatternPath(
    width: Float,
    height: Float,
) : Path{

    val startToEnd = randomEdgeStartToEdgeEnd()
    val points = randomPathPoints(startToEnd,width,height)
    val switchColors = listOf(true,false).random()

   return Path().apply {
        moveTo(points[0].x,points[0].y)

        for (i in points.indices){
            if (points.indexOf(points[i]) > 0){
                standardQuadFromTo(points[i-1],points[i])}}

       when (startToEnd) {
           EdgeStartToEdgeEnd.LEFTTOTOP -> {
               if (!switchColors) {
                   lineTo(0f, 0f)
               }else{
                   lineTo(width, 0f)
                   lineTo(width, height)
                   lineTo(0f, height)
               }
           }
           EdgeStartToEdgeEnd.LEFTTORIGHT -> {
               if (!switchColors) {
                   lineTo(width, height)
                   lineTo(0f, height)
               }else{
                   lineTo(width,0f)
                   lineTo(0f,0f)
               }
           }
           EdgeStartToEdgeEnd.LEFTTOBOTTOM -> {
               if (!switchColors) {
                   lineTo(0f, height)
               }else{
                   lineTo(width, height)
                   lineTo(width, 0f)
                   lineTo(0f, 0f)
               }
           }
           EdgeStartToEdgeEnd.TOPTOBOTTOM -> {
               if (!switchColors){
                   lineTo(width, height)
                   lineTo(width, 0f)
               }else{
                   lineTo(0f, height)
                   lineTo(0f, 0f)
               }
           }
           EdgeStartToEdgeEnd.TOPTORIGHT -> {
               if (!switchColors) {
                   lineTo(width, 0f)
               }else{
                   lineTo(width,height)
                   lineTo(0f,height)
                   lineTo(0f,0f)
               }
           }
           EdgeStartToEdgeEnd.BOTTOMTORIGHT -> {
               if (!switchColors) {
                   lineTo(width, height)
               }else{
                   lineTo(width, 0f)
                   lineTo(0f, 0f)
                   lineTo(0f, height)
               }
           }
       }
        close()
    }
}