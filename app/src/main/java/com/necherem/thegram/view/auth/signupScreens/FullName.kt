package com.necherem.thegram.view.auth.signupScreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.necherem.thegram.R
import com.necherem.thegram.elements.DisplayText
import com.necherem.thegram.elements.UserFilledButton
import com.necherem.thegram.elements.UserInputField
import com.necherem.thegram.elements.UserTextButton
import com.necherem.thegram.view.nav.AuthNavScreen
import com.necherem.thegram.view.nav.RegNavScreen

@Composable
fun FullName(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    var fullName by remember{ mutableStateOf("") }
    Column(
        modifier = Modifier
            .background(Color.Transparent)
            .fillMaxSize()
            .statusBarsPadding()
            .padding(top = 24.dp)
            .verticalScroll(rememberScrollState())
            .safeDrawingPadding(),
        verticalArrangement = Arrangement.SpaceBetween

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(space = 8.dp)
        ) {
            DisplayText(
                text = "What is your name?",
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier
                    .align(Alignment.Start),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            UserInputField(
                label = R.string.full_name,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email,
                    imeAction = ImeAction.Next
                ),
                value = fullName,
                onValueChange = { fullName = it },
                modifier = Modifier
                    .padding(bottom = 8.dp)
                    .fillMaxWidth()
            )
            UserFilledButton(
                onValueChange = {
                    navController.navigate(RegNavScreen.Password.route)
                },
                text = "Next",
                modifier = Modifier
                    .fillMaxWidth(),
            )
        }
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(all = 12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(space = 8.dp)
        ) {
            UserTextButton(
                onValueChange = {
                    navController.navigate(AuthNavScreen.Login.route)
                                },
                text = stringResource(R.string.already_have_an_account),
                textColor = MaterialTheme.colorScheme.primary,
                modifier = modifier
                    .fillMaxWidth()
            )
        }
    }
}