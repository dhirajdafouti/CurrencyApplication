package com.project.currencyconvertorapplication.data.repository

import com.project.currencyconvertorapplication.data.remote.api.CoinCurrencyApi
import com.project.currencyconvertorapplication.data.remote.dto.coin_details.CoinDetailsDto
import com.project.currencyconvertorapplication.data.remote.dto.coin_list.CoinDto
import com.project.currencyconvertorapplication.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(private val api: CoinCurrencyApi) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinsDetails(coinId: String): CoinDetailsDto {
        return api.getCoinById(coinId)
    }
}