package com.example.omdb_moviedatabase.model

data class MovieDataClass(
    val Response: String,
    val Search: List<Search>,
    val totalResults: String
)