package com.koto.kmp_bookpedia.book.data.repository

import com.koto.kmp_bookpedia.book.data.mappers.toBook
import com.koto.kmp_bookpedia.book.data.network.RemoteBookDataSource
import com.koto.kmp_bookpedia.book.domain.Book
import com.koto.kmp_bookpedia.book.domain.BookRepository
import com.koto.kmp_bookpedia.core.domain.DataError
import com.koto.kmp_bookpedia.core.domain.Result
import com.koto.kmp_bookpedia.core.domain.map

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource,
) : BookRepository {
    override suspend fun searchBooks(
        query: String,
    ): Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource
            .searchBooks(query)
            .map { dto ->
                dto.results.map { it.toBook() }
            }
    }
}