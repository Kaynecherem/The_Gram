package com.necherem.thegram.elements

import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.TextUnit

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserInputField(
    @StringRes label : Int,
    keyboardOptions : KeyboardOptions,
    value : String,
    onValueChange : (String) -> Unit,
    modifier : Modifier = Modifier
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(stringResource(label)) },
        singleLine = true,
        keyboardOptions = keyboardOptions,
        modifier = modifier
    )
}

@Composable
fun UserFilledButton(
    onValueChange : () -> Unit,
    modifier : Modifier = Modifier,
    enabled : Boolean = true,
    text : String,
    colors : ButtonColors
) {
    Button(
        onClick = onValueChange,
        modifier = modifier,
        enabled = enabled,
        colors = colors
    ) {
        Text(text = text)

    }
}
@Composable
fun UserOutlineButton(
    onValueChange : () -> Unit,
    modifier : Modifier = Modifier,
    enabled : Boolean = true,
    text : String,
    colors : ButtonColors = ButtonDefaults.outlinedButtonColors(),
    border : BorderStroke?,
    textColor : Color
) {
    OutlinedButton(
        onClick = onValueChange,
        modifier = modifier,
        enabled = enabled,
        colors = colors,
        border = border,

    ) {
        Text(
            text = text,
            color = textColor
            )

    }
}

@Composable
fun DisplayText(
    modifier : Modifier = Modifier,
    text : String,
    color : Color,
    fontStyle : FontStyle? = FontStyle.Normal,
    fontSize : TextUnit

    ) {
    Text(
        text = text,
        modifier = modifier,
        color = color,
        fontSize = fontSize,
        fontStyle = fontStyle
    )
}
