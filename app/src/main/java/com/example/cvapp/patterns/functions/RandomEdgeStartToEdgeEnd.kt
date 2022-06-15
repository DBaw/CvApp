package com.example.cvapp.patterns

import com.example.cvapp.patterns.data.EdgeStartToEdgeEnd

fun randomEdgeStartToEdgeEnd(): EdgeStartToEdgeEnd {
    val startToEndPath = (0..5).random()

    return when(startToEndPath){
        0 -> EdgeStartToEdgeEnd.LEFTTORIGHT
        1 -> EdgeStartToEdgeEnd.LEFTTOBOTTOM
        2 -> EdgeStartToEdgeEnd.LEFTTOTOP
        3 -> EdgeStartToEdgeEnd.TOPTORIGHT
        4 -> EdgeStartToEdgeEnd.TOPTOBOTTOM
        else -> EdgeStartToEdgeEnd.BOTTOMTORIGHT
    }
}

