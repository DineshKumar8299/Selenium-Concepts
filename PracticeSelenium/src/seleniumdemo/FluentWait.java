package seleniumdemo;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait
{

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://testleaf.herokuapp.com/");
			WebElement Table=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[8]/a"));
		        Table.click();
		        Wait<WebDriver> wait=new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(20))
		        .pollingEvery(Duration.ofSeconds(3))
		        .ignoring(NoSuchElementException.class);// use NosuchElementException.org.selenium class
		    
		         WebElement Checkbox=wait.until( new Function<WebDriver, WebElement>() 
			{
		          public WebElement apply(WebDriver driver) 
			  {
				
			  return driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/table/tbody/tr[2]/td[3]/input"));
		          }
			});
		    
		        Checkbox.click();
		        if(Checkbox.isSelected()) 
			{
		    	System.out.println("Checkbox is selected");
		        }
		        driver.close();
	}

}
