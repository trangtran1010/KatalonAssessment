package katalon.common.page
import org.openqa.selenium.WebElement
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import katalon.fw.lib.BasePage

public class HeaderPage extends BasePage<HeaderPage> {

	/***
	 * After User Login , we need to verify logged user information 
	 * @return the current page instance
	 */
	def HeaderPage verifyUserLoginSucess () {
		WebUI.verifyElementPresent(byXpath("//h1[text()='Contact List']"), GlobalVariable.smallSleepTime)
		return this
	}

	/***
	 * As post condition, we need to logout the page to reset the state 
	 * @return the current page instance
	 */
	def HeaderPage clickLogout () {
		WebUI.click(btn('logout'))
		return this
	}
}