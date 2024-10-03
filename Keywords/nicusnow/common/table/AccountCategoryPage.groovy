package nicusnow.common.table

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import nicusnow.common.page.OnDataGrid
import nicusnow.fw.lib.BasePage
import nicusnow.fw.lib.NPages

public class AccountCategoryPage extends BasePage<AccountCategoryPage> {

	def OnDataGrid onGrid () {
		return NPages.nav(OnDataGrid).setGrid('Common Account Categories')
	}

	def AccountCategoryPage clickUpdate () {
		WebUI.click(btn('Update',1))
		return this
	}

	def AccountCategoryPage clickSubmit () {
		WebUI.click(btn('Submit',2))
		return this
	}

	def AccountCategoryPage inputAccCate (String value) {
		clearTextAndSendKeys(txt('Account Category'),value)
		return this
	}

	def AccountCategoryPage inputDefaultFlexLevel (String value) {
		clearTextAndSendKeys(txt('Default Flex Level'),value)
		return this
	}

	def AccountCategoryPage checkActive() {
		WebUI.click(chk('Active?'))
		return this
	}

	def AccountCategoryPage inputAccCateTextAttr01 (String value) {
		scrollToAndSendKeys(txt('Account Category Text Attribute 01'), value)
		return this
	}

	def AccountCategoryPage inputAccCateTextAttr02 (String value) {
		scrollToAndSendKeys(txt('Account Category Text Attribute 02'), value)
		return this
	}

	def AccountCategoryPage inputAccCateTextAttr03 (String value) {
		scrollToAndSendKeys(txt('Account Category Text Attribute 03'), value)
		return this
	}

	def AccountCategoryPage inputAccCateTextAttr04 (String value) {
		scrollToAndSendKeys(txt('Account Category Text Attribute 04'), value)
		return this
	}

	def AccountCategoryPage inputAccCateTextAttr05 (String value) {
		scrollToAndSendKeys(txt('Account Category Text Attribute 05'), value)
		return this
	}

	def AccountCategoryPage inputAccCateTextAttr06 (String value) {
		scrollToAndSendKeys(txt('Account Category Text Attribute 06'), value)
		return this
	}

	def AccountCategoryPage inputAccCateTextAttr07 (String value) {
		scrollToAndSendKeys(txt('Account Category Text Attribute 07'), value)
		return this
	}

	def AccountCategoryPage inputAccCateTextAttr08 (String value) {
		scrollToAndSendKeys(txt('Account Category Text Attribute 08'), value)
		return this
	}

	def AccountCategoryPage inputAccCateTextAttr09 (String value) {
		scrollToAndSendKeys(txt('Account Category Text Attribute 09'), value)
		return this
	}

	def AccountCategoryPage inputAccCateTextAttr10 (String value) {
		scrollToAndSendKeys(txt('Account Category Text Attribute 10'), value)
		return this
	}

	def AccountCategoryPage inputAccCateTextAttr11 (String value) {
		scrollToAndSendKeys(txt('Account Category Text Attribute 11'), value)
		return this
	}

	def AccountCategoryPage inputAccCateTextAttr12 (String value) {
		scrollToAndSendKeys(txt('Account Category Text Attribute 12'), value)
		return this
	}

	def AccountCategoryPage inputAccCateTextAttr13 (String value) {
		scrollToAndSendKeys(txt('Account Category Text Attribute 13'), value)
		return this
	}

	def AccountCategoryPage inputAccCateTextAttr14 (String value) {
		scrollToAndSendKeys(txt('Account Category Text Attribute 14'), value)
		return this
	}

	def AccountCategoryPage inputAccCateTextAttr15 (String value) {
		scrollToAndSendKeys(txt('Account Category Text Attribute 15'), value)
		return this
	}

	def AccountCategoryPage inputAccCateTextAttr16 (String value) {
		scrollToAndSendKeys(txt('Account Category Text Attribute 16'), value)
		return this
	}

	def AccountCategoryPage inputAccCateTextAttr17 (String value) {
		scrollToAndSendKeys(txt('Account Category Text Attribute 17'), value)
		return this
	}

	def AccountCategoryPage inputAccCateTextAttr18 (String value) {
		scrollToAndSendKeys(txt('Account Category Text Attribute 18'), value)
		return this
	}

	def AccountCategoryPage inputAccCateTextAttr19 (String value) {
		scrollToAndSendKeys(txt('Account Category Text Attribute 19'), value)
		return this
	}

	def AccountCategoryPage inputAccCateTextAttr20 (String value) {
		scrollToAndSendKeys(txt('Account Category Text Attribute 20'), value)
		return this
	}

	def AccountCategoryPage checkAccCateFlagAttr01() {
		scrollToAndClick(chk('Account Category Flag Attribute 01'))
		return this
	}

	def AccountCategoryPage checkAccCateFlagAttr02() {
		scrollToAndClick(chk('Account Category Flag Attribute 02'))
		return this
	}

	def AccountCategoryPage checkAccCateFlagAttr03() {
		scrollToAndClick(chk('Account Category Flag Attribute 03'))
		return this
	}

	def AccountCategoryPage checkAccCateFlagAttr04() {
		scrollToAndClick(chk('Account Category Flag Attribute 04'))
		return this
	}

	def AccountCategoryPage checkAccCateFlagAttr05() {
		scrollToAndClick(chk('Account Category Flag Attribute 05'))
		return this
	}

	def AccountCategoryPage inputAccCateNumAttr01 (String value) {
		scrollToAndSendKeys(txt('Account Category Numeric Attribute 01'), value)
		return this
	}

	def AccountCategoryPage inputAccCateNumAttr02 (String value) {
		scrollToAndSendKeys(txt('Account Category Numeric Attribute 02'), value)
		return this
	}

	def AccountCategoryPage inputAccCateNumAttr03 (String value) {
		scrollToAndSendKeys(txt('Account Category Numeric Attribute 03'), value)
		return this
	}

	def AccountCategoryPage inputAccCateNumAttr04 (String value) {
		scrollToAndSendKeys(txt('Account Category Numeric Attribute 04'), value)
		return this
	}

	def AccountCategoryPage inputAccCateNumAttr05 (String value) {
		scrollToAndSendKeys(txt('Account Category Numeric Attribute 05'), value)
		return this
	}

	def AccountCategoryPage inputAccCateDateAttr01 (String value) {
		scrollToAndSendKeys(txt('Account Category Date Attribute 01'), value)
		return this
	}

	def AccountCategoryPage inputAccCateDateAttr02 (String value) {
		scrollToAndSendKeys(txt('Account Category Date Attribute 02'), value)
		return this
	}

	def AccountCategoryPage inputAccCateDateAttr03 (String value) {
		scrollToAndSendKeys(txt('Account Category Date Attribute 03'), value)
		return this
	}

	def AccountCategoryPage inputAccCateDateAttr04 (String value) {
		scrollToAndSendKeys(txt('Account Category Date Attribute 04'), value)
		return this
	}

	def AccountCategoryPage inputAccCateDateAttr05 (String value) {
		scrollToAndSendKeys(txt('Account Category Date Attribute 05'), value)
		return this
	}

	def AccountCategoryPage inputNotes (String value) {
		clearTextAndSendKeys(txt('Notes'), value)
		return this
	}

	def AccountCategoryPage clickTabActivities () {
		WebUI.click(tab('Activities'))
		return this
	}

	def AccountCategoryPage clickTabAttrFields () {
		WebUI.click(tab('Attribute Fields'))
		return this
	}

	def AccountCategoryPage clickDelete() {
		scrollToAndClick(btn('Delete',2))
		return this
	}

	def AccountCategoryPage clickDeleteOnConfrimation() {
		WebUI.click(btn('Delete',3))
		return this
	}

	def AccountCategoryPage verifyErrorMsg(String errorMsg) {
		String actualMessage = WebUI.getText(byId('output_messages')).replace('\n', '.')
		WebUI.verifyMatch(actualMessage, errorMsg , true)
		return this
	}
}
