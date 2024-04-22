package com.example.myapplication.data

import com.example.myapplication.model.CreditCardResponse
import com.example.myapplication.services.RetrofitInstance

class CreditCardRepository {
    private val creditCardService = RetrofitInstance.creditCardService

    suspend fun getCreditCards(): CreditCardResponse {
        return creditCardService.getCreditCards()
    }
}