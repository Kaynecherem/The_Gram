package com.necherem.thegram.view.auth

import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AuthenticationScreen(
    modifier: Modifier = Modifier
) {
    val scrollState = rememberScrollState()

    val visibleState = remember {
        MutableTransitionState(initialState = false).apply {
            targetState = true
        }
    }
    Card {
        //LoginScreen()
        RegistrationScreen()
    }
}



