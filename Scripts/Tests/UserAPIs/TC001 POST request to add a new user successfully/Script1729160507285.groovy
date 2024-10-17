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
		.getTextOfPropertyResponse(token)

'2. User use token to call API'		
String token = NPages.nav(User).getTextOfPropertyResponse(token)							 
NPages.nav(User).initRequestObject()
	   .setUrl('/users')
	   .setBasicAuthorizationHeader(token)   
	   .setJsonContentTypeHeader()
	   .setPayLoad(add_user_body)
	   .sendPostRequest()
	   .verifyStatusCode(201)
	   .verifyChildPropertyInResponse('firstName', first_name)
	   .verifyChildPropertyInResponse('lastName', last_name)
	   .verifyChildPropertyInResponse('email', email)