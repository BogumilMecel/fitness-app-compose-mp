package com.gmail.bogumilmecel2.ui.components.base

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.gmail.bogumilmecel2.ui.R
import com.gmail.bogumilmecel2.ui.theme.FitnessAppTheme

@Composable
fun CustomIcon(
    modifier: Modifier = Modifier,
    icon: Icon,
    tint: Color = FitnessAppTheme.colors.Primary
) {
    when(icon) {
        is IconPainter -> {
            CustomIcon(
                painter = icon,
                tint = tint,
                modifier = modifier
            )
        }

        is IconVector -> {
            CustomIcon(
                vector = icon,
                tint = tint,
                modifier = modifier
            )
        }
    }
}

@Composable
private fun CustomIcon(
    modifier: Modifier = Modifier,
    vector: IconVector,
    tint: Color = FitnessAppTheme.colors.Primary
) = with(vector) {
    Icon(
        modifier = modifier,
        imageVector = imageVector,
        contentDescription = stringResource(id = vector.contentDescriptionId),
        tint = tint
    )
}

@Composable
private fun CustomIcon(
    modifier: Modifier = Modifier,
    painter: IconPainter,
    tint: Color = FitnessAppTheme.colors.Primary
) = with(painter) {
    Icon(
        modifier = modifier,
        painter = imagePainter,
        contentDescription = stringResource(id = contentDescriptionId),
        tint = tint
    )
}

interface Icon {
    val contentDescriptionId: Int
}

data class IconPainter(
    val imagePainter: Painter,
    override val contentDescriptionId: Int
): Icon

sealed class IconVector(
    val imageVector: ImageVector,
    override val contentDescriptionId: Int
): Icon {
    companion object {
        @Composable
        fun barcode() = IconPainter(
            imagePainter = painterResource(id = R.drawable.barcode_scan),
            contentDescriptionId = R.string.barcode
        )
    }

    data object Heart: IconVector(
        imageVector = Icons.Default.FavoriteBorder,
        contentDescriptionId = R.string.favorite
    )
    data object HeartFilled: IconVector(
        imageVector = Icons.Filled.Favorite,
        contentDescriptionId = R.string.favorite_filled
    )
    data object Back: IconVector(
        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
        contentDescriptionId = R.string.back
    )
    data object Search: IconVector(
        imageVector = Icons.Default.Search,
        contentDescriptionId = R.string.search
    )
    data object Cancel: IconVector(
        imageVector = Icons.Default.Search,
        contentDescriptionId = R.string.cancel
    )
    data object Add: IconVector(
        imageVector = Icons.Default.Add,
        contentDescriptionId = R.string.add
    )
    data object Logout: IconVector(
        imageVector = Icons.AutoMirrored.Filled.Logout,
        contentDescriptionId = R.string.log_out
    )
    data object Save: IconVector(
        imageVector = Icons.Default.Save,
        contentDescriptionId = R.string.save
    )
    data object Edit: IconVector(
        imageVector = Icons.Default.Edit,
        contentDescriptionId = R.string.edit
    )
    data object Email: IconVector(
        imageVector = Icons.Default.Email,
        contentDescriptionId = R.string.email
    )
    data object Password: IconVector(
        imageVector = Icons.Default.Password,
        contentDescriptionId = R.string.password
    )
    data object Login: IconVector(
        imageVector = Icons.AutoMirrored.Filled.Login,
        contentDescriptionId = R.string.login
    )
    data object Account: IconVector(
        imageVector = Icons.Default.AccountCircle,
        contentDescriptionId = R.string.account
    )
    data object Info: IconVector(
        imageVector = Icons.Default.Info,
        contentDescriptionId = R.string.info
    )
    data object ArrowDown: IconVector(
        imageVector = Icons.Default.KeyboardArrowDown,
        contentDescriptionId = R.string.arrow_down
    )
    data object Copy: IconVector(
        imageVector = Icons.Default.ContentCopy,
        contentDescriptionId = R.string.copy
    )
    data object Warning: IconVector(
        imageVector = Icons.Default.Error,
        contentDescriptionId = R.string.error
    )
    data object Clear: IconVector(
        imageVector = Icons.Default.Clear,
        contentDescriptionId = R.string.clear
    )
}