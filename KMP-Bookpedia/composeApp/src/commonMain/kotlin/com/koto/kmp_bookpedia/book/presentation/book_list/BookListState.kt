package com.koto.kmp_bookpedia.book.presentation.book_list

import com.koto.kmp_bookpedia.book.domain.Book
import com.koto.kmp_bookpedia.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null,
)
