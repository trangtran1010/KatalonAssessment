import katalon.api.contact.Contact
import katalon.fw.lib.NPages
		
'1. User login to system to get Token'
NPages.nav(Contact).initRequestObject()
		.setUrl('/users/login')
		.setBasicAuthorizationHeader(token)
		.setJsonContentTypeHeader()
		.setPayLoad(login_body)
		.sendPostRequest()
		.verifyStatusCode(200)
			
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
	   .verifyPropertyValueReponse('birthdate', birthday)
	   .verifyPropertyValueReponse('email', email)
	   .verifyPropertyValueReponse('phone', phone)
	   .verifyPropertyValueReponse('street1', street1)
	   .verifyPropertyValueReponse('street2', street2)
	   .verifyPropertyValueReponse('stateProvince', state_province)	
	   .verifyPropertyValueReponse('postalCode', postal_code)
	   .verifyPropertyValueReponse('country', country)
	   .verifyPropertyValueReponse('city', city)
													