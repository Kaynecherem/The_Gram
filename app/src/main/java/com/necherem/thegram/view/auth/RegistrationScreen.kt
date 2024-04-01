package com.necherem.thegram.view.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.necherem.thegram.R
import com.necherem.thegram.view.auth.signupScreens.FullName
import com.necherem.thegram.view.auth.signupScreens.Password
import com.necherem.thegram.view.auth.signupScreens.Username
import com.necherem.thegram.view.nav.RegNavScreen

@Composable
fun RegistrationScreen(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .padding(top = 24.dp)
    ) {
        Icon(painter = painterResource(
            id = R.drawable.ic_keyboard_backspace),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(bottom = 24.dp)
        )
        RegistrationNav()
    }

}

@Composable
fun RegistrationNav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = RegNavScreen.FullName.route) {
        composable(route = RegNavScreen.FullName.route) {
            FullName(navController = navController)
        }
        composable(route = RegNavScreen.Password.route) {
            Password(navController = navController)
        }
        composable(route = RegNavScreen.UserName.route) {
            Username(navController = navController)
        }
    }
}