package katalon.fw.lib
import org.openqa.selenium.WebElement
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class BasePage <T> extends NElements{

	/**
	 * Try to stop a little time
	 * Return page object class
	 */
	protected T sleepAlittleTime() {
		WebUI.delay(GlobalVariable.smallSleepTime)
		return this
	}

	/**
	 * Try to stop a some time, it is longer than sleepAlittleTIme
	 * Return page object class
	 */
	protected T sleepSomeTime() {
		WebUI.delay(GlobalVariable.sleepSomeTime)
		return this
	}

	/**
	 * Try to stop a some time, it is longer than sleepSomeTime 10s
	 * Return page object class
	 */
	protected T sleepTime() {
		WebUI.delay(GlobalVariable.sleepTime)
	}

	protected T refreshPage() {
		WebUI.refresh()
		return this
	}

	protected clearTextAndSendKeys(TestObject to, String value) {
		WebUI.clearText(to)
		WebUI.sendKeys(to, value)
	}

	protected static void closeAndReopenBrowser() {
		WebUI.closeBrowser()
		WebUI.openBrowser(null)
		WebUI.maximizeWindow()
	}
}
