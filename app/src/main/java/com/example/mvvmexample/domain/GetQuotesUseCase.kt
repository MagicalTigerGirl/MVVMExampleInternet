package com.example.mvvmexample.domain

import com.example.mvvmexample.data.model.QuoteModel
import com.example.mvvmexample.data.repository.QuoteRepository

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()

}