package com.koto.kmp_bookpedia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform