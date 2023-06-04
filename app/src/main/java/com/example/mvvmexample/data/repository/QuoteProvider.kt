package com.example.mvvmexample.data.repository

import com.example.mvvmexample.data.model.QuoteModel

class QuoteProvider {
    companion object {
        var quotes:List<QuoteModel> = emptyList()
    }
}