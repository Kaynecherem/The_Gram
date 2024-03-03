package com.necherem.thegram.view.auth

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
import androidx.compose.material3.Icon
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.necherem.thegram.R
import com.necherem.thegram.elements.DisplayText
import com.necherem.thegram.elements.UserFilledButton
import com.necherem.thegram.elements.UserInputField
import com.necherem.thegram.elements.UserOutlineButton
import com.necherem.thegram.elements.UserTextButton

@Composable
fun RegistrationScreen() {
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
        //FullName()
        //Password()
        SaveLoginInfo()
    }

}


@Composable
fun FullName(
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
            modifier = modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(space = 8.dp)
        ) {
            DisplayText(
                text = "What is your name?",
                color = MaterialTheme.colorScheme.onBackground,
                modifier = modifier
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
                onValueChange = { /*TODO*/ },
                text = "Next",
                modifier = modifier
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
                onValueChange = { /*TODO*/ },
                text = "Create new account",
                textColor = MaterialTheme.colorScheme.primary,
                modifier = modifier
                    .fillMaxWidth()
            )
        }
    }
}
@Composable
fun Password(
    modifier: Modifier = Modifier
) {
    var createPassword by remember{ mutableStateOf("") }

    Column(
        modifier = Modifier
            .background(Color.Transparent)
            .fillMaxSize()
            .statusBarsPadding()
            .verticalScroll(rememberScrollState())
            .safeDrawingPadding(),
        verticalArrangement = Arrangement.SpaceBetween

    ) {
        Column(
            modifier = modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(space = 8.dp)
        ) {
            var passString = "&"
            var stringToChar: Char = passString[0]
            DisplayText(
                text = "Create a password",
                color = MaterialTheme.colorScheme.onBackground,
                modifier = modifier
                    .align(Alignment.Start),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            //Instruction for setting up password
            DisplayText(
                text = "Create a password with at least 6 letters or numbers. It should be something others can't guess",
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = modifier
                    .align(Alignment.Start),
                fontSize = 14.sp
            )
            UserInputField(
                label = R.string.password,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Done
                ),
                value = createPassword,
                onValueChange = { createPassword = it },
                modifier = Modifier
                    .padding(bottom = 8.dp)
                    .fillMaxWidth(),
                visualTransformation = PasswordVisualTransformation(mask = stringToChar),
                trailingIcon = R.drawable.ic_visibility_off
            )
            UserFilledButton(
                onValueChange = { /*TODO*/ },
                text = "Next",
                modifier = modifier
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
                onValueChange = { /*TODO*/ },
                text = "Create new account",
                textColor = MaterialTheme.colorScheme.primary,
                modifier = modifier
                    .fillMaxWidth()
            )
        }
    }
}

@Composable
fun SaveLoginInfo(
    modifier: Modifier = Modifier
) {
    var createPassword by remember{ mutableStateOf("") }

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
            modifier = modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(space = 8.dp)
        ) {
            var passString = "&"
            var stringToChar: Char = passString[0]
            DisplayText(
                text = "Save your login info?",
                color = MaterialTheme.colorScheme.onBackground,
                modifier = modifier
                    .align(Alignment.Start),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            //Instruction for setting up password
            DisplayText(
                text = stringResource(R.string.save_login_info_description),
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = modifier
                    .align(Alignment.Start),
                fontSize = 14.sp
            )
            UserFilledButton(
                onValueChange = { /*TODO*/ },
                text = "Save",
                modifier = modifier
                    .fillMaxWidth(),
            )
            UserOutlineButton(
                onValueChange = { /*TODO*/ },
                text = "Not Now",
                textColor = MaterialTheme.colorScheme.onSurface,
                modifier = modifier
                    .fillMaxWidth()
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
                onValueChange = { /*TODO*/ },
                text = "Already have an account",
                textColor = MaterialTheme.colorScheme.primary,
                modifier = modifier
                    .fillMaxWidth()
            )
        }
    }
}

@Preview
@Composable
fun RegistrationScreenPreview() {
    RegistrationScreen()
}
@Preview
@Composable
fun FullNamePreview() {
    FullName()
}

@Preview
@Composable
fun PasswordPreview() {
    Password()
}

@Preview
@Composable
fun SaveLoginPreview() {
    SaveLoginInfo()
}