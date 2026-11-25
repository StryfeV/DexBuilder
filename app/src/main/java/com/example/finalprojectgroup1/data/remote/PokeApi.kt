package com.example.finalprojectgroup1.data.remote

import com.example.finalprojectgroup1.data.model.PokemonListResponse
import retrofit2.http.GET

//retrofit interface for pokeapi
interface PokeApi {
    // full national dex = 1025(Gen1-9)
    @GET("pokemon?limit=1025")
    suspend fun getPokemonList(): PokemonListResponse
}