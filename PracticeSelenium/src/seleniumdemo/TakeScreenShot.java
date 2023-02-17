package seleniumdemo;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Wait;

@SuppressWarnings("unused")
public class TakeScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize(); 
			driver.get("http://testleaf.herokuapp.com/");
			
			//Take Screenshot Fullpage
			
			/*TakesScreenshot ScreenShot=(TakesScreenshot)driver;
			File Src=ScreenShot.getScreenshotAs(OutputType.FILE);
			File Location=new File("C://Users//Dinesh Kumar//Pictures//Screenshots//sample.png");// create file loaction
		    FileHandler.copy(Src, Location);// or use FileUtils u can download common io jars and add
		    Thread.sleep(4000);
		    driver.quit();*/
			
			// take portion of screenshot
			
			/*WebElement Portion=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
			File Src=Portion.getScreenshotAs(OutputType.FILE);
			File Location=new File("C://Users//Dinesh Kumar//Pictures//Screenshots//sample1.png");// create file loaction
		    FileHandler.copy(Src, Location);// or use FileUtils u can download common io jars and add
		    Thread.sleep(4000);
		    driver.quit();*/
			
			//Using Robort class to take Screenshot with full statusbar
			
			Robot robot=new Robot();
			Dimension Screensize=Toolkit.getDefaultToolkit().getScreenSize();
			int ScreenPixel=Toolkit.getDefaultToolkit().getScreenResolution();
			System.out.println("The image Resolution is "+ScreenPixel);
			Rectangle rectangle=new Rectangle(Screensize);
			BufferedImage Source=robot.createScreenCapture(rectangle);
			File Location=new File("C://Users//Dinesh Kumar//Pictures//Screenshots//robotscreenshot1.png");
			ImageIO.write(Source, "png", Location);
			//Thread.sleep(3000);
			 
			driver.close();
			 
			
	}

}