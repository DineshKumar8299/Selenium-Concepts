package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithSortable {

	public static void main(String[] args) {
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
			driver.close();

	}

}
