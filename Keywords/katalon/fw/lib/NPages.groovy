package katalon.fw.lib
import org.openqa.selenium.support.events.EventFiringWebDriver

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable


public class NPages{

	private static final NPages instance = new NPages();
	private static final EventFiringWebDriver eventFiring = GlobalVariable.isAPIRunning ? null : ((DriverFactory.getWebDriver()) as EventFiringWebDriver).register(new NWebDriverEventHandler());

	private Map<Class,Object> map = new HashMap<Class,Object>();

	/***
	 * 
	 * @param <T> page object class . Ex - LoginPage
	 * @param classOf - page object class . Ex - LoginPage
	 * @return a Page instance
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public static  <T> T nav(Class<T> classOf) throws InstantiationException, IllegalAccessException {

		synchronized(instance){
			if(!instance.map.containsKey(classOf)){

				T obj = classOf.newInstance();

				instance.map.put(classOf, obj);
			}
			return (T)instance.map.get(classOf)
		}
	}

	/****
	 * This for take screenshot purpose, if isScreenShort turns off, no screenshort step is performed
	 * Client want to take every test step for evidence, each screenshot should not duplicated
	 * @return
	 */
	public static takeScreenShot() {
		if (GlobalVariable.isScreenShot) {
			WebUI.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)
		}
	}
}