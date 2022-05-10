package com.project.currencyconvertorapplication.data.remote.api

import com.project.currencyconvertorapplication.data.remote.dto.coin_details.CoinDetailsDto
import com.project.currencyconvertorapplication.data.remote.dto.coin_list.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinCurrencyApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailsDto


}