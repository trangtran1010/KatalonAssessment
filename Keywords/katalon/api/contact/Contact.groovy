
package katalon.api.contact
import internal.GlobalVariable
import katalon.fw.lib.BaseAPI

public class Contact extends BaseAPI<Contact>{

	def Contact setUrl(String uri) {
		String endpoint = GlobalVariable.baseUrl + uri
		request.setRestUrl(endpoint)
		return this
	}
}
