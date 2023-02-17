package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrogAndDrop {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.leafground.com/pages/drop.html");
			WebElement From=driver.findElement(By.id("draggable"));
			WebElement   To=driver.findElement(By.id("droppable"));
			Actions action=new Actions(driver);
			//action.clickAndHold(From).moveToElement(To).release(To).build().perform();
			action.dragAndDrop(From, To).build().perform();
			driver.close();
			
	/* WebElement Rightsidedrog=driver.findElement(By.xpath("//*[@id=\"container\"]"
			+ "/div/div[3]/div[1]/div[1]/div/div[1]/div/section[2]/div[3]/div[1]/div[1]/div"));
			
	   WebElement Leftsidedrog=driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[1]/"
			+ "div/div[1]/div/section[2]/div[3]/div[1]/div[2]/div"));
			
	   Thread.sleep(2000);
	   Actions action=new Actions(driver);
       action.dragAndDropBy(Rightsidedrog, 50, 0).perform(); // droganddrop only work in current class
       Thread.sleep(3000);
       action.dragAndDropBy(Leftsidedrog, -50, 0).perform();
    */

	}

}
