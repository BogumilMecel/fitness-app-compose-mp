package presentation.login

import cafe.adriel.voyager.core.model.ScreenModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update

class LoginScreenModel: ScreenModel {

    val state = MutableStateFlow(LoginState())

    fun onEmailChanged(value: String) {
        state.update {
            it.copy(email = value)
        }
    }

    fun onPasswordChanged(value: String) {
        state.update {
            it.copy(password = value)
        }
    }

    fun onLoginButtonClicked() {

    }

    fun onForgotPasswordClicked() {

    }

    fun onRegisterButtonClicked() {

    }
}