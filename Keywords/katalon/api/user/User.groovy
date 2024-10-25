
package katalon.api.user
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import groovy.json.JsonSlurper
import internal.GlobalVariable
import katalon.fw.lib.BaseAPI

public class User extends BaseAPI<User>{

	def jsonRespons;

	def User setUrl(String uri) {
		String endpoint = GlobalVariable.baseUrl + uri
		request.setRestUrl(endpoint)
		return this
	}

	def User verifyChildPropertyInResponse(String property, String expected) {
		jsonResponse = new JsonSlurper().parseText(response.getResponseBodyContent())
		WS.verifyEqual(jsonResponse.user[property], expected, FailureHandling.STOP_ON_FAILURE)
		return this
	}
}
