package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class parallelTesting {
  @Test
  public void sortable() {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.navigate().to("http://www.leafground.com/pages/sortable.html");
		//take unorderedlist element xpath and add "/li" to take ordered list elements
		List<WebElement>Elementslist=driver.findElements(By.xpath("//*[@id=\'sortable\']/li"));
		WebElement from=Elementslist.get(6);
		WebElement to=Elementslist.get(0);
		Actions action=new Actions(driver);
		action.clickAndHold(from);
		action.moveToElement(to);
		action.release(to);
		action.build().perform();
		driver.quit();
  }
  @Test
  public void dropanddrp() {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/drop.html");
		WebElement From=driver.findElement(By.id("draggable"));
		WebElement   To=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		//action.clickAndHold(From).moveToElement(To).release(To).build().perform();
		action.dragAndDrop(From, To).build().perform();
		System.out.println(Thread.currentThread().getId());
		driver.quit();
  }
}


// XML file
/*
 * <?xml version="1.0" encoding="UTF-8"?> <!DOCTYPE suite SYSTEM
 * "https://testng.org/testng-1.0.dtd"> <suite name="Suite" verbose ="2"
 * parallel="methods" thread-count="2"> <test thread-count="5" name="Test">
 * <classes> <class name="TestNG.parallelTesting"/> </classes> </test> <!-- Test
 * --> </suite> <!-- Suite -->
 * 
 */