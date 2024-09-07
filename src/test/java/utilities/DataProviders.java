package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	//ddtest 3
	
	//DataProvider 1
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException
	{
		String path=".\\testData\\Opencart_LoginData.xlsx";//taking xl file from test data
		ExcelUtility xlutil=new ExcelUtility(path);//creating an object for xlutility
		
		int totalrows=xlutil.getRowCount("Sheet1");
		int totalcols=xlutil.getCellCount("Sheet1",1);
		
		String logindata[][]=new String[totalrows][totalcols];//created for 2Darrays which can store 
		
		for(int i=1;i<=totalrows;i++)//1 read datafrom xl storing  in 2d array
		{
			for(int j=0;j<totalcols;j++)//0 i is row j is column
			{
				logindata[i-1][j]=xlutil.getCellData("Sheet1", i, j);//1,0
			}
		}
		return logindata;//return 2d array
	}
	
	
	//DataProvider 2
	//DataProvider 3
	//DataProvider 4

}
