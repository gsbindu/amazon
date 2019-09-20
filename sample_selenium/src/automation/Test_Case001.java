package automation;

import Xls_Reader.Xls_Reader;
import seleniumsesions.Business_Libraries;

public class Test_Case001 extends Business_Libraries {

	public static void main(String[] args) throws InterruptedException  {
		
		Xls_Reader xls = new Xls_Reader ("C:\\Users\\mypc\\eclipse-workspace\\sample_selenium\\src\\config_data\\TestDatas.xlsx");
		
		openBrowser(xls.getCellData("TestSteps", "TestData", 2));
		xls.setCellData("TestSteps", "Status", 2, "PASS");
		navigateUrl();
		xls.setCellData("TestSteps", "Status", 3, "PASS");
		
		selectItem((xls.getCellData("TestSteps", "ObjectXpath", 4)), (xls.getCellData("TestSteps", "TestData", 4)));
		xls.setCellData("TestSteps", "Status", 4, "PASS");
		
		enterText((xls.getCellData("TestSteps", "ObjectXpath", 5)), (xls.getCellData("TestSteps", "TestData", 5)));
		xls.setCellData("TestSteps", "Status", 5, "PASS");
		
		clickButton(xls.getCellData("TestSteps", "ObjectXpath", 6));
		xls.setCellData("TestSteps", "Status", 6, "PASS");
		
		
		Thread.sleep(3000);
		closeBrowser();
		
		
		
	}

}
