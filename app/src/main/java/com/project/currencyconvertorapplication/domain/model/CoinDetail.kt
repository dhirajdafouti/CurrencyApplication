package com.project.currencyconvertorapplication.domain.model

import com.project.currencyconvertorapplication.data.remote.dto.coin_details.Tag
import com.project.currencyconvertorapplication.data.remote.dto.coin_details.TeamMember

data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<Tag>,
    val team: List<TeamMember>,
)
