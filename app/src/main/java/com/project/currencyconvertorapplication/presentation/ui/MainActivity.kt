package com.project.currencyconvertorapplication.presentation.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.project.currencyconvertorapplication.presentation.Screen
import com.project.currencyconvertorapplication.presentation.coin_details.detailsui.CoinDetailScreen
import com.project.currencyconvertorapplication.presentation.coin_list.listui.CoinListScreen
import com.project.currencyconvertorapplication.presentation.theme.CurrencyConvertorApplicationTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity() : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CurrencyConvertorApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    NavHost(navController = navController,
                        startDestination = Screen.CoinDetailScreen.route) {
                        composable(
                            route = Screen.CoinListScreen.route
                        ) {
                            CoinListScreen(navController)
                        }
                        composable(
                            route = Screen.CoinDetailScreen.route
                        ) {
                            CoinDetailScreen()
                        }
                    }
                }
            }
        }
    }


}

