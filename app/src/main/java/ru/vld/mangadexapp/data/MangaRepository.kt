package ru.vld.mangadexapp.data

import io.reactivex.Single
import ru.vld.mangadexapp.domain.Manga

class MangaRepository(private val mangaDexApi: MangaDexApi) {

    fun getMangaList(): Single<List<Manga>> =
        mangaDexApi.getMangaList().map { mangaListResponse ->
            mangaListResponse.mangaList.map { mangaResponse ->
                mangaResponse.transform()
            }
        }
}