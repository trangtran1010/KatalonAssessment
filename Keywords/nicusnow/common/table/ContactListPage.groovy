package nicusnow.common.table
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import nicusnow.fw.lib.BasePage


public class ContactListPage extends BasePage<ContactListPage> {

	def ContactListPage clickUpdate () {
		WebUI.click(btn('Update',1))
		return this
	}

	def ContactListPage clickSubmit () {
		WebUI.click(btn('submit'))
		return this
	}
	
	def ContactListPage clickaddNewContactButton () {
		WebUI.click(btn('add-contact'))
		return this
	}
	
	def boolean isDataExist (String value) {
		WebUI.verifyElementPresent(byXpath("//td[text()='${value}']"), GlobalVariable.smallSleepTime)
		return this
	}
	
	def ContactListPage clickOkOnAlertPopup() {
		WebUI.acceptAlert()
		return this
	}
	
	def ContactListPage cleanUpDataTest (String value) {
		boolean isExisting= true
		if (isExisting) {
			WebUI.click(byXpath("//td[text()='${value}']"))
			WebUI.click(btn('delete'))
			clickOkOnAlertPopup()
		}
		return this
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
	
	def ContactListPage verifyDataDisplayOnField(String colName, String expected) {
		String actual = " "
		String xPath = "//thead[@class='contactTableHead']/tr/th[text()='${colName}']//following::td[text()='${expected}']"
		if(!isDataExist(expected)) {
			WebUI.waitForElementVisible(byXpath(xPath), 10)
			actual = WebUI.getText(byXpath(xPath))	
		}
		KeywordUtil.logInfo("Actual Data on the grid of " + colName + " is: " + actual.toString());
		
		WebUI.verifyEqual(actual,expected)
		return this
	}

}
