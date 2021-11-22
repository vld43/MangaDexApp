package ru.vld.mangadexapp.data.response

import com.google.gson.annotations.SerializedName

data class MangaResponse(
    @SerializedName("id") val id: String,
    @SerializedName("attributes") val attributes: MangaAttributesResponse,
    @SerializedName("relationships") val relationships: List<RelationshipResponse>
)