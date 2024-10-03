package nicusnow.fw.lib

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class NElements {


	/***
	 *
	 * @param label - user to input the text shows on the UI of element next to the textbox | input  element 
	 * @param index - user to input the the index of element showing in html
	 * @return  a test object next to the text  which the input text from the user
	 */
	def TestObject txt (label, index = 1) {
		return findTestObject("Common/txt",[('label'):label,('index'):index]);
	}

	/***
	 *
	 * @param label - user to input the text shows on the UI of element next to the button element
	 * @param index - user to input the the index of element showing in html
	 * @return  a test object next to the text  which the input text from the user
	 */
	def TestObject btn (label,index=1) {
		return findTestObject("Common/btn",[('label'):label,('index'):index]);
	}
	/***
	 *
	 * @param label - user to input the text shows on the tab element on the UI
	 * @return  a  tab test object have the text next match with inputed label
	 */
	def TestObject tab (label) {
		return findTestObject("Common/tab",[('label'):label]);
	}


	/***
	 * 
	 * @return  an iframe element
	 */
	def TestObject iframe () {
		return findTestObject("Common/ifrMain");
	}

	/***
	 *
	 * @param label - user to input the text shows on the tab element on the UI
	 * @return  a  checkbok test object have the text next to it
	 */
	def TestObject chk (label) {
		return findTestObject("Common/chk",[('label'):label]);
	}

	/***
	 *
	 * @param label - user to input the text shows on the text next / under to table element on the UI 
	 * @param index - if there are 2 table showing on the page, user should input the index of the table correctly
	 * @return  a  table test object have the name | text next to the table element
	 * 	 match with the label that user input and the order of table on the page
	 */
	def TestObject tbl (label,index=2) {
		return findTestObject("Common/tbl",[('label'):label,('index'):index]);
	}

	/***
	 *
	 * @param parentLabel - user to input the App name (ex: Nicus Core, Nicus Planning, Nicus Cost Transparency)
	 * @param childLabel - the name of Page that user want to navigate to 
	 * @return  the "a/" link test object have the text match with the input text from the user
	 */
	def TestObject nav_left (parentLabel,childLabel) {
		return findTestObject("Common/navpage-left",[('parentLabel'):parentLabel, ('childLabel'):childLabel]);
	}

	/***
	 *
	 * @param label - user to input the text shows on the UI of element
	 * @return  a label test object have the text match with the input text from the user
	 */
	def TestObject lbl (label) {
		return findTestObject("Common/lbl",[('label'):label]);
	}

	/***
	 *
	 * @param label - user to input the text shows on the UI of element under | next the place holder element which is" search textbox"
	 * @return  an input test object have the text next to the element, it should match with the input text from the user
	 */
	def TestObject placeholder (label) {
		return findTestObject("Common/placeholder-search",[('label'):label]);
	}

	/***
	 *
	 * @param label - user to input the text shows on the UI next to lkup element 
	 * @return  a test object have the text match with the input text from the user
	 */
	def TestObject lkup (label) {
		return findTestObject("Common/lkup",[('label'):label]);
	}

	/***
	 *
	 * @param label - user to input the text shows on the UI of element under the "navpage-header"  node
	 * @return  a dropdown list test object have the text next to the element , match with the input text from the user
	 */
	def TestObject listbox (label, index=1) {
		return findTestObject("Common/lstbox",[('label'):label,('index'):index]);
	}

	/***
	 *
	 * @param id - user to input the id of on the UI of element
	 * @return  a test object
	 */
	def TestObject byId (id) {
		return findTestObject("Common/byId",[('id'):id]);
	}

	/***
	 *
	 * @param name - user to input the class name of on the UI of element
	 * @return  a test object
	 */
	def TestObject byClass (name, index=1) {
		return findTestObject("Common/byClass",[('name'):name,('index'):index]);
	}

	/***
	 *
	 * @param xpath - user to input the xpath string to locate an element
	 * @return  a test object
	 */
	def TestObject byXpath (xpath) {
		return findTestObject("Common/xpath",[('xpath'):xpath]);
	}

	/***
	 *
	 * @param option - user to input the option string to locate an element
	 * @return  a test object
	 */
	def TestObject option (value) {
		return findTestObject("Common/option",[('value'):value]);
	}
}

