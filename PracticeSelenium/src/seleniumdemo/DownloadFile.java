package seleniumdemo;



import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class DownloadFile {
	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demo.automationtesting.in/FileDownload.html#google_vignette");
			//Actions action=new Actions (driver);
			//action.sendKeys(Keys.PAGE_DOWN).build().perform();
	        driver.findElement(By.id("textbox")).sendKeys("Hii this is dinesh kumar from thirutani.i am 23 yaers old.");
			Thread.sleep(3000);
			driver.findElement(By.id("createTxt")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("link-to-download")).click();
			Thread.sleep(3000);
			driver.close();			
				
			}}
			
	

