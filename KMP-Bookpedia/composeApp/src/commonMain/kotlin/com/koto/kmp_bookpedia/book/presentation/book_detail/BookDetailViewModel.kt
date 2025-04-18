package com.koto.kmp_bookpedia.book.presentation.book_detail

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BookDetailViewModel : ViewModel() {

    private val _state = MutableStateFlow(BookDetailState())
    val state = _state.asStateFlow()

    fun onAction(action: BookDetailAction) {
        when(action) {
            BookDetailAction.onFavoriteClick -> {}
            is BookDetailAction.onSelectedBookChange -> {
                _state.update { it.copy(
                    book = action.book
                ) }
            }
            else -> Unit
        }
    }
}