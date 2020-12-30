package com.rochim.kulinear.data.model

data class NewsList(
    val method : String = "Get",
    val status: Boolean = true,
    val results : List<News> = arrayListOf()
)
