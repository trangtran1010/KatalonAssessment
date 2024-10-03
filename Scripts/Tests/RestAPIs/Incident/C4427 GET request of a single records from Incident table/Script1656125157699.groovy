import nicusnow.api.model.IncidentService
import nicusnow.fw.lib.NPages

NPages.nav(IncidentService).initRequestObject()
						   .setUrl("/${sys_id}")
						   .setBasicAuthorizationHeader()
						   .setJsonContentTypeHeader()
						   .sendGetRequest()
						   .verifyStatusCode(200)
															