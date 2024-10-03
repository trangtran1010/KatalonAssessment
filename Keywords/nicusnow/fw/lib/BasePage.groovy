package nicusnow.fw.lib
import org.openqa.selenium.WebElement
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class BasePage <T> extends NElements{

	protected T switchToMainIframe () {

		boolean isExisting= false

		isExisting = WebUI.verifyElementPresent(iframe(), GlobalVariable.smallSleepTime,FailureHandling.OPTIONAL)
		if (isExisting) {
			WebUI.switchToFrame(iframe(),3)
		}
		return this
	}

	protected T switchOutIframe() {
		WebUI.switchToDefaultContent()
		return this
	}

	protected  boolean hasAttribute(TestObject e, String attributeName) {
		return WebUI.getAttribute(e, attributeName, FailureHandling.OPTIONAL)
	}

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

	protected scrollToAndSendKeys(TestObject to, String value) {
		WebUI.scrollToElement(to, 0)
		WebUI.clearText(to)
		WebUI.sendKeys(to, value)
	}

	protected scrollToAndClick(TestObject to) {
		WebUI.scrollToElement(to, 0)
		WebUI.click(to)
	}

	protected T switchToWindow(int ind=1) {
		WebUI.switchToWindowIndex(ind)
	}

	protected T switchToWindowTitle(String title) {
		WebUI.switchToWindowTitle(title)
	}

	/**
	 * Try to scroll the screen to the web element
	 * The reason have this function b/c scroll built-in of katalon do not work on the special page of the Nicus system
	 * @param element
	 */
	protected scrollToObject(WebElement element){
		WebUI.executeJavaScript("arguments[0].scrollIntoView(true)", Arrays.asList(element))
		int desiredY = (element.size['height'] / 2) + element.location['y']
		int windowH = 0
		WebUI.executeJavaScript("arguments[0] = window.innerHeight", Arrays.asList(windowH))
		int windowY = 0
		WebUI.executeJavaScript("arguments[0] = window.pageYOffset", Arrays.asList(windowY))
		int currentY = (windowH / 2) + windowY
		int scrollYBy = desiredY - currentY
		WebUI.executeJavaScript("window.scrollBy(0, arguments[0])", Arrays.asList(scrollYBy))
		return this
	}
	
	protected static void closeAndReopenBrowser() {
		WebUI.closeBrowser()
		WebUI.openBrowser(null)
		WebUI.maximizeWindow()
	}

}
