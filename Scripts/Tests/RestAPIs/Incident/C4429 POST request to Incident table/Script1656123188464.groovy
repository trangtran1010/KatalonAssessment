import nicusnow.api.model.IncidentService
import nicusnow.fw.lib.NPages
		
NPages.nav(IncidentService).initRequestObject()
						   .setUrl('')
						   .setBasicAuthorizationHeader()   
						   .setJsonContentTypeHeader()
						   .setPayLoad(payload)
						   .sendPostRequest()
						   .verifyStatusCode(201)
													