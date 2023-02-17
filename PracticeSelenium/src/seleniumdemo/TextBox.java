package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
			
   WebElement Email=driver.findElement(By.id("email"));
   Email.sendKeys("selenium with java");
   
   WebElement append=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
   append.sendKeys(" Automation Testing");
   
   // capturing text from Textbox using getAttribute() method
   WebElement gettext=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input"));
   String value=gettext.getAttribute("value");
   System.out.println("the given text is " + value);
   
   WebElement cleartext=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
   cleartext.clear();
   
   // conform the checkbox is disabled or not
   WebElement disabledbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
   boolean enabled = disabledbox.isDisplayed();
   System.out.println(enabled);
   
   driver.quit();
	}

}
