package ru.vld.mangadexapp.data.response

import com.google.gson.annotations.SerializedName

data class MangaListResponse(
    @SerializedName("data") val mangaList: List<MangaResponse>
)
