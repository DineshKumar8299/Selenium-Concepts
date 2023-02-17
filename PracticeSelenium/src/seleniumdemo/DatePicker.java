package seleniumdemo;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
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

}
