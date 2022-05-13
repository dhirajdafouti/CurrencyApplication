package com.project.currencyconvertorapplication.presentation

sealed class Screen(val route: String) {
    object CoinListScreen : Screen(route = "coin_list")
    object CoinDetailScreen : Screen(route = "coin_details")
}
