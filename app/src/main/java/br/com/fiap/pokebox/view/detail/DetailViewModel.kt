package br.com.fiap.pokebox.view.detail

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.fiap.pokebox.model.Pokemon
import br.com.fiap.pokebox.repository.PokemonRepository

class DetailViewModel(
    val pokemonRepository: PokemonRepository
) : ViewModel() {
    val isLoading: MutableLiveData<Boolean> = MutableLiveData()
    val pokemon = MutableLiveData<Pokemon>()
    val messageError = MutableLiveData<String>()
    fun getPokemon(number: String) {
        isLoading.value = true
        pokemonRepository.getPokemon(
            number,
            onComplete = {
                isLoading.value = false
                pokemon.value = it
                messageError.value = ""
            },
            onError = {
                isLoading.value = false
                messageError.value = it?.message
            }
        )
    }
}