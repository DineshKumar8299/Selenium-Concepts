package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver driver;
	@Test
	@Parameters("browsername")
	public void Chrome(String browser) throws InterruptedException {
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("Chrome");
			  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.manage().window().maximize();
				driver.navigate().to("http://testleaf.herokuapp.com/pages/Calendar.html");
				WebElement textbox=driver.findElement(By.id("datepicker"));
				//textbox.sendKeys("02/08/1999"+Keys.ENTER);
				textbox.click();
			
				 String month="February 1999";
				 //String date="08";
				 while(true)
				 {
					 String text=driver.findElement(By.xpath("/html/body/div[2]/div/div")).getText();
					 if(text.equals(month)) {
						 break;
					 }
					 else {
						 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
					 }
				 }
				 driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[2]/a")).click();
				 Thread.sleep(3000);
				 driver.close();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("firefox");
			  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.manage().window().maximize();
				driver.navigate().to("http://testleaf.herokuapp.com/pages/Calendar.html");
				WebElement textbox=driver.findElement(By.id("datepicker"));
				//textbox.sendKeys("02/08/1999"+Keys.ENTER);
				textbox.click();
			
				 String month="February 1999";
				 //String date="08";
				 while(true)
				 {
					 String text=driver.findElement(By.xpath("/html/body/div[2]/div/div")).getText();
					 if(text.equals(month)) {
						 break;
					 }
					 else {
						 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
					 }
				 }
				 driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[2]/a")).click();
				 Thread.sleep(3000);
				 driver.close();
		}
		else {
			System.out.println("Invalid browser");
		}
	}

	
}


// XML file

/*<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite" >
  <test thread-count="2" name="chrome">
  <parameter name="browsername" value="chrome"></parameter>
  <classes>
  <class name="TestNG.CrossBrowser"></class>
  </classes>
  </test> <!-- Test -->
  
  <test thread-count="2" name="firefox">
  <parameter name="browsername" value="firefox"></parameter>
  <classes>
  <class name="TestNG.CrossBrowser"></class>
  </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->*/

