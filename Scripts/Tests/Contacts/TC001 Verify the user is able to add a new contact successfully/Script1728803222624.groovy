import katalon.common.page.HeaderPage
import katalon.common.page.LoginPage
import katalon.common.table.ContactListPage
import katalon.fw.lib.NPages

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

'7. After creating Contact, User need to verify the created data should be displayed on table correctly'
NPages.nav(ContactListPage).verifyDataDisplayOnGrid('Name', contact_name)
	.verifyDataDisplayOnGrid('Birthdate', date_of_birth)
	.verifyDataDisplayOnGrid('Email', email)
	.verifyDataDisplayOnGrid('Phone', phone)
	.verifyDataDisplayOnGrid('Address', street_address_1 + " " + street_address_2)
	.verifyDataDisplayOnGrid('City, State/Province, Postal Code', city + " " + state_province + " " + postal_code)
	.verifyDataDisplayOnGrid('Country', country)

NPages.takeScreenShot()

'8. User click on Contact in the column Name to open record detail page'
NPages.nav(ContactListPage).clickOnCell(contact_name)

'9. User need to verify the created data should be displayed in details correctly'
NPages.nav(ContactListPage).verifyDataDisplayOnField('First Name', first_name)
	.verifyDataDisplayOnField('Last Name', last_name)
	.verifyDataDisplayOnField('Date of Birth', date_of_birth)
	.verifyDataDisplayOnField('Email', email)
	.verifyDataDisplayOnField('Phone', phone)
	.verifyDataDisplayOnField('Street Address 1', street_address_1)
	.verifyDataDisplayOnField('Street Address 2', street_address_2)
	.verifyDataDisplayOnField('City', city)
	.verifyDataDisplayOnField('State or Province', state_province)
	.verifyDataDisplayOnField('Postal Code', postal_code)
	.verifyDataDisplayOnField('Country', country)

NPages.takeScreenShot()

'10. Log out the app'
NPages.nav(HeaderPage).clickLogout()
