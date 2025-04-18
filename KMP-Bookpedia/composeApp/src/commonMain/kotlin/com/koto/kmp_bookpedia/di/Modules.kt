package com.koto.kmp_bookpedia.di

import com.koto.kmp_bookpedia.book.data.network.KtorRemoteBookDataSource
import com.koto.kmp_bookpedia.book.data.network.RemoteBookDataSource
import com.koto.kmp_bookpedia.book.data.repository.DefaultBookRepository
import com.koto.kmp_bookpedia.book.domain.BookRepository
import com.koto.kmp_bookpedia.book.presentation.SelectedBookViewModel
import com.koto.kmp_bookpedia.book.presentation.book_detail.BookDetailViewModel
import com.koto.kmp_bookpedia.book.presentation.book_list.BookListViewModel
import com.koto.kmp_bookpedia.core.data.HttpClientFactory
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get())}
    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()

    viewModelOf(::BookListViewModel)
    viewModelOf(::BookDetailViewModel)
    viewModelOf(::SelectedBookViewModel)
}