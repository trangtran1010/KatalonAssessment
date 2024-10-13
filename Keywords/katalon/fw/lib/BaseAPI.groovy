package katalon.fw.lib

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import groovy.json.JsonSlurper
import internal.GlobalVariable

public class BaseAPI <T> {

	RequestObject request;
	ResponseObject response;
	ArrayList httpHeader;
	def desiredValue;
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

	def verifyStatusCode (int statusCode) {
		WS.verifyResponseStatusCode(response, statusCode)
		return this
	}

	def verifyPropertyValueReponse (String property, String expected) {
		jsonResponse = new JsonSlurper().parseText(response.getResponseBodyContent())
		desiredValue = jsonResponse[property]
		WS.verifyEqual(jsonResponse[property], expected)
		return this
	}

	def getTextOfPropertyResponse (String property) {
		jsonResponse = new JsonSlurper().parseText(response.getResponseBodyContent())
		desiredValue = jsonResponse[property]
		return desiredValue
	}

	def verifyPropertyNotInResponse(String property, String expected) {
		jsonResponse = new JsonSlurper().parseText(response.getResponseBodyContent())
		desiredValue = jsonResponse[property]

		if (jsonResponse.contains(expected)) {
			throw new Exception("${property} ${expected} exists in the response.")
		} else {
			println("${property} ${expected} does not exist in the response.")
		}
		return this
	}

	def verifyPropertyValueExistInResponse(String property, String expected) {
		jsonResponse = new JsonSlurper().parseText(response.getResponseBodyContent())
		desiredValue = jsonResponse[property]

		if (jsonResponse.contains(expected)) {
			println("${property} ${expected} exist in the response.")
		} else {
			throw new Exception("${property} ${expected} exists in the response.")
		}
		return this
	}
}
