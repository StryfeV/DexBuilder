package com.example.finalprojectgroup1.data.model

// the response from GET Pokémon?limit=1025
data class PokemonListResponse(val results: List<PokemonEntry>)

//1 pokemon in api list --> gives name and url
data class PokemonEntry(val name: String, val url: String)

// pokedex page --> shows national dex # and name associated with #
data class PokedexEntry(val number: Int, val name: String)