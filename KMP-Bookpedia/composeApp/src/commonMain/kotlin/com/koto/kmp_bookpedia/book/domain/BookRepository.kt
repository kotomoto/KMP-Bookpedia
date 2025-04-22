package com.koto.kmp_bookpedia.book.domain

import com.koto.kmp_bookpedia.core.domain.DataError
import com.koto.kmp_bookpedia.core.domain.Result

interface BookRepository {

    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote>

    suspend fun getBookDescription(bookId: String): Result<String?, DataError>
}