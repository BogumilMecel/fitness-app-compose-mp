package components

import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.Login
import androidx.compose.material.icons.automirrored.filled.Logout
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Error
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Password
import androidx.compose.material.icons.filled.Save
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import fitness_app_compose_mutliplatform.ui.generated.resources.Res
import fitness_app_compose_mutliplatform.ui.generated.resources.account
import fitness_app_compose_mutliplatform.ui.generated.resources.add
import fitness_app_compose_mutliplatform.ui.generated.resources.arrow_down
import fitness_app_compose_mutliplatform.ui.generated.resources.back
import fitness_app_compose_mutliplatform.ui.generated.resources.barcode
import fitness_app_compose_mutliplatform.ui.generated.resources.barcode_scan
import fitness_app_compose_mutliplatform.ui.generated.resources.cancel
import fitness_app_compose_mutliplatform.ui.generated.resources.clear
import fitness_app_compose_mutliplatform.ui.generated.resources.copy
import fitness_app_compose_mutliplatform.ui.generated.resources.edit
import fitness_app_compose_mutliplatform.ui.generated.resources.email
import fitness_app_compose_mutliplatform.ui.generated.resources.error
import fitness_app_compose_mutliplatform.ui.generated.resources.favorite
import fitness_app_compose_mutliplatform.ui.generated.resources.favorite_filled
import fitness_app_compose_mutliplatform.ui.generated.resources.info
import fitness_app_compose_mutliplatform.ui.generated.resources.log_out
import fitness_app_compose_mutliplatform.ui.generated.resources.login
import fitness_app_compose_mutliplatform.ui.generated.resources.password
import fitness_app_compose_mutliplatform.ui.generated.resources.save
import fitness_app_compose_mutliplatform.ui.generated.resources.search
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import theme.FitnessAppTheme

@Composable
fun FitnessAppIcon(
    modifier: Modifier = Modifier,
    icon: Icon,
    tint: Color = FitnessAppTheme.colors.contentPrimary
) {
    when(icon) {
        is IconPainter -> {
            FitnessAppIcon(
                painter = icon,
                tint = tint,
                modifier = modifier
            )
        }

        is IconVector -> {
            FitnessAppIcon(
                vector = icon,
                tint = tint,
                modifier = modifier
            )
        }
    }
}

@OptIn(ExperimentalResourceApi::class)
@Composable
private fun FitnessAppIcon(
    modifier: Modifier = Modifier,
    vector: IconVector,
    tint: Color
) = with(vector) {
    Icon(
        modifier = modifier,
        imageVector = imageVector,
        contentDescription = stringResource(resource = vector.contentDescriptionResource),
        tint = tint
    )
}

@OptIn(ExperimentalResourceApi::class)
@Composable
private fun FitnessAppIcon(
    modifier: Modifier = Modifier,
    painter: IconPainter,
    tint: Color = FitnessAppTheme.colors.contentPrimary
) = with(painter) {
    Icon(
        modifier = modifier,
        painter = imagePainter,
        contentDescription = stringResource(painter.contentDescriptionResource),
        tint = tint
    )
}

@OptIn(ExperimentalResourceApi::class)
interface Icon {
    val contentDescriptionResource: StringResource
}

@OptIn(ExperimentalResourceApi::class)
data class IconPainter(
    val imagePainter: Painter,
    override val contentDescriptionResource: StringResource
): Icon

@OptIn(ExperimentalResourceApi::class)
sealed class IconVector(
    val imageVector: ImageVector,
    override val contentDescriptionResource: StringResource
): Icon {
    companion object {
        @Composable
        fun barcode() = IconPainter(
            imagePainter = painterResource(Res.drawable.barcode_scan),
            contentDescriptionResource = Res.string.barcode
        )
    }

    data object Heart: IconVector(
        imageVector = Icons.Default.FavoriteBorder,
        contentDescriptionResource = Res.string.favorite
    )
    data object HeartFilled: IconVector(
        imageVector = Icons.Filled.Favorite,
        contentDescriptionResource = Res.string.favorite_filled
    )
    data object Back: IconVector(
        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
        contentDescriptionResource = Res.string.back
    )
    data object Search: IconVector(
        imageVector = Icons.Default.Search,
        contentDescriptionResource = Res.string.search
    )
    data object Cancel: IconVector(
        imageVector = Icons.Default.Search,
        contentDescriptionResource = Res.string.cancel
    )
    data object Add: IconVector(
        imageVector = Icons.Default.Add,
        contentDescriptionResource = Res.string.add
    )
    data object Logout: IconVector(
        imageVector = Icons.AutoMirrored.Filled.Logout,
        contentDescriptionResource = Res.string.log_out
    )
    data object Save: IconVector(
        imageVector = Icons.Default.Save,
        contentDescriptionResource = Res.string.save
    )
    data object Edit: IconVector(
        imageVector = Icons.Default.Edit,
        contentDescriptionResource = Res.string.edit
    )
    data object Email: IconVector(
        imageVector = Icons.Default.Email,
        contentDescriptionResource = Res.string.email
    )
    data object Password: IconVector(
        imageVector = Icons.Default.Password,
        contentDescriptionResource = Res.string.password
    )
    data object Login: IconVector(
        imageVector = Icons.AutoMirrored.Filled.Login,
        contentDescriptionResource = Res.string.login
    )
    data object Account: IconVector(
        imageVector = Icons.Default.AccountCircle,
        contentDescriptionResource = Res.string.account
    )
    data object Info: IconVector(
        imageVector = Icons.Default.Info,
        contentDescriptionResource = Res.string.info
    )
    data object ArrowDown: IconVector(
        imageVector = Icons.Default.KeyboardArrowDown,
        contentDescriptionResource = Res.string.arrow_down
    )
    data object Copy: IconVector(
        imageVector = Icons.Default.ContentCopy,
        contentDescriptionResource = Res.string.copy
    )
    data object Warning: IconVector(
        imageVector = Icons.Default.Error,
        contentDescriptionResource = Res.string.error
    )
    data object Clear: IconVector(
        imageVector = Icons.Default.Clear,
        contentDescriptionResource = Res.string.clear
    )
}