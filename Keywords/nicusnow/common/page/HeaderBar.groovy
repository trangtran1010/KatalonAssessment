package nicusnow.common.page
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys
import internal.GlobalVariable
import nicusnow.fw.lib.BasePage

public class HeaderBar extends BasePage<HeaderBar>{

	def HeaderBar clickExport () {
		WebUI.click(btn('Export'))
		return this
	}

	def HeaderBar clickImport () {
		WebUI.click(btn('Import'))
		return this
	}

	def HeaderBar clickNew() {
		WebUI.click(btn('New'))
		return this
	}

	def HeaderBar clickAdditionalActionMenu() {
		WebUI.click(btn('additional actions menu'))
		return this
	}

	/***
	 * As post condition, we need to logout the page to reset the state
	 * @return the current page instance
	 */
	def HeaderBar clickReloadForm () {
		WebUI.click(lbl('Reload form'))
		return this
	}

	def HeaderBar clickBack() {
		WebUI.click(btn('Back'))
		return this
	}

	def HeaderBar verifyNewExportImportButtonExist() {
		WebUI.verifyElementPresent(btn('New'), GlobalVariable.smallSleepTime)
		WebUI.verifyElementPresent(btn('Export'),GlobalVariable.smallSleepTime )
		WebUI.verifyElementPresent(btn('Import'),GlobalVariable.smallSleepTime )
		return this
	}

	def HeaderBar verifyNotExistNewButton() {
		WebUI.verifyElementNotPresent(btn('New'), GlobalVariable.smallSleepTime)
		return this
	}
	
	/****
	 * This functions use when user want to select the option and search on Search Dropdown at the top of the each header bar
	 * @return current page class - HeaderBar
	 */
	def HeaderBar clickOnListSearchDropdownHeader(int index=1) {
		WebUI.click(byClass("form-control default-focus-outline", index))
		return this
	}

	def HeaderBar clickOnChooseOption(String option, int index=1) {
		WebUI.selectOptionByLabel(byClass("form-control default-focus-outline", index), option, false)
		return this
	}

	def HeaderBar inputSearchValueOnHeader(String searchValue) {
		clearTextAndSendKeys(txt('Search'),searchValue)
		WebUI.sendKeys(txt('Search'), (Keys.ENTER).toString())
		sleepSomeTime()
		return this
	}		

}
