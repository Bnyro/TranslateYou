package com.bnyro.translate.api.reverso.obj

data class ReversoRequestBody(
    val format: String = "text",
    val from: String,
    val input: String,
    val options: ReversoRequestOptions = ReversoRequestOptions(),
    val to: String
)
