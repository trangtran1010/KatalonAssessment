package nicusnow.fw.utilities

import java.text.DateFormat
import java.text.SimpleDateFormat
import internal.GlobalVariable

public class DateTimeUtils {

	public static final String datetimeFormatUS = "M/d/yyyy"

	/**
	 * Get current time to string by datetimeFormatUS
	 * @return a string of time
	 */
	public static String getCurrentTimestamp(String format = datetimeFormatUS) {
		Date date = new Date()
		DateFormat formatter = new SimpleDateFormat(format)
		formatter.setTimeZone(TimeZone.getTimeZone(GlobalVariable.timeZone))
		return formatter.format(date)
	}

}
