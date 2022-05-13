package com.project.currencyconvertorapplication.presentation.coin_details.detailsui

import com.project.currencyconvertorapplication.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean=false,
    val coinDetail: CoinDetail? = null,
    val error: String = "",
)