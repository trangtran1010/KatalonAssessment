package nicusnow.common.page
import org.openqa.selenium.WebElement
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import nicusnow.fw.lib.BasePage

public class HeaderPage extends BasePage<HeaderPage> {

	/***
	 * After User Login , we need to verify logged user information 
	 * @return the current page instance
	 */
	def HeaderPage verifyUserLoginSucess () {
		WebUI.verifyElementPresent(btn('logout'), GlobalVariable.smallSleepTime)
		return this
	}

	/***
	 * As post condition, we need to logout the page to reset the state 
	 * @return the current page instance
	 */
	def HeaderPage clickLogout () {
		WebUI.click(btn('Logout'))
		return this
	}
}