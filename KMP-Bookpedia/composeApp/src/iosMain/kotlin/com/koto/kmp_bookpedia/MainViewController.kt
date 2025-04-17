package com.koto.kmp_bookpedia

import androidx.compose.ui.window.ComposeUIViewController
import com.koto.kmp_bookpedia.app.App
import com.koto.kmp_bookpedia.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App()
}