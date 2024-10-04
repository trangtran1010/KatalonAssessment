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

'7. After creating Contact, User need to verify the created data should be displayed correctly'
NPages.nav(ContactListPage).verifyDataDisplayOnGrid('Name', contact_name)
	.verifyDataDisplayOnGrid('Email', email)

NPages.takeScreenShot()

'8. User click on Contact in the column Name to open record detail page'
NPages.nav(ContactListPage).clickOnCell(contact_name)

'9. User click Edit Contact button'
NPages.nav(ContactListPage).clickEditContactbutton()

'10. On the Edit Contact page > Input updated First Name, Last Name, Date of Birth, Email, Phone, Street Address 1, Street Address 2, City, State or Province, Postal Code, Country'
NPages.nav(ContactListPage).inputFirstName(first_name_edit)
	.inputLastName(last_name_edit)
	.inputBirthDate(date_of_birth_edit)
	.inputEmail(email_edit)
	.inputPhone(phone_edit)
	.inputStreetAddress1(street_address_1_edit)
	.inputStreetAddress2(street_address_2_edit)
	.inputCity(city_edit)
	.inputStateOrProvince(state_province_edit)
	.inputPostalCode(postal_code_edit)
	.inputCountry(country_edit)
	
'11. Click Submit button'
NPages.nav(ContactListPage).clickSubmitButton()

'12. User need to verify the created data should be displayed in details correctly'
NPages.nav(ContactListPage).verifyDataDisplayOnField('First Name', first_name_edit)
	.verifyDataDisplayOnField('Last Name', last_name_edit)
	.verifyDataDisplayOnField('Date of Birth', date_of_birth_edit)
	.verifyDataDisplayOnField('Email', email_edit)
	.verifyDataDisplayOnField('Phone', phone_edit)
	.verifyDataDisplayOnField('Street Address 1', street_address_1_edit)
	.verifyDataDisplayOnField('Street Address 2', street_address_2_edit)
	.verifyDataDisplayOnField('City', city_edit)
	.verifyDataDisplayOnField('State or Province', state_province_edit)
	.verifyDataDisplayOnField('Postal Code', postal_code_edit)
	.verifyDataDisplayOnField('Country', country_edit)

NPages.takeScreenShot()

'13. Click Return to Contact List button'
NPages.nav(ContactListPage).clickReturnButton()

'14. After updating Contact, User need to verify the created data should be displayed correctly'
NPages.nav(ContactListPage).verifyDataDisplayOnGrid('Name', first_name_edit + " " + last_name_edit)
	.verifyDataDisplayOnGrid('Birthdate', date_of_birth_edit)
	.verifyDataDisplayOnGrid('Email', email_edit)
	.verifyDataDisplayOnGrid('Phone', phone_edit)
	.verifyDataDisplayOnGrid('Address', street_address_1_edit + " " + street_address_2_edit)
	.verifyDataDisplayOnGrid('City, State/Province, Postal Code', city_edit + " " + state_province_edit + " " + postal_code_edit)
	.verifyDataDisplayOnGrid('Country', country_edit)

NPages.takeScreenShot()

'15. Log out the app'
NPages.nav(HeaderPage).clickLogout()
