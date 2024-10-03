package nicusnow.fw.lib

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import internal.GlobalVariable

public class BaseService <T> {
 
	RequestObject request;
	ResponseObject response;
	ArrayList httpHeader;

	def T initRequestObject() {
		request = new RequestObject()
		httpHeader = new ArrayList()
		return this
	}

	def T setBasicAuthorizationHeader(String token = GlobalVariable.encodedToken) {
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

	def verifyStatusCode (int statusCode) {
		WS.verifyResponseStatusCode(response, statusCode)
		return this
	}
}
