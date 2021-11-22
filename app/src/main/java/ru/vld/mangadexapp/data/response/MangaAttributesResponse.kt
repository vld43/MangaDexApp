package ru.vld.mangadexapp.data.response

import com.google.gson.annotations.SerializedName

data class MangaAttributesResponse(
    @SerializedName("title") val title: LocalizedStringResponse,
    @SerializedName("description") val description: LocalizedStringResponse
)
