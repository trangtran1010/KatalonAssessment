import katalon.common.page.HeaderPage
import katalon.common.page.LoginPage
import katalon.common.page.SignUpPage
import katalon.common.table.ContactListPage
import katalon.fw.lib.NPages

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


