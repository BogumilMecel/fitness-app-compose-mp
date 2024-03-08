
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import theme.FitnessAppTheme

@Composable
fun App() {
    FitnessAppTheme(darkTheme = isSystemInDarkTheme()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = FitnessAppTheme.colors.background)
        ) {
            Text(
                text = "test string",
                color = FitnessAppTheme.colors.contentPrimary
            )
        }
    }
}