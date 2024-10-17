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
		.getTextOfPropertyResponse(token)

'2. User use token to call API'		
String token = NPages.nav(Contact).getTextOfPropertyResponse(token)							 
NPages.nav(Contact).initRequestObject()
	   .setUrl('/contacts')
	   .setBasicAuthorizationHeader(token)   
	   .setJsonContentTypeHeader()
	   .setPayLoad(add_contact_body)
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
													