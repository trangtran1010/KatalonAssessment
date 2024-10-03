import nicusnow.api.model.IncidentService
import nicusnow.fw.lib.NPages
		
NPages.nav(IncidentService).initRequestObject()
						   .setUrl('?sysparm_count=true')
						   .setBasicAuthorizationHeader()   
						   .setJsonContentTypeHeader()
						   .sendGetRequest()
						   .verifyStatusCode(200)
													