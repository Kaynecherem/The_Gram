package com.necherem.thegram.view.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.necherem.thegram.R
import com.necherem.thegram.view.auth.signupScreens.FullName

@Composable
fun RegistrationScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .padding(top = 24.dp)
    ) {
        Icon(
            painter = painterResource(
                id = R.drawable.ic_keyboard_backspace
            ),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(bottom = 24.dp)
        )
        //FullName()
        //Password()
        //SaveLoginInfo()
        //Birthday()
    }

}

@Preview
@Composable
fun RegistrationScreenPreview() {
    RegistrationScreen()
}