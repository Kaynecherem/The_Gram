package com.necherem.thegram.view.nav

sealed class AuthNavScreen(val route: String) {
    object Register : RegNavScreen("register")
    object Login : RegNavScreen("login")
}