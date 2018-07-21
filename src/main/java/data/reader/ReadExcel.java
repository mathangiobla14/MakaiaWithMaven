package data.reader;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	@Test
	public String[][] readexcel(String sheetName) throws IOException {

		XSSFWorkbook wbook = new XSSFWorkbook("./data/" +sheetName+ ".xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		XSSFRow headerrow = sheet.getRow(0);
		short lastCellNum = headerrow.getLastCellNum();
		System.out.println(lastCellNum);

		String[][] data= new String[rowcount][lastCellNum];

		for(int i=1;i<=rowcount;i++)
		{
			XSSFRow row = sheet.getRow(i);


			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value);
				data[i-1][j] = value;

			}
		}

		wbook.close();
		return data;

	}

}
