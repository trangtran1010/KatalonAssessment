import katalon.api.contact.Contact
import katalon.fw.lib.NPages
		
'1. User login to system to get Token'
NPages.nav(Contact).initRequestObject()
		.setUrl('/users/login')
		.setJsonContentTypeHeader()
		.setPayLoad(login_body)
		.sendPostRequest()
		.verifyStatusCode(200)
		.getTextOfPropertyResponse(token)

'2. User create a contact by API'		
String token = NPages.nav(Contact).getTextOfPropertyResponse(token)		

String email = NPages.nav(Contact).generateEmail(pre_fix_email)

def requestBody = [
	"email": email,
	"firstName": first_name,
    "lastName": last_name,
    "birthdate": birthday,
    "phone": phone,
    "street1": street1,
    "street2": street2,
    "city": city,
    "stateProvince": state_province,
    "postalCode": postal_code,
    "country": country
]

String jsonBody = new groovy.json.JsonBuilder(requestBody).toString()

NPages.nav(Contact).initRequestObject()
	   .setUrl('/contacts')
	   .setBasicAuthorizationHeader(token)   
	   .setJsonContentTypeHeader()
	   .setPayLoad(jsonBody)
	   .sendPostRequest()
	   .verifyStatusCode(201)
	   .verifyPropertyValueReponse('firstName', first_name)
	   .verifyPropertyValueReponse('lastName', last_name)
	   .verifyPropertyValueReponse('email', email)

'3. User update the contact'
String emailEdit = NPages.nav(Contact).generateEmail(pre_fix_email)

def requestBodyEdit = [
	"email": emailEdit,
	"firstName": first_name_edit,
	"lastName": last_name_edit,
	"birthdate": birthday_edit,
	"phone": phone_edit,
	"street1": street1_edit,
	"street2": street2_edit,
	"city": city_edit,
	"stateProvince": state_province_edit,
	"postalCode": postal_code_edit,
	"country": country_edit
]

String jsonBodyEdit = new groovy.json.JsonBuilder(requestBodyEdit).toString()

NPages.nav(Contact).initRequestObject()
		.setUrl('/contacts')
		.setBasicAuthorizationHeader(token)
		.setJsonContentTypeHeader()
		.setPayLoad(jsonBodyEdit)
		.sendPutRequest()
		.verifyStatusCode(503)
		.verifyContentOfResponse(expected_message)
													