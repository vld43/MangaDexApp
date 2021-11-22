package ru.vld.mangadexapp.data

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query
import ru.vld.mangadexapp.data.ApiConstants.GET_MANGA_LIST
import ru.vld.mangadexapp.data.ApiConstants.QUERY_MANGA_LIMIT_PARAMETER
import ru.vld.mangadexapp.data.response.MangaListResponse

interface MangaDexApi {

    @GET(GET_MANGA_LIST)
    fun getMangaList(
        @Query(QUERY_MANGA_LIMIT_PARAMETER) limit: Int = 50
    ): Single<MangaListResponse>
}