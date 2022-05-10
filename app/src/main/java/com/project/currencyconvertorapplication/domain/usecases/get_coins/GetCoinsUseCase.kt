package com.project.currencyconvertorapplication.domain.usecases.get_coins

import com.project.currencyconvertorapplication.common.Resource
import com.project.currencyconvertorapplication.data.remote.dto.coin_list.toCoin
import com.project.currencyconvertorapplication.domain.model.Coin
import com.project.currencyconvertorapplication.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository,
) {
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading<List<Coin>>())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success(coins))
        } catch (e: IOException) {
            emit(Resource.Error<List<Coin>>(e.localizedMessage ?: "An Unexpected error occurred!!"))
        } catch (e: HttpException) {
            emit(Resource.Error<List<Coin>>("Could'nt Reach the Server..Internet Connection Error!!!"))
        }
    }
}