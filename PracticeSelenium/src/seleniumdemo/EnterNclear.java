package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterNclear {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		WebElement username= driver.findElement(By.cssSelector("#loginForm > div > div:nth-child(1) > div > label > input"));
		username.sendKeys("dinesh");
		Thread.sleep(3000);
		WebElement password= driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div[1]/div[2]/form/div/div[2]/div/label/input"));
		password.sendKeys("74484");
		Thread.sleep(3000);
		username.clear();
		password.clear();
		
		Thread.sleep(2000);
		username.sendKeys("dineshz._");
		Thread.sleep(2000);
		password.sendKeys("dinesh@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
        driver.close();

	}

}
