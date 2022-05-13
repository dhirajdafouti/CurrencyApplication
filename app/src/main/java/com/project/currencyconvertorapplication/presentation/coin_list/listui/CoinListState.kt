package com.project.currencyconvertorapplication.presentation.coin_list.listui

import com.project.currencyconvertorapplication.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = "",
)
