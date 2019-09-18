package br.com.fiap.pokebox.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pokemon(
    // @SerializedName("id") val identificacao: Int, // Quando o nome da variavel criada nao vai ser igual ao da API
    val number: String,
    val name: String,
    var ps: Int,
    var attack: Int,
    var defense: Int,
    var velocity: Int,
    val description: String,
    val imageURL: String
) : Parcelable