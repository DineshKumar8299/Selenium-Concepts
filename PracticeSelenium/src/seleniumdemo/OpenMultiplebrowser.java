package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenMultiplebrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("fita acedemy",Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		

		
		System.setProperty("webdriver.edge.driver","D:\\Edge\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.close();
		


	}

}
