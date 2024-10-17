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

'2. User call Delete API and verify the API status return 503 and response body contains the "Application Error" title'
String token = NPages.nav(Contact).getTextOfPropertyResponse(token)							 
NPages.nav(Contact).initRequestObject()
	   .setUrl('/user')
	   .setBasicAuthorizationHeader(token)   
	   .setJsonContentTypeHeader()
	   .sendDeleteRequest()
	   .verifyStatusCode(503)
	   .verifyContentOfResponse(expected_message)									