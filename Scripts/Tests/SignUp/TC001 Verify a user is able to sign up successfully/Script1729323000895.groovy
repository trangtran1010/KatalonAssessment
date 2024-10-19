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

'5. Verify User is registered and navigate to Contact List page successfully'
NPages.nav(HeaderPage).verifyUserLoginSucess()

NPages.takeScreenShot()
