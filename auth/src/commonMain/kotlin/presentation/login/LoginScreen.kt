package presentation.login

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import components.FitnessAppTopBar
import utils.getDefaultRootModifier

class LoginScreen: Screen {

    @Composable
    override fun Content() {
        Box(modifier = getDefaultRootModifier()) {
            FitnessAppTopBar(title = "login")
//            HeaderRow(middlePrimaryText = stringResource(id = R.string.login))
//
//            Column(modifier = Modifier.align(Alignment.Center)) {
//                CustomBasicTextField(
//                    value = state.email,
//                    placeholder = stringResource(id = R.string.email_address),
//                    onValueChange = { onEvent(LoginEvent.EnteredEmail(email = it)) },
//                    keyboardOptions = KeyboardOptions().copy(
//                        keyboardType = KeyboardType.Email
//                    ),
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(horizontal = 10.dp),
//                    leadingIcon = IconVector.Email,
//                    testTag = TestTags.EMAIL
//                )
//
//                HeightSpacer(16.dp)
//
//                CustomBasicTextField(
//                    value = state.password,
//                    placeholder = stringResource(id = R.string.password),
//                    onValueChange = { onEvent(LoginEvent.EnteredPassword(password = it)) },
//                    keyboardOptions = KeyboardOptions().copy(
//                        keyboardType = KeyboardType.Password,
//                    ),
//                    visualTransformation = PasswordVisualTransformation(),
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(horizontal = 10.dp),
//                    leadingIcon = IconVector.Password,
//                    testTag = TestTags.PASSWORD
//                )
//
//                HeightSpacer(32.dp)
//
//                CustomButton(
//                    onClick = { onEvent(LoginEvent.LoginButtonClicked) },
//                    modifier = Modifier
//                        .padding(horizontal = 10.dp)
//                        .fillMaxWidth()
//                        .testTag(TestTags.PRIMARY_BUTTON),
//                    leftIcon = IconVector.Login,
//                    text = stringResource(id = R.string.sign_in)
//                )
//
//                HeightSpacer(16.dp)
//
//                Text(
//                    text = stringResource(id = R.string.forgot_password),
//                    style = MaterialTheme.typography.body2,
//                    modifier = Modifier
//                        .testTag(TestTags.FORGOT_PASSWORD)
//                        .clip(defaultRoundedCornerShape())
//                        .clickable { onEvent(LoginEvent.ForgotButtonClicked) }
//                        .padding(
//                            horizontal = 16.dp,
//                            vertical = 8.dp
//                        )
//                )
//            }
//
//            Text(
//                text = stringResource(id = R.string.i_don_t_have_an_account_register),
//                style = MaterialTheme.typography.body2,
//                modifier = Modifier
//                    .padding(bottom = 50.dp)
//                    .clip(defaultRoundedCornerShape())
//                    .clickable { onEvent(LoginEvent.RegisterLoginButtonClicked) }
//                    .padding(
//                        horizontal = 16.dp,
//                        vertical = 8.dp
//                    )
//                    .align(Alignment.BottomCenter)
//                    .testTag(TestTags.REGISTER_BUTTON)
//            )
        }
    }
}