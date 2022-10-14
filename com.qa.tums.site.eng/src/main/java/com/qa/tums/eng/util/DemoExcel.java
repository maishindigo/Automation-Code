package com.qa.tums.eng.util;

public class DemoExcel {
	
	static Xls_Reader er;
	public static void main(String[] args) {
		
		
		
	 er = new Xls_Reader("C:\\Users\\sujsekar\\git\\repository\\com.qa.tums.site.eng\\src\\test\\resources\\Excelsheet\\Book1 (2).xlsx");
		
	 String cellData = er.getCellData("Centrum", "Live Url", 2);
	 System.out.println(cellData);
		
	}
	
	

}
