package com.necherem.thegram.elements

import android.widget.DatePicker
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.necherem.thegram.R
import java.util.Date

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserInputField(
    @StringRes label : Int,
    keyboardOptions : KeyboardOptions,
    value : String,
    onValueChange : (String) -> Unit,
    modifier : Modifier,
    colors: TextFieldColors = TextFieldDefaults.outlinedTextFieldColors(MaterialTheme.colorScheme.outline),
    visualTransformation: VisualTransformation = VisualTransformation.None,
    @DrawableRes trailingIcon: Int? = null

) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(stringResource(label)) },
        singleLine = true,
        keyboardOptions = keyboardOptions,
        modifier = modifier,
        shape = MaterialTheme.shapes.medium,
        colors = colors,
        visualTransformation = visualTransformation,
        trailingIcon = trailingIcon?.let { iconId ->
            { Icon(painter = painterResource(id = iconId), contentDescription = null) }
        } ?: {}

    )
}

@Composable
fun UserFilledButton(
    onValueChange : () -> Unit,
    modifier : Modifier = Modifier,
    enabled : Boolean = true,
    text : String,
    colors : ButtonColors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
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
    border : BorderStroke? = BorderStroke(width = 1.dp, color = MaterialTheme.colorScheme.primary),
    textColor : Color = MaterialTheme.colorScheme.primary
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
fun UserTextButton(
    onValueChange : () -> Unit,
    modifier : Modifier = Modifier,
    enabled : Boolean = true,
    text : String,
    textColor : Color = MaterialTheme.colorScheme.primary
) {
    TextButton(
        onClick = onValueChange,
        modifier = modifier,
        enabled = enabled
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
    fontSize : TextUnit,
    fontWeight: FontWeight? = FontWeight.Normal,

    ) {
    Text(
        text = text,
        modifier = modifier,
        color = color,
        fontSize = fontSize,
        fontStyle = fontStyle,
        fontWeight = fontWeight
    )
}

@Preview
@Composable
fun TextInputPreview() {
    UserInputField(
        label = R.string.username_email_or_mobile_number,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Next
        ),
        value = "",
        onValueChange = {},
        modifier = Modifier
            .padding(bottom = 8.dp)
            .fillMaxWidth()
    )
}

