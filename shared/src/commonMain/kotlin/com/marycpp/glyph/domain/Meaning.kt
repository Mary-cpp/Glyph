package com.marycpp.glyph.domain

import Example

data class Meaning(
    val value: String,
    val examples: List<Example>,
    val comment: String,
)