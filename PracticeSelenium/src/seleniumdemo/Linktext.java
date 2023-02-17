package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Linktext {
    
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("Mobiles")).click();
		driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[2]/ul/li/span/a/div/label/i")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
