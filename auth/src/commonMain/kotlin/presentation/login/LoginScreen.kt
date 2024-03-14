package presentation.login

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.koin.getScreenModel
import com.gmail.bogumilmecel2.ui.SharedRes
import components.FitnessAppButton
import components.FitnessAppTextField
import components.FitnessAppTopBar
import components.HorizontalSpacer
import components.IconVector
import dev.icerock.moko.resources.compose.stringResource
import theme.FitnessAppTheme
import utils.getDefaultRootModifier

class LoginScreen : Screen {

    @Composable
    override fun Content() {
        val model = getScreenModel<LoginScreenModel>()
        val state by model.state.collectAsState()

        Column(modifier = getDefaultRootModifier()) {
            FitnessAppTopBar(title = stringResource(SharedRes.strings.login))

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                FitnessAppTextField(
                    value = state.email,
                    label = stringResource(SharedRes.strings.email_address),
                    onValueChange = { model.onEmailChanged(it) },
                    leadingIcon = IconVector.Email
                )

                HorizontalSpacer()

                FitnessAppTextField(
                    value = state.password,
                    label = stringResource(resource = SharedRes.strings.password),
                    onValueChange = model::onPasswordChanged,
                    leadingIcon = IconVector.Password
                )

                HorizontalSpacer(size = 24.dp)

                FitnessAppButton(
                    onClick = model::onLoginButtonClicked,
                    startIcon = IconVector.Login,
                    text = stringResource(SharedRes.strings.sign_in)
                )

                HorizontalSpacer()

                Text(
                    text = stringResource(SharedRes.strings.forgot_password),
                    style = FitnessAppTheme.typography.bodyMedium,
                    color = FitnessAppTheme.colors.contentSecondary,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable(onClick = model::onForgotPasswordClicked)
                )
            }

            Text(
                text = stringResource(SharedRes.strings.i_don_t_have_an_account_register),
                style = FitnessAppTheme.typography.bodyMedium,
                color = FitnessAppTheme.colors.contentPrimary,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 64.dp)
                    .clickable(onClick = model::onRegisterButtonClicked)
            )
        }
    }
}