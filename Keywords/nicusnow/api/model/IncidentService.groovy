
package nicusnow.api.model
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import internal.GlobalVariable
import nicusnow.fw.lib.BaseService

public class IncidentService extends BaseService<IncidentService>{

	String uri ='/table/incident'

	def IncidentService setUrl(String sys_id) {
		String endpoint = GlobalVariable.baseUrl + uri + sys_id
		request.setRestUrl(endpoint)
		return this
	}
}
