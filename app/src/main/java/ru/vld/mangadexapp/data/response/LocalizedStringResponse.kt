package ru.vld.mangadexapp.data.response

import com.google.gson.annotations.SerializedName

data class LocalizedStringResponse(
    @SerializedName("en") val en: String
)
