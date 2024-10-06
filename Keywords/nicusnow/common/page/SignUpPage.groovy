package nicusnow.common.page
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import nicusnow.fw.lib.BasePage

public class SignUpPage extends BasePage<SignUpPage>{

	def SignUpPage clickSubmitButton () {
		WebUI.click(btn('submit'))
		return this
	}

	def SignUpPage inputFirstName (String value) {
		clearTextAndSendKeys(txt('firstName'),value)
		return this
	}

	def SignUpPage inputLastName (String value) {
		clearTextAndSendKeys(txt('lastName'),value)
		return this
	}

	def SignUpPage inputEmail (String value) {
		clearTextAndSendKeys(txt('email'),value)
		return this
	}

	def SignUpPage inputPassword (String value) {
		clearTextAndSendKeys(txt('password'),value)
		return this
	}
}
