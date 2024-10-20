import katalon.api.user.User
import katalon.fw.lib.NPages
		
'1. User login to system to get Token'
NPages.nav(User).initRequestObject()
		.setUrl('/users/login')
		.setBasicAuthorizationHeader(token)
		.setJsonContentTypeHeader()
		.setPayLoad(login_body)
		.sendPostRequest()
		.verifyStatusCode(200)
		
'2. User create an user'		
String token = NPages.nav(User).getTextOfPropertyResponse(token)	

String email = NPages.nav(User).generateEmail(pre_fix_email)

def requestBody = [
    "firstName": first_name,
    "lastName": last_name,
    "email": email,
    "password": password
]

String jsonBody = new groovy.json.JsonBuilder(requestBody).toString()

NPages.nav(User).initRequestObject()
	   .setUrl('/users')
	   .setBasicAuthorizationHeader(token)   
	   .setJsonContentTypeHeader()
	   .setPayLoad(jsonBody)
	   .sendPostRequest()
	   .verifyStatusCode(201)
	   .verifyChildPropertyInResponse('firstName', first_name)
	   .verifyChildPropertyInResponse('lastName', last_name)
	   .verifyChildPropertyInResponse('email', email)
	   
'3. User call Delete User API and verify the API status return 503 and response body contains the "Application Error" title'
NPages.nav(User).initRequestObject()
	   .setUrl('/users')
	   .setBasicAuthorizationHeader(token)   
	   .setJsonContentTypeHeader()
	   .sendDeleteRequest()
	   .verifyStatusCode(503)
	   .verifyContentOfResponse(expected_message)									