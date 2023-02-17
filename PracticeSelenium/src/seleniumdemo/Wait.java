package seleniumdemo;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.navigate().to("https://www.tutorialspoint.com/compile_java_online.php");
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
			WebElement Execute=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'execute\']/span/span/b")));
            Execute.click();
			
            System.out.println("hello world is printed");
            driver.close();   
}
}