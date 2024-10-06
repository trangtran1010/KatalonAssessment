package nicusnow.common.table
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import nicusnow.fw.lib.BasePage
import com.kms.katalon.core.model.FailureHandling

public class ContactListPage extends BasePage<ContactListPage> {

	def ContactListPage clickDeleteContactButton () {
		WebUI.click(btn('delete'))
		clickOkOnAlertPopup()
		return this
	}

	def ContactListPage clickReturnButton () {
		WebUI.click(btn('return'))
		return this
	}

	def ContactListPage clickEditContactbutton () {
		WebUI.click(btn('edit-contact'))
		return this
	}

	def ContactListPage clickSubmitButton () {
		WebUI.click(btn('submit'))
		return this
	}

	def ContactListPage clickaddNewContactButton () {
		WebUI.click(btn('add-contact'))
		return this
	}

	def ContactListPage verifyDataNotExist (String value) {
		WebUI.verifyElementNotPresent(byXpath("//thead[@class='contactTableHead']/tr/th[text()='Name']//following::td[text()='${value}']"), GlobalVariable.smallSleepTime)
		return this
	}

	def ContactListPage clickOkOnAlertPopup() {
		WebUI.acceptAlert()
		return this
	}

	def ContactListPage clickOnCell (String value) {
		WebUI.click(byXpath("//thead[@class='contactTableHead']/tr/th[text()='Name']//following::td[text()='${value}']"))
		return this
	}

	def boolean isExist(String value) {
		String xpath = "//thead[@class='contactTableHead']/tr/th[text()='Name']//following::td[text()='${value}']"
		return WebUI.verifyElementPresent(byXpath(xpath), GlobalVariable.smallSleepTime, FailureHandling.OPTIONAL)
	}

	def ContactListPage cleanUpDataTest (String value) {
		boolean dataExists = isExist(value)
				if (dataExists) {
					clickOnCell(value)
					clickDeleteContactButton()
				}else {
					return this
				}
	}

	def ContactListPage inputFirstName (String value) {
		clearTextAndSendKeys(txt('firstName'),value)
		return this
	}

	def ContactListPage inputLastName (String value) {
		clearTextAndSendKeys(txt('lastName'),value)
		return this
	}

	def ContactListPage inputBirthDate (String value) {
		clearTextAndSendKeys(txt('birthdate'),value)
		return this
	}

	def ContactListPage inputEmail (String value) {
		clearTextAndSendKeys(txt('email'),value)
		return this
	}

	def ContactListPage inputPhone (String value) {
		clearTextAndSendKeys(txt('phone'),value)
		return this
	}

	def ContactListPage inputStreetAddress1 (String value) {
		clearTextAndSendKeys(txt('street1'),value)
		return this
	}

	def ContactListPage inputStreetAddress2 (String value) {
		clearTextAndSendKeys(txt('street2'),value)
		return this
	}

	def ContactListPage inputCity (String value) {
		clearTextAndSendKeys(txt('city'),value)
		return this
	}

	def ContactListPage inputStateOrProvince (String value) {
		clearTextAndSendKeys(txt('stateProvince'),value)
		return this
	}

	def ContactListPage inputPostalCode (String value) {
		clearTextAndSendKeys(txt('postalCode'),value)
		return this
	}

	def ContactListPage inputCountry (String value) {
		clearTextAndSendKeys(txt('country'),value)
		return this
	}


	def ContactListPage clickDeleteContact() {
		scrollToAndClick(btn('delete'))
		return this
	}

	def ContactListPage verifyDataDisplayOnGrid(String colName, String expected) {
		String actual = " "
		String xPath = "//thead[@class='contactTableHead']/tr/th[text()='${colName}']//following::td[text()='${expected}']"
		if(isExist(expected)) {
			WebUI.waitForElementVisible(byXpath(xPath), 10)
			actual = WebUI.getText(byXpath(xPath))
		}
		KeywordUtil.logInfo("Actual Data on the grid of " + colName + " is: " + actual.toString());

		WebUI.verifyEqual(actual,expected)
		return this
	}

	def ContactListPage verifyDataDisplayOnField(String fieldName, String expected) {
		String xPath = "//label[contains(text(),'${fieldName}')]/following-sibling::span[text()='${expected}']"
		WebUI.waitForElementVisible(byXpath(xPath), 10)
		String actual = WebUI.getText(byXpath(xPath))
		KeywordUtil.logInfo("Actual Data on the field of " + fieldName + " is: " + actual.toString());
		WebUI.verifyEqual(actual,expected)
		return this
	}
}
