package ru.vld.mangadexapp.data.response

import com.google.gson.annotations.SerializedName

data class RelationshipResponse(
    @SerializedName("id") val id: String,
    @SerializedName("type") val type: String
)
