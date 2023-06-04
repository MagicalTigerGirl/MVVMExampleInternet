package com.example.mvvmexample.domain

import com.example.mvvmexample.data.model.QuoteModel
import com.example.mvvmexample.data.repository.QuoteProvider

class GetRandomQuoteUseCase {

    operator fun invoke(): QuoteModel?{
        val quotes = QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}