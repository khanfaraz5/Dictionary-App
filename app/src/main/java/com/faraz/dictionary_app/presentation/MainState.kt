package com.faraz.dictionary_app.presentation

import com.faraz.dictionary_app.domain.model.WordItem


data class MainState(
    val isLoading: Boolean = false,
    val searchWord: String = "",

    val wordItem: WordItem? = null
)
