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

String generateEmail() {
	return "tc001" + (new Random().nextInt(10000)) + "@gmail.com"
}

String email = generateEmail()

def requestBody = [
	"email": email,
	"firstName": "TC001",
    "lastName": "Contact Auto Test",
    "birthdate": "1970-01-01",
    "phone": "8005555555",
    "street1": "1 Main St.",
    "street2": "Apartment A",
    "city": "Anytown",
    "stateProvince": "KS",
    "postalCode": "12345",
    "country": "USA"
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
													