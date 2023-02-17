package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
                driver.get("http://testleaf.herokuapp.com/pages/radio.html");
		WebElement uncheckbutton = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[1]"));
		Thread.sleep(3000);
                uncheckbutton.click();
		WebElement checkbutton = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[3]"));
		Thread.sleep(3000);
                checkbutton.click();
		boolean status1 = uncheckbutton.isSelected();
		boolean status2 = checkbutton.isSelected();
		System.out.println(status1);
		System.out.println(status2);
                  

	}

}
