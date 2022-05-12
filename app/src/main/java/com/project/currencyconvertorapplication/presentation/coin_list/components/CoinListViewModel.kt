package com.project.currencyconvertorapplication.presentation.coin_list.components

import androidx.lifecycle.ViewModel
import com.project.currencyconvertorapplication.domain.usecases.get_coin.GetCoinUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CoinListViewModel @Inject constructor(coinUseCase: GetCoinUseCase) : ViewModel() {
}