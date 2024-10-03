
package nicusnow.common.page

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import nicusnow.fw.lib.BasePage
import nicusnow.fw.lib.NPages
import nicusnow.fw.lib.TableCommonMethods

import internal.GlobalVariable

public class OnDataGrid extends BasePage<OnDataGrid> {

	private String grid
	private int indx

	/***
	 * This function will be invoked from another page object class
	 * @param name - Grid Name . Ex- Costs Set Entries, GL Allocation Set Entries,...
	 * @param indx - Default is 2, it works for almost NoN grids, but user can able to update and change when invoke from pages class
	 * @return current page class - OnDataGrid
	 */
	def OnDataGrid setGrid(String name, int indx=2) {
		this.grid = name
		this.indx=indx
		return this
	}

	def RightBar onRightBar () {
		return NPages.nav(RightBar)
	}

	/****
	 * This function use when user want to clean up all rows data all grid by click on check box "All" at the bottom of the each grid
	 * @return current page class - OnDataGrid
	 */
	def OnDataGrid selectAllRows() {
		WebUI.click(chk('Select All'))
		return this
	}

	/****
	 * This function use when user want to clean up all rows data all grid by click on Action on Select Rows at the bottom of the each grid
	 * @return current page class - OnDataGrid
	 */
	def OnDataGrid clickListActionOptionDropdown() {
		WebUI.click(listbox('Select All'))
		return this
	}

	/****
	 * At the bottom of the grid, there is a dropdown list, user open the dropdown list and select Delete to start off delete data on the grid
	 * @return current page class - OnDataGrid
	 */
	def OnDataGrid deleteRows(indexListBox = 1, indexDelete = 1, indexItem = 1) {
		TestObject to = listbox('Select All', indexListBox)
		WebUI.click(to)
		WebUI.selectOptionByIndex(listbox('Select All', indexListBox), indexItem)
		WebUI.waitForElementPresent(btn('Delete', indexDelete), GlobalVariable.sleepSomeTime)
		WebUI.click(btn('Delete', indexDelete))
		return this
	}

	/****
	 * At the bottom of the grid, there is a dropdown list, user open the dropdown list and verify Delete visible
	 * @return current page class - OnDataGrid
	 */
	def OnDataGrid verifyDeleteRowsItemDisplay(String gridName) {
		WebUI.verifyElementVisible(byXpath("//div[contains(@aria-label, '${gridName}')]//option[@action_name='delete_checked']"))
		return this
	}

	/****
	 * At the bottom of the grid, there is a dropdown list, user open the dropdown list and verify Delete visible
	 * @return current page class - OnDataGrid
	 */
	def OnDataGrid verifyDeleteRowsItemNotDisable(String gridName) {
		WebUI.verifyElementNotHasAttribute(byXpath("//div[contains(@aria-label, '${gridName}')]//option[@action_name='delete_checked']"), 'disabled', GlobalVariable.smallSleepTime)
		return this
	}

	/****
	 * This function is to get header columns name and parse to a list of string
	 * @return List <String> headers
	 */
	def List getHeaderRows() {
		List<WebElement> elements = TableCommonMethods.getHeader(tbl(grid,indx),"[@glide_label]/span/a")
		List <String> headers = new ArrayList<>();
		for (WebElement e: elements) {
			String currentText = e.getText()
			WebElement childText= e.findElement(By.xpath("./span"))
			headers.add(currentText.replace(childText.getText(), "") )
		}
		KeywordUtil.logInfo("Actual Header column on the grid of is: " + headers.toString());
		return headers
	}

	/****
	 * This function is to get header columns name and parse to a list of string, and the line data as well
	 * @return List <List<String>> headers + rows
	 * Ex [[Cost Center, Account, Object],[data1, data2,data3],[data4,data5,data6]]
	 */
	def List getDataRowsWithHeader() {
		List<List<String>> rows = new ArrayList<>();
		rows.add(getHeaderRows())
		List<WebElement> erows = TableCommonMethods.getTableDataRows(tbl(grid,indx))
		for (WebElement erow: erows) {
			List<WebElement>  tds = erow.findElements(By.xpath("./td[@class='vt']"))
			List <String> row = new ArrayList()
			for (WebElement td : tds) {
				row.add(td.getText())
			}

			rows.add(row)
		}
		KeywordUtil.logInfo("Actual Grid Data Rows content included header is " + rows.toString());
		return rows
	}

	/****
	 * This function is to get lines data and parse to a list of string
	 * @return List <List<String>> rows only without header
	 * Ex [[data1, data2,data3],[data4,data5,data6]]
	 */
	def List getDataRowsWithOutHeader() {
		List<List<String>> rows = new ArrayList<>();
		List<WebElement> erows = TableCommonMethods.getTableDataRows(tbl(grid,indx))
		for (WebElement erow: erows) {
			List<WebElement>  tds = erow.findElements(By.xpath("./td[@class='vt']"))
			List <String> row = new ArrayList()
			for (WebElement td : tds) {
				row.add(td.getText())
			}

			rows.add(row)
		}
		KeywordUtil.logInfo("Actual Grid Data Rows content without header is " + rows.toString());
		return rows
	}

	/****
	 * This function is to get number of lines data 
	 * @return integer 
	 */
	def int countRows() {
		int count = TableCommonMethods.getTableDataRows(tbl(grid,indx)).size()
		KeywordUtil.logInfo("Actual Row count on the grid is: " + count.toString());
		return count
	}

	/****
	 * This function is to get number of lines data
	 * @return integer
	 */
	def OnDataGrid verifyRowsCountEqual(expected) {
		WebUI.verifyEqual(countRows(), expected)
		return this
	}


	/****
	 * This function is to get number of lines data
	 * @return integer
	 */
	def OnDataGrid verifyGridHeaderIsNotEmpty() {
		KeywordUtil.logInfo("Actual Header Size "  + getHeaderRows().size());
		WebUI.verifyEqual(getHeaderRows().size(), 1)
		return this
	}

	/****
	 * @return true if grid is empty, otherwise false
	 */
	def boolean isEmpty() {
		boolean isEmpty = false
		List<WebElement> elements = TableCommonMethods.getTableDataRows(tbl(grid,indx))
		List <String> rows = new ArrayList<>();
		for (WebElement e: elements) {
			rows.add(e.getText())
		}
		if (rows.size() ==1 && rows.get(0).equals('No records to display'))		{
			isEmpty =  true
		}
		return isEmpty
	}

	/****
	 * Verify the grid is whether empty or not
	 * @return current page class
	 */
	def OnDataGrid verifyEmptyGrid() {
		WebUI.verifyEqual(isEmpty(), true)
		return this
	}

	/***
	 * This function is to get list of cell data by column header name
	 * @param colName - ColName that user want to get data
	 * @return List <String> cells data
	 */
	def List <String> getCellByColName(String colName) {
		List<WebElement> elements = TableCommonMethods.getTableDataRows(tbl(grid,indx)
				,"/td[count("+tbl(grid,indx).findPropertyValue('xpath')+"/thead/tr/th[@glide_label]/span/a[text()=\'"+colName+"\']/ancestor::th/preceding-sibling::th)+1]")

		List <String> rows = new ArrayList<>();

		for (WebElement e: elements) {
			rows.add(e.getText())
		}
		KeywordUtil.logInfo("Actual Data on the grid of " + colName + " is: " + rows.toString());
		return rows
	}

	/***
	 * This function is to click on a specific cell on the grid after user do the search step
	 * @param colName - column header name that user want to search data 
	 * @return current page class
	 */
	def OnDataGrid clickOnCell(String colName) {
		WebElement table = WebUI.findWebElement(tbl(grid,indx), GlobalVariable.smallSleepTime)
		WebElement e = table.findElement(By.xpath('./tbody/tr/'
				+"/td[count("+tbl(grid,indx).findPropertyValue('xpath')
				+"/thead/tr/th[@glide_label]/span/a[text()=\'"+colName+"\']/ancestor::th/preceding-sibling::th)+1]/a"))
		e.click()
		return this
	}

	/***
	 * This function is used when user want to preview the record by clicking on Preview Icon located at the beginning of each data rows
	 * @return current page class
	 */
	def OnDataGrid clickOnPreviewRecordIcon() {
		WebElement table = WebUI.findWebElement(tbl(grid,indx), GlobalVariable.smallSleepTime)
		WebElement e = table.findElement(By.xpath('./tbody/tr/'
				+"/td[2]/a"))
		e.click()
		return this
	}

	/***
	 * After function is used after user click on PreviewRecord icon
	 * @return current page
	 */
	def OnDataGrid clickOpenRecordOnPopUp () {
		WebUI.click(lbl('Open Record'))
		return this
	}

	/****
	 * 
	 * @param colName - Colume header name, wher user want to search data
	 * @param value - the search value
	 * @return current page
	 */
	def OnDataGrid searchData(String colName,value) {
		switchToMainIframe()
		TestObject lkup = byClass('list_header_search_toggle icon-search btn btn-icon table-btn-lg')

		String isShowLkup = WebUI.getAttribute(lkup, 'aria-expanded')

		if (isShowLkup.equals('false')) {
			WebUI.click(lkup)
		}

		WebElement table = WebUI.findWebElement(tbl(grid,indx), GlobalVariable.smallSleepTime)
		WebElement e = table.findElement(By.xpath('./thead/tr[2]'
				+"/td[count("+tbl(grid,indx).findPropertyValue('xpath')
				+"/thead/tr/th[@glide_label]/span/a[text()=\'"+colName+"\']/ancestor::th/preceding-sibling::th)]/following::input[1]"))
		e.clear()
		e.sendKeys(value)
		e.sendKeys((Keys.ENTER).toString())
		return this
	}

	/****
	 * This function is to clean up data test, it is a required pre-condition step
	 * @param index - the index of Delete option in dropdown list
	 * @return current page
	 */
	def OnDataGrid cleanUpDataTest(index = 1) {
		if (!isEmpty()) {
			selectAllRows().deleteRows(index).sleepAlittleTime()
		}
		return this
	}

	/***
	 * This function is used on almost test script, it use for verify display data on grid compare input user
	 * @param colName  - the data on the column that user want to compare
	 * @param expected - expect data to compare
	 * @return current page
	 */
	def OnDataGrid verifyDataDisplayOnField(String colName, String expected) {
		String actual = ""
		if(!isEmpty()) {
			actual = getCellByColName(colName).get(0).toString()
		}
		WebUI.verifyEqual(actual,expected)
		return this
	}

	def int countPagedRows () {
		switchToMainIframe()
		int totalRows = countRows();
		while(onRightBar().isNextPageEnable()) {
			onRightBar().clickNextPage();
			sleepSomeTime()
			totalRows = totalRows + countRows();
		}
		return totalRows
	}

	def OnDataGrid verifyGridTitleMatched() {
		String actualGridTitle = WebUI.getText(byClass('navbar-title list_title'))
		WebUI.verifyEqual(actualGridTitle,grid)
		return this
	}

	def OnDataGrid verifyGridTitlePartialMatched() {
		String actualGridTitle = WebUI.getText(byClass('navbar-title list_title'))
		WebUI.verifyEqual(actualGridTitle.contains(grid),true)
		return this
	}

	/***
	 * Function is open Menu on header by header name
	 */
	def OnDataGrid clickOpenMenuByHeaderName (String headerName) {
		WebUI.click(byXpath("(//th[@glide_label='${headerName}']//i[@role='button'])[1]"))
		return this
	}

	/****
	 * Function is select menu item
	 */
	def OnDataGrid selectMenuItem(String menuItem) {
		WebUI.click(byXpath("//div[@class='context_menu'][contains(@style, 'visibility: visible')]/div[text()='${menuItem}']"))
		return this
	}

	/****
	 * Function is to get total of rows at paging text
	 */
	def int getTotalRows() {
		String totalRowValue=WebUI.getText(byXpath("(//div[@class='vcr_controls']//span[contains(@id, 'total_rows')])[1]"))
		int totalRowsInt = Integer.valueOf(totalRowValue.replaceAll(",", ""));
		return totalRowsInt
	}

	/****
	 * Function is select Update Personalized List
	 */
	def OnDataGrid clickPersonalizeListIcon() {
		WebUI.click(byXpath("//div[@aria-label='${this.grid}']//i[contains(@data-original-title, 'Personalize')]"))
		return this
	}

	/****
	 * This function is to clear text search on column
	 * @param colName - Colume header name, wher user want to clear search data
	 * @return current page
	 */
	def OnDataGrid clearTextSearchOnColumn(String colName) {
		WebElement table = WebUI.findWebElement(tbl(grid,indx), GlobalVariable.smallSleepTime)
		WebElement e = table.findElement(By.xpath('./thead/tr[2]'
				+"/td[count("+tbl(grid,indx).findPropertyValue('xpath')
				+"/thead/tr/th[@glide_label]/span/a[text()='${colName}']/ancestor::th/preceding-sibling::th)]/following::input[1]"))

		e.clear()
		e.sendKeys((Keys.ENTER).toString())
		return this
	}

	/****
	 * Function is return the Column Name on grid
	 */
	def String getColumnName(String colName) {
		WebElement table = WebUI.findWebElement(tbl(grid,indx), GlobalVariable.smallSleepTime)
		String columnName = table.findElement(By.xpath("(//a[@role='button'][text()='${colName}'])[1]")).getText();
		return columnName
	}

	/***
	 * This function is used on almost test script, it use for verify display column on grid
	 * @param colName  - the column that user want to compare
	 * @param expected - expect data to compare
	 * @return current page
	 */
	def OnDataGrid verifyColumnDisplayOnGird(String colName, String expectedValue) {
		String actualValue = getColumnName(colName).toString()
		WebUI.verifyEqual(actualValue, expectedValue)
		return this
	}
	
	/***
	 * This function is used on almost test script, it use for verify display column on grid
	 * @param colName  - the column that user want to compare
	 * @param expected - expect data to compare
	 * @return current page
	 */
	def OnDataGrid verifyDataDisplayOnGird(String colName, String expectedValue) {
		String actualValue = getColumnName(colName).toString()
		WebUI.verifyEqual(actualValue, expectedValue)
		return this
	}
	
//	/***
//	 * This function is used on almost test script, it use for verify display of Date time column on grid
//	 * @param colName  - the column that user want to compare
//	 * @param expected - expect data to compare
//	 * @return current page
//	 */
//	 def OnDataGrid verifyDateTimeDisplayOnGrid (String colName, String expected) {
//	 	String actual = getCellByColName(colName).get(0).toString()
//	 	WebUI.verifyEqual(actual.contains(expected), true)
//	 	return this
//	 }
}