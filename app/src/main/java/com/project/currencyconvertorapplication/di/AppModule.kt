package com.project.currencyconvertorapplication.di

import com.project.currencyconvertorapplication.common.Constants.BASE_URL
import com.project.currencyconvertorapplication.data.remote.api.CoinCurrencyApi
import com.project.currencyconvertorapplication.data.repository.CoinRepositoryImpl
import com.project.currencyconvertorapplication.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesApi(): CoinCurrencyApi {
        return Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(
            GsonConverterFactory.create()).build().create(CoinCurrencyApi::class.java)
    }

    @Provides
    @Singleton
    fun providesCoinRepository(api: CoinCurrencyApi): CoinRepository {
        return CoinRepositoryImpl(api)
    }
}