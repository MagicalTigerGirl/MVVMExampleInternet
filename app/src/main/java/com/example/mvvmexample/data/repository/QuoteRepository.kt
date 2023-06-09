package com.example.mvvmexample.data.repository

import com.example.mvvmexample.data.model.QuoteModel
import com.example.mvvmexample.data.network.QuoteService

class QuoteRepository {

    private val api = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}