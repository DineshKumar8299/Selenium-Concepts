package seleniumdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
    public static void main(String[] args){
    	 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			/*driver.get("http://testleaf.herokuapp.com/pages/radio.html");
			WebElement ID=driver.findElement(By.id("yes"));
			Actions action=new Actions(driver);
			action.contextClick(ID).build().perform();//Right click action*/
			
			/*driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
			WebElement JAVA=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[1]"));
			Actions action=new Actions(driver);
			action.doubleClick(JAVA).build().perform();//double click
			if(JAVA.isSelected()==false) {
				System.out.println("checkbox is doubleclick");
			}*/
			
			driver.get("https://www.flipkart.com/");
			WebElement cancel=driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
			cancel.click();
			WebElement Fashion=driver.findElement(By
					.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[2]/div/div"));
			WebElement Footer=driver.findElement(By.xpath("/html/body"));
			Actions action=new Actions(driver);
			action.moveToElement(Fashion).moveToElement(Footer).click().perform();// mouse over
			driver.close();
    } 
}