import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import nicusnow.common.page.HeaderPage
import nicusnow.common.page.LoginPage
import nicusnow.common.page.SignUpPage
import nicusnow.common.table.ContactListPage
import nicusnow.fw.lib.NPages

'1. User enter credential to login to the system'
NPages.nav(LoginPage).enterCredential().clickSubmit()

'2. Verify user logined sucessfully'
NPages.nav(HeaderPage).verifyUserLoginSucess()

'3. User detete user with the same email before register new user'
NPages.nav(ContactListPage).cleanUpDataTest(email)

'4. User close and open system'
NPages.nav(LoginPage).closeAndReopenBrowser()

'4. User click Sign up button to open Add User page'
NPages.nav(LoginPage).clickSignUpButton()

'3. On Sign up page, User enter First Name, Last Name, Email, Password'
NPages.nav(SignUpPage).inputFirstName(first_name)
	.inputLastName(last_name)
	.inputEmail(email)
	.inputPassword(password)
	
'4. Click Submit button'
NPages.nav(SignUpPage).clickSubmitButton()

'5. Verify User is registered and login successfully'
NPages.nav(HeaderPage).verifyUserLoginSucess()

NPages.takeScreenShot()


