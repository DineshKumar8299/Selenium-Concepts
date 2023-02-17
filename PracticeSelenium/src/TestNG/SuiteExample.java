package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample
{
   WebDriver driver;
   long startTime;
   long endTime;
   long totalTime;
   @BeforeSuite
   public void lanchBrowser()
   {
	   startTime=System.currentTimeMillis();
	   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
   }
   @Test
   public void DragandDrop()
   {
	  
		driver.get("http://www.leafground.com/pages/drop.html");
		WebElement From=driver.findElement(By.id("draggable"));
		WebElement   To=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		//action.clickAndHold(From).moveToElement(To).release(To).build().perform();
		action.dragAndDrop(From, To).build().perform();
	
	   
   }
   @Test
   public void GetTooltipName() throws InterruptedException 
   {
	
		driver.get("http://www.leafground.com/pages/tooltip.html");
		WebElement Tooltip=driver.findElement(By.id("age"));
		Tooltip.getAttribute("title");
		System.out.println(Tooltip.getAttribute("title"));
		Thread.sleep(3000);
		

	   
   }
   @Test
   public void Radiobutton() throws InterruptedException
   {
	  
	   driver.get("http://testleaf.herokuapp.com/pages/radio.html");
		WebElement uncheckbutton = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[1]"));
		Thread.sleep(3000);
               uncheckbutton.click();
		WebElement checkbutton = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[3]"));
		Thread.sleep(3000);
               checkbutton.click();
		boolean status1 = uncheckbutton.isSelected();
		boolean status2 = checkbutton.isSelected();
		System.out.println(status1);
		System.out.println(status2);
	  
   }
   @AfterSuite
   public void closebrowser()
   {
	   driver.quit();
	   endTime=System.currentTimeMillis();
	   totalTime=startTime-endTime;
	   System.out.println("Total Time is :" + totalTime);
	   
   }
}
