package presentation.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.koin.getScreenModel
import com.gmail.bogumilmecel2.ui.SharedRes
import components.FitnessAppTextField
import components.FitnessAppTopBar
import dev.icerock.moko.resources.compose.stringResource
import utils.getDefaultRootModifier

class LoginScreen : Screen {

    @Composable
    override fun Content() {
        val model = getScreenModel<LoginScreenModel>()
        val state by model.state.collectAsState()

        Column(modifier = getDefaultRootModifier()) {
            FitnessAppTopBar(
                title = stringResource(SharedRes.strings.login),
                subTitle = "Subtitle",
                onBackPressed = {

                }
            )

//            Column(
//                modifier = Modifier
//                    .weight(1f)
//                    .padding(horizontal = 16.dp),
//                verticalArrangement = Arrangement.Center,
//            ) {
                FitnessAppTextField(
                    value = state.email,
                    label = stringResource(SharedRes.strings.email),
                    onValueChange = { model.onEmailChanged(it) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp),
                )
//
//                HorizontalSpacer(16.dp)
//
//                FitnessAppTextField(
//                    value = state.password,
//                    label = stringResource(resource = Res.string.password),
//                    onValueChange = { onEvent(LoginEvent.EnteredPassword(password = it)) },
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(horizontal = 10.dp),
//                )
//
//                HorizontalSpacer(32.dp)
//
////                CustomButton(
////                    onClick = { onEvent(LoginEvent.LoginButtonClicked) },
////                    modifier = Modifier
////                        .padding(horizontal = 10.dp)
////                        .fillMaxWidth()
////                    leftIcon = IconVector.Login,
////                    text = stringResource(id = R.string.sign_in)
////                )
//
//                HorizontalSpacer(16.dp)
//
//                Text(
//                    text = stringResource(resource = Res.string.forgot_password),
//                    style = FitnessAppTheme.typography.bodyMedium,
//                    modifier = Modifier
//                        .clickable { onEvent(LoginEvent.ForgotButtonClicked) }
//                        .padding(
//                            horizontal = 16.dp,
//                            vertical = 8.dp
//                        )
//                )
//            }
//
//            Text(
//                text = stringResource(resource = Res.string.i_don_t_have_an_account_register),
//                style = FitnessAppTheme.typography.bodyMedium,
//                modifier = Modifier
//                    .padding(bottom = 50.dp)
//                    .clickable { onEvent(LoginEvent.RegisterLoginButtonClicked) }
//                    .padding(
//                        horizontal = 16.dp,
//                        vertical = 8.dp
//                    )
//            )
        }
    }
}