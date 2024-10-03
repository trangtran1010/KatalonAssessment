package nicusnow.common.page
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import nicusnow.fw.lib.BasePage

class LeftNavigator extends BasePage<LeftNavigator>{

	/**
	 * On the Left navigator, there is a filter for user to input the module/features/tables... to navigate to
	 * @param  searchText  - the text which user to input to search
	 */

	def LeftNavigator filterAModule(searchText) {
		WebUI.click(placeholder('Filter navigator'))
		WebUI.clearText(placeholder('Filter navigator'))
		WebUI.sendKeys(placeholder('Filter navigator'), searchText)
		return this
	}

	/**
	 * User use this to navigate to specific module from the left navigator
	 * @param  module  - the module to open
	 */

	def LeftNavigator searchAndNavigateToPage(searchText, parentName,childName) {
		filterAModule(searchText)
		WebUI.click(nav_left(parentName, childName))
		return this
	}
}