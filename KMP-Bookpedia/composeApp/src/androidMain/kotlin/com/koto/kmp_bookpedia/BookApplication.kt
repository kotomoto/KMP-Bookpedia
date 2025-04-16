package com.koto.kmp_bookpedia

import android.app.Application
import com.koto.kmp_bookpedia.di.initKoin
import org.koin.android.ext.koin.androidContext

class BookApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        initKoin {
            androidContext(this@BookApplication)
        }
    }
}