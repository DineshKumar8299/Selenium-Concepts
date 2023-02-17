package seleniumdemo;
 
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws AWTException {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.filemail.com/share/upload-file");
			WebElement uploadfile=driver.findElement(By.id("addBtn"));
			uploadfile.click();
			
			String file="C:\\Users\\Dinesh Kumar\\Downloads\\info.txt";
			StringSelection selection=new StringSelection(file);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
			
			
			Robot robot= new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);			
						
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			WebElement send=driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/section[2]/div/div[2]/div[2]/div[4]/div/button[4]/span"));
			send.click();
			System.out.println("The File is Uploaded Successfully");
			
            driver.close();
            
	}

}
 

      
    
