package com.project.currencyconvertorapplication.domain.repository

import com.project.currencyconvertorapplication.data.remote.dto.coin_details.CoinDetailsDto
import com.project.currencyconvertorapplication.data.remote.dto.coin_list.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinsDetails(coinId: String): CoinDetailsDto
}