import katalon.common.page.HeaderPage
import katalon.common.page.LoginPage
import katalon.common.page.SignUpPage
import katalon.common.table.ContactListPage
import katalon.fw.lib.NPages

'1. User enter open the system'
NPages.nav(LoginPage).openBrowser()

'2. User click Sign up button to open Add User page'
NPages.nav(LoginPage).clickSignUpButton()

'3. On Sign up page, User enter First Name, Last Name, Email, Password'
String generateEmail() {
	return "signup" + (new Random().nextInt(10000)) + "@gmail.com"
}

String email = generateEmail()

NPages.nav(SignUpPage).inputFirstName(first_name)
	.inputLastName(last_name)
	.inputEmail(email)
	.inputPassword(password)
	
'4. Click Submit button'
NPages.nav(SignUpPage).clickSubmitButton()

'5. User close and re-open app'
NPages.nav(LoginPage).closeAndReopenBrowser()

'6. User enter credential to login to the system'
NPages.nav(LoginPage).enterCredential(email, password).clickSubmit()

'7. Verify user logined sucessfully'
NPages.nav(HeaderPage).verifyUserLoginSucess()

NPages.takeScreenShot()
