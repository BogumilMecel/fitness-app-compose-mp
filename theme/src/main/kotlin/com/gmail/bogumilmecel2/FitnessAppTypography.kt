package com.gmail.bogumilmecel2

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.gmail.bogumilmecel2.theme.R

internal object FitnessAppFont {
    val roboto = FontFamily(
        Font(R.font.roboto_regular, FontWeight.Normal),
        Font(R.font.roboto_medium, FontWeight.Medium),
        Font(R.font.roboto_bold, FontWeight.Bold)
    )
}

private val defaultTypography = Typography()
internal val fitnessAppTypography = Typography(
    displayLarge = defaultTypography.displayLarge.copy(fontFamily = FitnessAppFont.roboto),
    displayMedium = defaultTypography.displayMedium.copy(fontFamily = FitnessAppFont.roboto),
    displaySmall = defaultTypography.displaySmall.copy(fontFamily = FitnessAppFont.roboto),

    headlineLarge = defaultTypography.headlineLarge.copy(fontFamily = FitnessAppFont.roboto),
    headlineMedium = defaultTypography.headlineMedium.copy(fontFamily = FitnessAppFont.roboto),
    headlineSmall = defaultTypography.headlineSmall.copy(fontFamily = FitnessAppFont.roboto),

    titleLarge = defaultTypography.titleLarge.copy(fontFamily = FitnessAppFont.roboto),
    titleMedium = defaultTypography.titleMedium.copy(fontFamily = FitnessAppFont.roboto),
    titleSmall = defaultTypography.titleSmall.copy(fontFamily = FitnessAppFont.roboto),

    bodyLarge = defaultTypography.bodyLarge.copy(fontFamily = FitnessAppFont.roboto),
    bodyMedium = defaultTypography.bodyMedium.copy(fontFamily = FitnessAppFont.roboto),
    bodySmall = defaultTypography.bodySmall.copy(fontFamily = FitnessAppFont.roboto),

    labelLarge = defaultTypography.labelLarge.copy(fontFamily = FitnessAppFont.roboto),
    labelMedium = defaultTypography.labelMedium.copy(fontFamily = FitnessAppFont.roboto),
    labelSmall = defaultTypography.labelSmall.copy(fontFamily = FitnessAppFont.roboto)
)