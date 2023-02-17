package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FindAllLinks {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize(); 
			driver.navigate().to("http://www.leafground.com/pages/Link.html");
			
			List<WebElement> Totallinks=driver.findElements(By.tagName("a"));
			int size=Totallinks.size();
			System.out.println("Number of links are avaliable in this page is "+size);
		    for(int i=0;i<size;i++)
		    {
		    	System.out.println(Totallinks.get(i).getText());
		    }
			driver.close();
	}}