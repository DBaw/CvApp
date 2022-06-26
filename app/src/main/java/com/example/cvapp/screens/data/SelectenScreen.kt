package com.example.cvapp.screens.data

open class SelectenScreen(val screen:String) {
    object Default : SelectenScreen (screen = "default")
    object Inf: SelectenScreen (screen = "Info")
    object Exp: SelectenScreen (screen = "Experience")
    object Edu: SelectenScreen (screen = "Education")
    object Skill: SelectenScreen (screen = "Skills")
    object Int: SelectenScreen (screen = "Interests")
    object Cont: SelectenScreen (screen = "Contact")
}