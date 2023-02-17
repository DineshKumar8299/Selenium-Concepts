package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithIFrames {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://testleaf.herokuapp.com/pages/frame.html");
			driver.switchTo().frame(0);
			WebElement click=driver.findElement(By.id("Click"));
			click.click();
			String text=driver.findElement(By.id("Click")).getText();
			System.out.println(text);
            driver.switchTo().defaultContent();
            driver.switchTo().frame(1);
            driver.switchTo().frame("frame2");
            WebElement button2=driver.findElement(By.id("Click1"));
            button2.click();
            driver.switchTo().defaultContent();
            List<WebElement> Totalnumberofframes=driver.findElements(By.tagName("iframe"));
            int size=Totalnumberofframes.size();
            System.out.println(size);
            driver.close();
            
	}

}
