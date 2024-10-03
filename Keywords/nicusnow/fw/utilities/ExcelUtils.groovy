package nicusnow.fw.utilities

import com.kms.katalon.core.testdata.ExcelData;
import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.util.KeywordUtil
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook


public class ExcelUtils {

	def static ExcelData excelData (String filePath, String workSheet) {
		return ExcelFactory.getExcelDataWithDefaultSheet(
				filePath, workSheet, false)
	}

	/****
	 *
	 * @param fileName - location of excel file
	 * @param colName  - column name on excel file . Ex - cost_center_id
	 * @return
	 */
	def static List getCells(String filePath, String workSheet,String colName) {
		List rows= excelData(filePath, workSheet).getAllData()
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
		KeywordUtil.logInfo("Actual Excel Data  cells of  ${colName} is:${lines.toString()}");

		return lines
	}

	def static ExcelData updateCells (String filePath, String workSheet, String cellName, String value) {
		FileInputStream file = new FileInputStream (new File(filePath))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet(workSheet);
		//Get first row
		XSSFRow header_row = sheet.getRow(0);
		//get the last column index for a row
		short maxColIx = header_row.getLastCellNum();
		for (int i = 0; i<maxColIx; i++) {
			XSSFCell header_cell = header_row.getCell(i);
			if (header_cell.toString().equals(cellName))
			{
				int col_num  = i;
				for (int j=1;j<=sheet.getLastRowNum();j++) {
					Cell cell2update = sheet.getRow(j).getCell(col_num)
					cell2update.setCellValue(value)
				}
			}
		}
		file.close();
		FileOutputStream outFile =new FileOutputStream(new File(filePath));
		workbook.write(outFile);
		outFile.close();
	}

	def static String getCell(String fileName, String workSheet, int colIndex, int rowIndex) {
		return  ExcelUtils.excelData(fileName,workSheet).getValue(colIndex, rowIndex)
	}

	def static String getCell(String fileName, String workSheet, String colName, int rowIndex) {
		String cell = getCells(fileName,workSheet,colName).get(rowIndex);
		KeywordUtil.logInfo("Actual Excel Data of ${colName} at row ${rowIndex} is ${cell}");
		return cell
	}

}
