package components

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import theme.FitnessAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FitnessAppTopBar(
    title: String,
    onBackPressed: (() -> Unit)? = null
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = title,
                color = FitnessAppTheme.colors.contentPrimary,
                style = FitnessAppTheme.typography.headlineSmall
            )
        },
        navigationIcon = {
            onBackPressed?.let {
                FitnessAppIconButton(
                    onClick = it,
                    icon = IconVector.Back
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = FitnessAppTheme.colors.background)
    )
}