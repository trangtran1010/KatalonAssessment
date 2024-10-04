import nicusnow.common.page.HeaderPage
import nicusnow.common.page.LoginPage
import nicusnow.common.table.ContactListPage
import nicusnow.fw.lib.NPages

'1. User enter credential to login to the system'
NPages.nav(LoginPage).enterCredential().clickSubmit()

'2. Verify user logined sucessfully'
NPages.nav(HeaderPage).verifyUserLoginSucess()

'3. On Contact List page, user find a contact list which is data to test to clean up before insert new'
NPages.nav(ContactListPage).cleanUpDataTest(contact_name)

NPages.takeScreenShot()

'4. Click Add a New Contact button'
NPages.nav(ContactListPage).clickaddNewContactButton()

'5. On the Contact Record page > Input  First Name, Last Name, Date of Birth, Email, Phone, Street Address 1, Street Address 2, City, State or Province, Postal Code, Country'
NPages.nav(ContactListPage).inputFirstName(first_name)
	.inputLastName(last_name)
	.inputBirthDate(date_of_birth)
	.inputEmail(email)
	.inputPhone(phone)
	.inputStreetAddress1(street_address_1)
	.inputStreetAddress2(street_address_2)
	.inputCity(city)
	.inputStateOrProvince(state_province)
	.inputPostalCode(postal_code)
	.inputCountry(country)
		
'6. Click submit button'
NPages.nav(ContactListPage).clickSubmitButton()

//'7. After creating Contact, User need to verify the created data should be displayed correctly'
//NPages.nav(ContactListPage).verifyDataDisplayOnField('Name', contact_name)
//	.verifyDataDisplayOnField('Email', email)

//NPages.takeScreenShot()

'8. User click on Contact in the column Name to open record detail page'
NPages.nav(ContactListPage).clickOnCell('Name', contact_name)
	
'9. Click Delete contact button'
NPages.nav(ContactListPage).clickDeleteContactButton()

'10. After deleting Contact, User need to verify the created data should be removed from table'
NPages.nav(ContactListPage).verifyDataNotExist(contact_name)

NPages.takeScreenShot()

'11. Log out the app'
NPages.nav(HeaderPage).clickLogout()
