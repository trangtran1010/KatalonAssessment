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
		
String generateEmail() {
    return "tc001" + (new Random().nextInt(10000)) + "@gmail.com"
}

String email = generateEmail()

def requestBody = [
    "firstName": "TC001",
    "lastName": "User Auto Test",
    "email": email,
    "password": "myPassword"
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