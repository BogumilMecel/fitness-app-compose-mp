package theme

import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import fitness_app_compose_mutliplatform.shared.generated.resources.Res
import fitness_app_compose_mutliplatform.shared.generated.resources.roboto_bold
import fitness_app_compose_mutliplatform.shared.generated.resources.roboto_medium
import fitness_app_compose_mutliplatform.shared.generated.resources.roboto_regular
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Font

internal val LocalTypography = staticCompositionLocalOf { Typography() }
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
    darkTheme: Boolean,
    typography: Typography = FitnessAppTheme.typography,
    shapes: Shapes = FitnessAppTheme.shapes,
    content: @Composable () -> Unit
) {
    val colors = remember {
        if (darkTheme) darkFitnessAppColorSchema()
        else lightFitnessAppColorSchema()
    }
    val typographyWithFont = Typography(
        displayLarge = typography.displayLarge.copy(fontFamily = roboto),
        displayMedium = typography.displayMedium.copy(fontFamily = roboto),
        displaySmall = typography.displaySmall.copy(fontFamily = roboto),
        headlineLarge = typography.headlineLarge.copy(fontFamily = roboto),
        headlineMedium = typography.headlineMedium.copy(fontFamily = roboto),
        headlineSmall = typography.headlineSmall.copy(fontFamily = roboto),
        titleLarge = typography.titleLarge.copy(fontFamily = roboto),
        titleMedium = typography.titleMedium.copy(fontFamily = roboto),
        titleSmall = typography.titleSmall.copy(fontFamily = roboto),
        bodyLarge = typography.bodyLarge.copy(fontFamily = roboto),
        bodyMedium = typography.bodyMedium.copy(fontFamily = roboto),
        bodySmall = typography.bodySmall.copy(fontFamily = roboto),
        labelLarge = typography.labelLarge.copy(fontFamily = roboto),
        labelMedium = typography.labelMedium.copy(fontFamily = roboto),
        labelSmall = typography.labelSmall.copy(fontFamily = roboto)
    )
    CompositionLocalProvider(
        LocalColors provides colors,
        LocalTypography provides typographyWithFont,
        LocalShapes provides shapes
    ) {
        content()
    }
}

@OptIn(ExperimentalResourceApi::class)
internal val roboto
    @Composable get() = FontFamily(
        Font(Res.font.roboto_regular, FontWeight.Normal),
        Font(Res.font.roboto_medium, FontWeight.Medium),
        Font(Res.font.roboto_bold, FontWeight.Bold)
    )