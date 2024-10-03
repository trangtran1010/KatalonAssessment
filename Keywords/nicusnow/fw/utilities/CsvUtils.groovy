package nicusnow.fw.utilities

import com.kms.katalon.core.util.KeywordUtil

public class CsvUtils {

	/****
	 * 
	 * @param filePath - location of csv file
	 * @return List <String> - header
	 */
	def static getHeader(String filePath) {
		File file = new File(filePath);
		List <String> ori_columns = new ArrayList<>();
		List <String> cus_columns  = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(file));
		String header = br.readLine();
		int i = 0
		if (header != null) {
			ori_columns = header.split("\",\"");
		}
		while (i<ori_columns.size()) {
			String input = ori_columns.get(i);
			String result = input.substring(1, input.length() - 1);
			i++
			cus_columns.add(result)
		}
		KeywordUtil.logInfo("Actual header in the CSV file is: "+ cus_columns)
		return cus_columns
	}

	/****
	 * 
	 * @param filePath - location of csv file
	 * @return List <List<String>> - rows included header row
	 */
	def static List getRows(String filePath) {
		File file = new File(filePath);
		String delimiter = "\",\"";
		String line;
		List<List<String>> lines = new ArrayList();
		try {
			BufferedReader br =
					new BufferedReader(new FileReader(file))
			while((line = br.readLine()) != null){
				int i=0;
				line.split(delimiter)
				List<String> values = Arrays.asList(line.split(delimiter));
				int lastValue =values.size()-1
				values.set(0, values.get(0).substring(1, values.get(0).length()));
				values.set(lastValue,values.get(lastValue).substring(0,values.get(lastValue).length()-1));
				lines.add(values);
			}
		} catch (Exception e){
			System.out.println(e);
		}
		return lines
	}

	/****
	 * 
	 * @param fileName - location of csv file
	 * @param colName  - column name on csv file . Ex - cost_center_id
	 * @return
	 */
	def static List getCellByName(String filePath, String colName) {
		List rows= getRows(filePath)
		int i= 0
		List<String> lines  = new ArrayList();
		while (i<rows.size()-1) {
			int n=0
			List<String> header = rows.get(0)
			int headerInx = header.indexOf(colName)
			List<String> cells = rows.get(i+1)
			while (n<cells.size()) {
				if (n==headerInx) {
					lines.add(cells.get(headerInx))
				}
				n++
			}
			i++
		}
		KeywordUtil.logInfo("Actual CSV Data of "+ colName + " is: " + lines.toString());
		return lines
	}
}
