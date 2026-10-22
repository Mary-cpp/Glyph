package com.marycpp.glyph

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform