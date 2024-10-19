package katalon.fw.lib
import org.openqa.selenium.WebElement
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class BasePage <T> extends NElements{

	protected clearTextAndSendKeys(TestObject to, String value) {
		WebUI.clearText(to)
		WebUI.sendKeys(to, value)
	}

	protected static void openBrowser() {
		WebUI.openBrowser(GlobalVariable.env)
		WebUI.maximizeWindow()
	}
	
	protected static void closeAndReopenBrowser() {
		WebUI.closeBrowser()
		WebUI.openBrowser(GlobalVariable.env)
		WebUI.maximizeWindow()
	}
}
