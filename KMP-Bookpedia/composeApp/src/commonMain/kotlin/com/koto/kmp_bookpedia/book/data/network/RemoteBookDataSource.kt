package com.koto.kmp_bookpedia.book.data.network

import com.koto.kmp_bookpedia.book.data.dto.SearchResponseDto
import com.koto.kmp_bookpedia.core.domain.DataError
import com.koto.kmp_bookpedia.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null,
    ): Result<SearchResponseDto, DataError.Remote>
}