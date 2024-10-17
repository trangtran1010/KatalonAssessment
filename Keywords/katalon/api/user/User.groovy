
package katalon.api.user
import internal.GlobalVariable
import katalon.api.contact.Contact
import katalon.fw.lib.BaseAPI

public class User extends BaseAPI<User>{

	def User setUrl(String uri) {
		String endpoint = GlobalVariable.baseUrl + uri
		request.setRestUrl(endpoint)
		return this
	}
}
