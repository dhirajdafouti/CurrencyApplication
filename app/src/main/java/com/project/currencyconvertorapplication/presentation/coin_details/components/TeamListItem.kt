package com.project.currencyconvertorapplication.presentation.coin_details.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import com.project.currencyconvertorapplication.data.remote.dto.coin_details.TeamMember


@Composable
fun TeamListItem(
    teamMember: TeamMember,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier,
        verticalArrangement = Arrangement.Center) {
        Text(text = teamMember.name,
            style = MaterialTheme.typography.h2)

        Spacer(modifier = Modifier.height(4.dp))
        Text(text = teamMember.position,
            style = MaterialTheme.typography.h2,
            fontStyle = FontStyle.Italic)
    }

}