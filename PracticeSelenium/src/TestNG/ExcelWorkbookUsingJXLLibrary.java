package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelWorkbookUsingJXLLibrary {
	String[][] data=null;
	 WebDriver driver;

	@DataProvider (name="Login data")
	public String[][] Dataprovider() throws FileNotFoundException, BiffException, IOException {
		data=GetExcelData();
		return data;
	}
		
		

  public String[][] GetExcelData() throws IOException,FileNotFoundException, BiffException {
	  FileInputStream excel=new FileInputStream("C:\\Users\\Dinesh Kumar\\Downloads\\Book4.xls");
	  Workbook workbook=Workbook.getWorkbook(excel);
	  Sheet sheet=workbook.getSheet(0);// to give sheetnumber or indexvalue
	  int row=sheet.getRows();
	  int coloum = sheet.getColumns();
	  String [][] testdata=new 	String[row-1][coloum];  
	  for(int i=1;i<row;i++) {
		  for(int j=0;j<coloum;j++) {
			 testdata[i-1][j] = sheet.getCell( j, i).getContents();
		  }
	  }
	  return testdata;
		}
        @BeforeTest
        public void BeforeTest() {
        	 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			   driver=new ChromeDriver();
			   driver.manage().window().maximize();
			   driver.get("https://opensource-demo.orangehrmlive.com/");
        }
        @AfterTest
        public void AfterTest() {
        	 driver.quit(); 
        }
  
  
		@Test(dataProvider = "Login data")
		public void Login(String Uname, String Pass) {
			 
			   WebElement UserName=driver.findElement(By.id("txtUsername"));
			   UserName.sendKeys(Uname);
			   WebElement password=driver.findElement(By.id("txtPassword"));
			   password.sendKeys(Pass);
			   WebElement loginbutton=driver.findElement(By.id("btnLogin"));
			   loginbutton.click();
			  
  }
}
