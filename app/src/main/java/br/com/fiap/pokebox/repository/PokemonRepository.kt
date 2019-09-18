package br.com.fiap.pokebox.repository

import br.com.fiap.pokebox.model.Pokemon

interface PokemonRepository{
    fun checkHealth(
        onComplete:() -> Unit,
        onError: (Throwable?) -> Unit
    )

    fun getPokemons(
        size: Int,
        sort: String,
        onComplete: (List<Pokemon>?) -> Unit,
        onError: (Throwable?) -> Unit
    )

    fun updatePokemon(
        pokemon: Pokemon,
        onComplete:(Pokemon?) -> Unit,
        onError:(Throwable) -> Unit
    )

    fun getPokemon(
        number: String,
        onComplete:(Pokemon?) -> Unit,
        onError:(Throwable) -> Unit
    )
}