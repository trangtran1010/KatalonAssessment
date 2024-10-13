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

//'2. User delete existing contact before create a new contact'
String token = NPages.nav(Contact).getTextOfPropertyResponse(token)							 
//NPages.nav(IncidentService).initRequestObject()
//	   .setUrl('/contacts')
//	   .setBasicAuthorizationHeader(token)   
//	   .setJsonContentTypeHeader()
//	   .setPayLoad(add_contact_body)
//	   .sendDeleteRequest()
//	   .verifyStatusCode(201)
//	   .verifyPropertyValueReponse('message', expected_message)
	   
'3. User get contact list and find contact has just deleted > contact with email exist in the response its mean contact deleted successfully'
NPages.nav(Contact).initRequestObject()
	   .setUrl('/contacts')
	   .setBasicAuthorizationHeader(token)   
	   .setJsonContentTypeHeader()
	   .sendGetRequest()
	   .verifyStatusCode(200)
	   .verifyPropertyNotInResponse('email', expected_email)

													