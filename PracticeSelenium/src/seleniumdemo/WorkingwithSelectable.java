package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithSelectable {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.leafground.com/pages/selectable.html");
			//we can select the ordered list in the selectable table so we have to take Xpath
			//and out of the xpath give /li (list)
			//clik more than one so we take findelements
			List<WebElement> selectable=driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
			int size=selectable.size();
			System.out.println(size);
			Actions action=new Actions(driver);
			//take keydownmethod and press control
			action.keyDown(Keys.CONTROL)
			.click(selectable.get(0))
			.click(selectable.get(1))
			.click(selectable.get(2))
			.click(selectable.get(3))
			//to unselect the list
			.click(selectable.get(3))
			.click(selectable.get(2))
			.click(selectable.get(1))
			.click(selectable.get(0))
			.build().perform();
			
			// another easy way click and hold method
			/*action.clickAndHold(selectable.get(0));
			action.clickAndHold(selectable.get(1));
			action.clickAndHold(selectable.get(2));
			action.clickAndHold(selectable.get(3));
			action.build().perform();*/
			driver.close();
	}

}
