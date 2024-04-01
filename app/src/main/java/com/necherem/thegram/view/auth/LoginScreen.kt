package com.necherem.thegram.view.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.necherem.thegram.R
import com.necherem.thegram.elements.DisplayText
import com.necherem.thegram.elements.UserFilledButton
import com.necherem.thegram.elements.UserInputField
import com.necherem.thegram.elements.UserOutlineButton
import com.necherem.thegram.view.nav.AuthNavScreen

@Composable
fun LoginScreen(
    navController: NavController,
    modifier: Modifier = Modifier
){
    var userPassword by remember{ mutableStateOf("") }
    var userName by remember{ mutableStateOf("") }
    Column(
        modifier = Modifier
            .background(Color.Transparent)
            .fillMaxSize()
            .statusBarsPadding()
            .padding(horizontal = 16.dp)
            .verticalScroll(rememberScrollState())
            .safeDrawingPadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween

    ) {
        Spacer(modifier = Modifier.padding())
        Image(
            painter = painterResource(id = R.drawable.auth_image),
            contentDescription = stringResource(R.string.instagram_logo),
            modifier = modifier
                .size(80.dp)
        )
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(all = 12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(space = 8.dp)
        ) {
            var passString = "o"
            var stringToChar: Char = passString[0]

            UserInputField(
                label = R.string.username_email_or_mobile_number,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email,
                    imeAction = ImeAction.Next
                ),
                value = userName,
                onValueChange = { userName = it },
                modifier = Modifier
                    .padding(bottom = 8.dp)
                    .fillMaxWidth()
            )
            UserInputField(
                label = R.string.password,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Done
                ),
                value = userPassword,
                onValueChange = { userPassword = it },
                modifier = Modifier
                    .padding(bottom = 8.dp)
                    .fillMaxWidth(),
                visualTransformation = PasswordVisualTransformation(mask = stringToChar),
                trailingIcon = R.drawable.ic_visibility_off
            )
            UserFilledButton(
                onValueChange = { /*TODO*/ },
                text = "Log in",
                modifier = modifier
                    .fillMaxWidth()

            )
            DisplayText(
                text = "Forget password?",
                color = MaterialTheme.colorScheme.onSurface,
                modifier = modifier,
                fontSize = 16.sp
            )
        }
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(all = 12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(space = 8.dp)
        ) {
            UserOutlineButton(
                onValueChange = {
                    navController.navigate(AuthNavScreen.Register.route)
                                },
                text = stringResource(R.string.create_new_account),
                textColor = MaterialTheme.colorScheme.primary,
                modifier = modifier
                    .fillMaxWidth()
            )
            DisplayText(
                text = "@kaynecherem",
                color = MaterialTheme.colorScheme.onSurface,
                modifier = modifier,
                fontSize = 16.sp
            )
        }
    }
}
