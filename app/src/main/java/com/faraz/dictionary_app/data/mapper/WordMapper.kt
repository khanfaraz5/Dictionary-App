package com.faraz.dictionary_app.data.mapper

import com.faraz.dictionary_app.data.dto.DefinitionDto
import com.faraz.dictionary_app.data.dto.MeaningDto
import com.faraz.dictionary_app.data.dto.WordItemDto
import com.faraz.dictionary_app.domain.model.Definition
import com.faraz.dictionary_app.domain.model.Meaning
import com.faraz.dictionary_app.domain.model.WordItem

fun WordItemDto.toWordItem() = WordItem (
    word = word ?: "",
    meanings = meanings?.map {
        it.toMeaning()
    } ?: emptyList(),
    phonetic = phonetic ?: ""
)

fun MeaningDto.toMeaning() = Meaning(
    definition = definitionDtoToDefinition(definitions?.get(0)),
    partOfSpeech = partOfSpeech ?: ""
)


fun definitionDtoToDefinition(
    definitionDto: DefinitionDto?
) = Definition(
    definition = definitionDto?.definition ?: "",
    example = definitionDto?.example ?: ""
)














