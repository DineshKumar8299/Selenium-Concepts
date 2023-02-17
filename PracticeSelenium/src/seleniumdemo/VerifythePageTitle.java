package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifythePageTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actual= driver.getTitle();
		String excepted= ("Facebook – log in or sign up");
		if (actual.equals(excepted)) {
			System.out.println("success");
		}else {
			System.out.println("false");

	}

}}
