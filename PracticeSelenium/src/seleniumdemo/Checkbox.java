package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.mycontactform.com/samples.php");
			driver.findElement(By.name("email_to[]")).click();
			driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[2]")).click();
			driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[3]")).click();
			
			driver.get("https://www.amazon.in/");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes for men"+Keys.ENTER);
			WebElement checkboxselected=driver.findElement(By.xpath("//*[@id=\"p_90/6741118031\"]/span/a/div/label/i"));
			boolean isSelected =checkboxselected.isSelected();
			if(isSelected==false) {
				checkboxselected.click(); 
			
			
			}
			 
	       driver.close();

	}

}
