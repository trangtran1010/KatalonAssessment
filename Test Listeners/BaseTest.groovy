import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class BaseTest {


	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
	def sampleBeforeTestCase(TestCaseContext testCaseContext) {
		Map executionProperties = RunConfiguration.getExecutionProperties()
		String driverProp = executionProperties.get("drivers").get("system").get("WebUI").get("browserType")
		if(driverProp == 'HEADLESS_DRIVER') {
			Map<String, Object> generalSettings = RunConfiguration.getExecutionGeneralProperties()
			// Set time out to waiting element loading before throwing error
			generalSettings.put('timeout', 180)

			// Issue: maximizeWindow() is not resizing the Window on Chrome(headless)
			// Ubuntu service does not have access to the display (X11), this setting to set size of browser window for running test
			// Hard-code here and not use getScreenSize() due to avoid to install a list of weight libs to support X11 on server
			// That why we need to update the width and heigh of window-size to match with your screen resolution of your running device
			RunConfiguration.setWebDriverPreferencesProperty("args", ["window-size=1920,1080"])
			WebUI.enableSmartWait()
		}
		WebUI.openBrowser(null)
		WebUI.maximizeWindow()

	}

	@AfterTestCase
	def sampleAfterTestCase(TestCaseContext testCaseContext) {
		def timestamp = new Date().format("YYYY-MM-dd HH-mm-ss")
		String[] testCaseNameArray = testCaseContext.getTestCaseId().split("/")
		String testCaseName = testCaseNameArray[testCaseNameArray.length - 1]
		if(!testCaseContext.getTestCaseStatus().equalsIgnoreCase("PASSED")) {
			WebUI.takeScreenshot("Images/${testCaseName}/${testCaseName} ${timestamp}.png")
			WebUI.closeBrowser()
		}
		WebUI.closeBrowser()
	}


}
