package ru.rut.permissiondemo.model

data class Hero(
    val aliases: List<String>,
    val allegiances: List<Any>,
    val books: List<String>,
    val born: String,
    val culture: String,
    val died: String,
    val father: String,
    val gender: String,
    val mother: String,
    val name: String,
    val playedBy: List<String>,
    val povBooks: List<Any>,
    val spouse: String,
    val titles: List<String>,
    val tvSeries: List<String>,
    val url: String
)