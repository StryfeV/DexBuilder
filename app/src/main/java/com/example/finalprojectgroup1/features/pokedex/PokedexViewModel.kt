package com.example.finalprojectgroup1.features.pokedex

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.finalprojectgroup1.R
import com.example.finalprojectgroup1.data.model.PokedexEntry
import com.example.finalprojectgroup1.data.remote.RetrofitInstance
import kotlinx.coroutines.launch

// ViewModel for the pokedex page -- loads pokemon from pokeapi and allows search
class PokedexViewModel : ViewModel() {

    // every pokemon returned by the api
    var pokemonList by mutableStateOf<List<PokedexEntry>>(emptyList())
        private set

    // search -- value set to empty
    var searchQuery by mutableStateOf("")
        private set

    // true while api call is running
    var isLoading by mutableStateOf(false)
        private set

    var errorMessage by mutableStateOf<Int?>(null)
        private set

    //filter list --- all pokemon or ones matching search
    val filteredPokemon: List<PokedexEntry>
        get() {
            if (searchQuery.isBlank()) {
                return pokemonList
            }
            val results = mutableListOf<PokedexEntry>()
            for (pokemon in pokemonList) {
                if (pokemon.name.contains(searchQuery)) {
                    results += pokemon
                }
            }
            return results
        }

    // pokedex loads when viewmodel is created
    init {
        loadPokemon()
    }

    // update search
    fun onSearchQueryChanged(newValue: String) {
        searchQuery = newValue
    }

    // calling api and building list
    fun loadPokemon() {
        viewModelScope.launch {
            isLoading = true
            errorMessage = null
            try {
                val response = RetrofitInstance.api.getPokemonList()
                val entries = mutableListOf<PokedexEntry>()
                var number = 1
                for (pokemon in response.results) {
                    entries += PokedexEntry(number, pokemon.name)
                    number++
                }
                pokemonList = entries
            } catch (e: Exception) {
                // no internet or api failed
                errorMessage = R.string.pokedex_error
            } finally {isLoading = false}
        }
    }
}