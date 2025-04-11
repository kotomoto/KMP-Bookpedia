package com.koto.kmp_bookpedia

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KMP-Bookpedia",
    ) {
        App()
    }
}