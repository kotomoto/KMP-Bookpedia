package com.koto.kmp_bookpedia

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.koto.kmp_bookpedia.app.App
import com.koto.kmp_bookpedia.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "KMP-Bookpedia",
        ) {
            App()
        }
    }
}