package com.koto.kmp_bookpedia.book.presentation.book_list

import com.koto.kmp_bookpedia.book.domain.Book
import com.koto.kmp_bookpedia.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = books,
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null,
)

val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        imageUrl = "https://test.com",
        authors = listOf("Author $it"),
        description = "Description $it",
        languages = listOf("English"),
        firstPublishYear = null,
        averageRating = 4.76457,
        ratingCount = 5,
        numPages = 100,
        numEditions = 3,
    )
}