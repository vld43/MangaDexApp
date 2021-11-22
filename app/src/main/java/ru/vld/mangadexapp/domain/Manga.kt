package ru.vld.mangadexapp.domain

import java.io.Serializable

data class Manga(
    val id: String = "",
    val title: String = "",
    val description: String = "",
    val coverId: String = ""
): Serializable