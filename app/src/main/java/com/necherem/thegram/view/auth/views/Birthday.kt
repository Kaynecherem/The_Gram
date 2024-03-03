package com.necherem.thegram.view.auth.views

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
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerColors
import androidx.compose.material3.DatePickerDefaults
import androidx.compose.material3.DatePickerFormatter
import androidx.compose.material3.DatePickerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
import com.necherem.thegram.elements.UserTextButton

@Composable
fun Birthday(
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
                text = "What's your birthday?",
                color = MaterialTheme.colorScheme.onBackground,
                modifier = modifier
                    .align(Alignment.Start),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            //Instruction for setting up password
            DisplayText(
                text = "Use your own birthday, even if this account is for a business, a pet or something else. No one will see this unless you choose to share it.",
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

@ExperimentalMaterial3Api
@Composable
fun DatePicker(
    state: DatePickerState,
    modifier: Modifier = Modifier,
    dateFormatter: DatePickerFormatter = remember { DatePickerDefaults.dateFormatter() },
    title: (@Composable () -> Unit)? = {
        DatePickerDefaults.DatePickerTitle(
            displayMode = state.displayMode,
            modifier = Modifier.padding()
        )
    },
    headline: (@Composable () -> Unit)? = {
        DatePickerDefaults.DatePickerHeadline(
            selectedDateMillis = state.selectedDateMillis,
            displayMode = state.displayMode,
            dateFormatter = dateFormatter,
            modifier = Modifier.padding()
        )
    },
    showModeToggle: Boolean = true,
    colors: DatePickerColors = DatePickerDefaults.colors()
): Unit {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        // Pre-select a date for January 4, 2020
        val datePickerState = rememberDatePickerState(initialSelectedDateMillis = 1578096000000)
        DatePicker(state = datePickerState, modifier = Modifier.padding(16.dp))

        Text(
            "Selected date timestamp: ${datePickerState.selectedDateMillis ?: "no selection"}",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}


@Preview
@Composable
fun BirthdayPreview() {
    Birthday()
}