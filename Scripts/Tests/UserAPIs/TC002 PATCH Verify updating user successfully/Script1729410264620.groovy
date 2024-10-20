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

'3. User logout from system'
NPages.nav(User).initRequestObject()
	   .setUrl('/users/logout')
	   .setBasicAuthorizationHeader(token)
	   .setJsonContentTypeHeader()
	   .sendPostRequest()
	   .verifyStatusCode(200)

'4. Login to user has just created'
def loginBody = [
	"email": email,
	"password": password
]

String jsonLoginBody = new groovy.json.JsonBuilder(loginBody).toString()

NPages.nav(User).initRequestObject()
	   .setUrl('/users/login')
	   .setBasicAuthorizationHeader(token)
	   .setJsonContentTypeHeader()
	   .setPayLoad(jsonLoginBody)
	   .sendPostRequest()
	   .verifyStatusCode(200)
	   
'5. User call Update User API and verify data is updated successfully'
token = NPages.nav(User).getTextOfPropertyResponse(token)

String emailEdit = NPages.nav(User).generateEmail(pre_fix_email)

def requestBodyEdit = [
	"firstName": first_name_edit,
	"lastName": last_name_edit,
	"email": email,
	"password": password_edit
]

String jsonBodyEdit = new groovy.json.JsonBuilder(requestBodyEdit).toString()

NPages.nav(User).initRequestObject()
		.setUrl('/users/me')
		.setBasicAuthorizationHeader(token)
		.setJsonContentTypeHeader()
		.setPayLoad(jsonBodyEdit)
		.sendPostRequest()
		.verifyStatusCode(200)
		.verifyPropertyValueExistInResponse('firstName', first_name_edit)
		.verifyPropertyValueExistInResponse('lastName', last_name_edit)
		.verifyPropertyValueExistInResponse('email', emailEdit)
		.verifyPropertyValueExistInResponse('password', password_edit)
										