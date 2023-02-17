package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com/samples.php");
	WebElement provience=driver.findElement(By.id("q10"));
	Select select=new Select(provience);
	select.selectByVisibleText("Manitoba");
	Thread.sleep(4000);	
	select.selectByIndex(6);
	Thread.sleep(4000);
	select.selectByValue("Nova Scotia");
	Thread.sleep(4000);
	List<WebElement> listofoptions=  select.getOptions();
	int size=listofoptions.size();
	System.out.println("Number of options is " + size);
	
	driver.close();
	
 
	}

}