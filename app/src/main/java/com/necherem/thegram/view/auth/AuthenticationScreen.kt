package com.necherem.thegram.view.auth

import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.necherem.thegram.view.nav.AuthNavScreen

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
        AuthNavigation()
    }
}

@Composable
fun AuthNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AuthNavScreen.Login.route) {
        composable(route = AuthNavScreen.Login.route) {
            LoginScreen(navController = navController)
        }
        composable(route = AuthNavScreen.Register.route) {
            RegistrationScreen(navController = navController)
        }
    }
}



