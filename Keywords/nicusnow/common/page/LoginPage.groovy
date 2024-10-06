package nicusnow.common.page
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.util.CryptoUtil

import internal.GlobalVariable
import nicusnow.fw.lib.BasePage

class LoginPage extends BasePage<LoginPage>{


	def LoginPage enterCredential (String user = GlobalVariable.userEmail) {
		WebUI.navigateToUrl(GlobalVariable.env)
		String pwd = CryptoUtil.decode(CryptoUtil.getDefault(GlobalVariable.pwd))
		WebUI.sendKeys(byId('email'),user)
		WebUI.sendKeys(byId('password'),pwd)
		return this
	}

	def LoginPage clickSubmit () {
		WebUI.click(btn('submit'))
		return this
	}
	
	def LoginPage navigateToSpecificPage (String env = GlobalVariable.env) {
		WebUI.navigateToUrl(env)
		return this
	}
	
	def LoginPage openLoginPage () {
		WebUI.navigateToUrl(GlobalVariable.env)
		return this
	}
	
	def LoginPage clickSignUpButton () {
		WebUI.click(btn('signup'))
		return this
	}
}