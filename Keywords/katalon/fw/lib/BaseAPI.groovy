package katalon.fw.lib
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonSlurper

public class BaseAPI <T> {

	RequestObject request;
	ResponseObject response;
	ArrayList httpHeader;
	def jsonResponse;

	def T initRequestObject() {
		request = new RequestObject()
		httpHeader = new ArrayList()
		return this
	}

	def T setBasicAuthorizationHeader(String token) {
		httpHeader.add(new TestObjectProperty('Authorization', ConditionType.EQUALS, token))
		return this
	}

	def T setJsonContentTypeHeader() {
		httpHeader.add(new TestObjectProperty('Content-Type', ConditionType.EQUALS, 'application/json'))
		return this
	}

	def T setPayLoad(String payload) {
		request.setBodyContent(new HttpTextBodyContent(payload))
		return this
	}
	def T sendGetRequest() {
		request.setHttpHeaderProperties(httpHeader)
		request.setRestRequestMethod('GET')
		response = WS.sendRequest(request, FailureHandling.STOP_ON_FAILURE)
		return this
	}

	def T sendPutRequest() {
		request.setHttpHeaderProperties(httpHeader)
		request.setRestRequestMethod('PUT')
		response = WS.sendRequest(request, FailureHandling.STOP_ON_FAILURE)
		return this
	}
	
	def T sendPatchRequest() {
		request.setHttpHeaderProperties(httpHeader)
		request.setRestRequestMethod('PATCH')
		response = WS.sendRequest(request, FailureHandling.STOP_ON_FAILURE)
		return this
	}
	
	def T sendPostRequest() {
		request.setHttpHeaderProperties(httpHeader)
		request.setRestRequestMethod('POST')
		response = WS.sendRequest(request, FailureHandling.STOP_ON_FAILURE)
		return this
	}

	def T sendDeleteRequest() {
		request.setHttpHeaderProperties(httpHeader)
		request.setRestRequestMethod('DELETE')
		response = WS.sendRequest(request, FailureHandling.STOP_ON_FAILURE)
		return this
	}

	def T verifyStatusCode (int statusCode) {
		WS.verifyResponseStatusCode(response, statusCode)
		return this
	}
	
	def T generateEmail(String value) {
		return value + (new Random().nextInt(10000)) + "@gmail.com"
	}

	def T verifyPropertyValueReponse (String property, String expected) {
		jsonResponse = new JsonSlurper().parseText(response.getResponseBodyContent())
		WS.verifyEqual(jsonResponse[property], expected, FailureHandling.STOP_ON_FAILURE)
		return this
	}

	def T getTextOfPropertyResponse (String property) {
		jsonResponse = new JsonSlurper().parseText(response.getResponseBodyContent())
		String desiredValue = jsonResponse[property]		
		return desiredValue
	}
	
	def T verifyContentOfResponse(String expected) {
		jsonResponse = response.getResponseBodyContent()
		WS.verifyEqual(jsonResponse.contains(expected), true, FailureHandling.STOP_ON_FAILURE)
		return this
	}

}
