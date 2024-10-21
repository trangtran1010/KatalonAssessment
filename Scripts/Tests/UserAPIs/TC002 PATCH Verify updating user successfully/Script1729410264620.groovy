import katalon.api.user.User
import katalon.fw.lib.NPages
		
'1. User login to system to get Token'
NPages.nav(User).initRequestObject()
		.setUrl('/users/login')
		.setJsonContentTypeHeader()
		.setPayLoad(login_body)
		.sendPostRequest()
		.verifyStatusCode(200)

'2. User create an user'		
String tokenUser1 = NPages.nav(User).getTextOfPropertyResponse(token)	
		
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
	   .setBasicAuthorizationHeader(tokenUser1)   
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
	   .setBasicAuthorizationHeader(tokenUser1)
	   .setJsonContentTypeHeader()
	   .sendPostRequest()
	   .verifyStatusCode(200)

'4. Login to user has just created'
def loginBody = [
	"email": email,
	"password": password
]

String jsonLoginBody = new groovy.json.JsonBuilder(loginBody).toString()
System.out.println(jsonLoginBody)

NPages.nav(User).initRequestObject()
	   .setUrl('/users/login')
	   .setJsonContentTypeHeader()
	   .setPayLoad(jsonLoginBody)
	   .sendPostRequest()
	   .verifyStatusCode(200)
	   
'5. User call Update User API to update first name and last name'
// Verify first name and last name are updated successfully
// Verify email is not updated

String tokenUser2 = NPages.nav(User).getTextOfPropertyResponse(token)

NPages.nav(User).initRequestObject()
		.setUrl('/users/me')
		.setBasicAuthorizationHeader(tokenUser2)
		.setJsonContentTypeHeader()
		.setPayLoad(update_user_body)
		.sendPatchRequest()
		.verifyStatusCode(200)
		.verifyPropertyValueExistInResponse('firstName', first_name_edit)
		.verifyPropertyValueExistInResponse('lastName', last_name_edit)
		.verifyPropertyValueExistInResponse('email', email)

										