package ru.vld.mangadexapp.data.response

import com.google.gson.annotations.SerializedName
import ru.vld.mangadexapp.domain.Manga

private const val RELATIONSHIP_TYPE = "cover_art"

data class MangaResponse(
    @SerializedName("id") val id: String,
    @SerializedName("attributes") val attributes: MangaAttributesResponse,
    @SerializedName("relationships") val relationships: List<RelationshipResponse>
) {
    fun transform() = Manga(
        id = id,
        title = attributes.title.en,
        description = attributes.description.en,
        coverId = relationships.filter { it.type == RELATIONSHIP_TYPE }.first().id
    )
}