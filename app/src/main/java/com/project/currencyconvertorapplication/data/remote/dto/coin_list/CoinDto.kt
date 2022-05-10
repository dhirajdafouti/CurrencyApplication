package com.project.currencyconvertorapplication.data.remote.dto.coin_list

import com.google.gson.annotations.SerializedName
import com.project.currencyconvertorapplication.domain.model.Coin

data class CoinDto(
    val id: String,
    @SerializedName("is_active")
    val isActive: Boolean,
    @SerializedName("is_new")
    val isNew: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String,
)

//Mapper function converting the CoinDto objects onto the Coin domain objects.
fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}