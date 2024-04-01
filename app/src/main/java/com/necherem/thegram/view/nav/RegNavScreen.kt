package com.necherem.thegram.view.nav

sealed class RegNavScreen(val route: String) {
    object FullName : RegNavScreen("fullName")
    object Password : RegNavScreen("password")
    object UserName : RegNavScreen("saveLogin")

}