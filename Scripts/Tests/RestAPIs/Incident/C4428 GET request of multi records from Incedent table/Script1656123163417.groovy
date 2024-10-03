import nicusnow.api.model.IncidentService
import nicusnow.fw.lib.NPages
		
NPages.nav(IncidentService).initRequestObject()
						   .setUrl('?sysparm_limit=1000')
						   .setBasicAuthorizationHeader()   
						   .setJsonContentTypeHeader()
						   .sendGetRequest()
						   .verifyStatusCode(200)
													