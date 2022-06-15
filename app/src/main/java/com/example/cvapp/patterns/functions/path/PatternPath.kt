package com.example.cvapp.patterns

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path
import com.example.cvapp.patterns.data.EdgeStartToEdgeEnd

fun patternPath(
    points: List<Offset>,
    startToEnd: EdgeStartToEdgeEnd,
    width: Float,
    height: Float,
    switchColors: Boolean = false
) : Path{

   return Path().apply {
        moveTo(points[0].x,points[0].y)

        for (i in points.indices){
            if (points.indexOf(points[i]) > 0){
                standardQuadFromTo(points[i-1],points[i])}}

       when (startToEnd) {
           EdgeStartToEdgeEnd.LEFTTOTOP -> {
               lineTo(0f, 0f)
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
               lineTo(0f, height)
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
               lineTo(0f, height)
           }
           EdgeStartToEdgeEnd.BOTTOMTORIGHT -> {
               lineTo(width, height)
           }
       }
        close()
    }
}