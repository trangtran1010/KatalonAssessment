package nicusnow.common.page

import nicusnow.fw.lib.BasePage
import nicusnow.fw.utilities.FileUtils
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class PleaseConfirmPopup extends BasePage<PleaseConfirmPopup>{

	// Please Confirm popup

	def PleaseConfirmPopup verifyConfirmMessage(int value) {
		WebUI.waitForElementNotVisible(byXpath("//table[@role='presentation']//span[@id='body_export_schedule_dialog']"),  GlobalVariable.sleepSomeTime)
		String actualMessage = WebUI.getText(byXpath("//span[@id='body_export_schedule_dialog']//td[contains(text(), 'The export')]"))
		WebUI.verifyEqual(actualMessage, "The export you requested contains ${value} rows which may take a long time to return. It is recommended that you let the system email you the results instead of waiting.")
		return this
	}

	def PleaseConfirmPopup clickMailIt() {
		WebUI.click(btn('Mail it'))
		return this
	}

	def PleaseConfirmPopup clickWaitForIt() {
		WebUI.click(btn('Wait for it'))
		return this
	}

	def PleaseConfirmPopup clickCheckbox() {
		WebUI.click(chk('Remember my decision'))
		return this
	}
}