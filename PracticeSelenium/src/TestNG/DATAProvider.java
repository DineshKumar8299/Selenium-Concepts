package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DATAProvider {
	
	String [][] data={{"Admin","admin"},
	                  {"Admin","admin12"},
	                  {"Admin1","Admin123"},
	                  {"Admin","admin123"}
	                 };
	@DataProvider (name="Login data")
	public String[][] Dataprovider() {
		return data;
		
	}
	@Test(dataProvider = "Login data")
	public void Login(String Uname, String Pass) {
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://opensource-demo.orangehrmlive.com/");
		   WebElement UserName=driver.findElement(By.id("txtUsername"));
		   UserName.sendKeys(Uname);
		   WebElement password=driver.findElement(By.id("txtPassword"));
		   password.sendKeys(Pass);
		   WebElement loginbutton=driver.findElement(By.id("btnLogin"));
		   loginbutton.click();
		   driver.quit();
            
	}
	
	
 
  }

