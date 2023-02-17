package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize(); 
			
			driver.get("http://www.leafground.com/pages/tooltip.html");
			WebElement Tooltip=driver.findElement(By.id("age"));
			Tooltip.getAttribute("title");
			System.out.println(Tooltip.getAttribute("title"));
			driver.close();

	}

}
