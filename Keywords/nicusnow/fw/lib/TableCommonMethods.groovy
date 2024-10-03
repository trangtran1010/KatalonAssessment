package nicusnow.fw.lib

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable


public class TableCommonMethods {

	/**
	 * Get list of header of a specific table
	 * @param  table TestObject
	 * @return List<WebElement>
	 */
	static List<WebElement> getHeader(TestObject tblobject, String outerTagName) {
		WebElement table = WebUI.findWebElement(tblobject, GlobalVariable.smallSleepTime)
		List<WebElement> header =table.findElements(By.xpath("./thead/tr/th" + outerTagName))
		return header;
	}


	/**
	 * locate search row element on the grid
	 * @param  table TestObject
	 * @return List<WebElement>
	 */
	static List<WebElement> getSearchRow(TestObject tblobject, String outerTagName) {
		WebElement table = WebUI.findWebElement(tblobject, GlobalVariable.smallSleepTime)
		List<WebElement> header =table.findElements(By.xpath("./thead/tr[2]" + outerTagName))
		return header;
	}

	/**
	 * Get list of row of a specific table
	 * @param  table TestObject
	 * @return List<WebElement>
	 */
	static List<WebElement> getTableDataRows(TestObject tblobject,String outerTagName = "") {
		WebElement table = WebUI.findWebElement(tblobject, GlobalVariable.smallSleepTime)
		List<WebElement> rows =table.findElements(By.xpath("./tbody/tr" + outerTagName))

		return rows;
	}
}

