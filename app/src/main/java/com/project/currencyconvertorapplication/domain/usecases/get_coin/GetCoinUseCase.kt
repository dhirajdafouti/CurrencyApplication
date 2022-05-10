package com.project.currencyconvertorapplication.domain.usecases.get_coin

import com.project.currencyconvertorapplication.common.Resource
import com.project.currencyconvertorapplication.data.remote.dto.coin_details.toCoinDetail
import com.project.currencyconvertorapplication.domain.model.CoinDetail
import com.project.currencyconvertorapplication.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository,
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading<CoinDetail>())
            emit(Resource.Success(repository.getCoinsDetails(coinId).toCoinDetail()))
        } catch (e: IOException) {
            emit(Resource.Error<CoinDetail>("An UnExpected Error Occurred!!" + e.localizedMessage))
        } catch (e: HttpException) {
            emit(Resource.Error<CoinDetail>("No Internet Connection !!!"))
        }
    }
}