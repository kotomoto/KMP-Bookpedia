package com.koto.kmp_bookpedia.book.presentation.book_detail

import com.koto.kmp_bookpedia.book.domain.Book

sealed interface BookDetailAction {
    data object onBackClick : BookDetailAction
    data object onFavoriteClick : BookDetailAction
    data class onSelectedBookChange(val book: Book) : BookDetailAction
}