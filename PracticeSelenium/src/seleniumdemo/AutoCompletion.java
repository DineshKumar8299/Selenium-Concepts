package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletion {

	        public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.leafground.com/pages/autoComplete.html");
			WebElement textbox=driver.findElement(By.id("tags"));
			textbox.sendKeys("s");
			Thread.sleep(4000);
			List<WebElement> listofoptions=driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
			int size=listofoptions.size();
			System.out.println("Total Number of Size is :"+size);
			for (WebElement webElement : listofoptions) {
				if(webElement.getText().equals("Web Services"))
				{
					
					webElement.click();
					String name=webElement.getText();
					System.out.println("Selecting"+name);
				    break;
				} 
				  
			}
           driver.close();
	}

}
