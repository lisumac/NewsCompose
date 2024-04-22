package com.example.myapplication.services

import com.example.myapplication.model.CreditCardResponse
import retrofit2.http.GET

interface CreditCardService {
    @GET("credit_cards")
    suspend fun getCreditCards(): CreditCardResponse
}