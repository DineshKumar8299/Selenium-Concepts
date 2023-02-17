package seleniumdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Dinesh%20Kumar/Desktop/popup.html");
		driver.findElement(By.xpath("/html/body/fieldset/button")).click();
		Thread.sleep(2000);
		Alert alertwindow=driver.switchTo().alert();
		System.out.println("the message displayed on alert: " + alertwindow.getText());
		alertwindow.accept();
		driver.close();
	}

}
