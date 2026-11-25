package com.example.finalprojectgroup1.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// retrofit instance shared across app
object RetrofitInstance {
    val api: PokeApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PokeApi::class.java)
    }
}