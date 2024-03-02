package com.gmail.bogumilmecel2

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf

internal val LocalTypography = staticCompositionLocalOf { fitnessAppTypography }
internal val LocalColors = staticCompositionLocalOf { lightFitnessAppColorSchema() }
internal val LocalShapes = staticCompositionLocalOf { Shapes() }

object FitnessAppTheme {
    val typography: Typography
        @ReadOnlyComposable
        @Composable get() = LocalTypography.current

    val colors: FitnessAppColorScheme
        @ReadOnlyComposable
        @Composable get() = LocalColors.current

    val shapes: Shapes
        @ReadOnlyComposable
        @Composable get() = LocalShapes.current
}

@Composable
fun FitnessAppTheme(
    colors: FitnessAppColorScheme = FitnessAppTheme.colors,
    typography: Typography = FitnessAppTheme.typography,
    shapes: Shapes = FitnessAppTheme.shapes,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalColors provides colors,
        LocalTypography provides typography,
        LocalShapes provides shapes
    ) {
        MaterialTheme(
            typography = typography,
            shapes = shapes,
            colorScheme = colors.toColorScheme(),
            content = content
        )
    }
}