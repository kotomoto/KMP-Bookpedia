package com.koto.kmp_bookpedia.book.presentation.book_detail

import com.koto.kmp_bookpedia.book.domain.Book

data class BookDetailState(
    val isLoading: Boolean = true,
    val isFavorite: Boolean = false,
    val book: Book? = null
)
