package excel;

import java.io.File;
import jxl.Workbook;


public class read_data_from_excel_example {

	public static void main(String[] args) throws Exception {
	
		System.out.println("Modification only done without committ message.......");
		
		File src = new File("C:/Test_files/datas.xls");
		Workbook wb = Workbook.getWorkbook(src);
		String data00 = wb.getSheet(0).getCell(0,0).getContents();
		System.out.println("Data is:"+data00);
		String data01 = wb.getSheet(0).getCell(0,1).getContents();
		System.out.println("Data is :"+data01);
		
		int rows = wb.getSheet(0).getRows();
		System.out.println("Total no of Rows:"+rows);
		
		int columns = wb.getSheet(0).getColumns();
		System.out.println("Total no of Columns:"+columns);
		// Today login tasks completed....

	}

}
