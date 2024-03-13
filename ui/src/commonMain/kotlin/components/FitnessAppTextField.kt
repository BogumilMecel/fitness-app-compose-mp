package components

import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import theme.FitnessAppTheme

@Composable
fun FitnessAppTextField(
    modifier: Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    label: String
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        textStyle = FitnessAppTheme.typography.bodyLarge,
        label = { Text(text = label) },
        placeholder = {},
        isError = false,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = FitnessAppTheme.colors.contentPrimary,
            cursorColor = FitnessAppTheme.colors.contentPrimary,
            focusedBorderColor = FitnessAppTheme.colors.contentPrimary,
            unfocusedBorderColor = FitnessAppTheme.colors.contentTertiary,
            focusedLabelColor = FitnessAppTheme.colors.contentPrimary,
            unfocusedLabelColor = FitnessAppTheme.colors.contentTertiary,
        )
    )
}