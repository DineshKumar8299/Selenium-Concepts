package seleniumdemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://testleaf.herokuapp.com/pages/Window.html");
			
			String ParentWindow=driver.getWindowHandle();
            WebElement firstbutton=driver.findElement(By.id("home"));
            firstbutton.click();
           Set<String> Handles= driver.getWindowHandles();
           for (String newwindow : Handles)
           {
        	   driver.switchTo().window(newwindow);	
		   }
           WebElement editbox=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a"));
           editbox.click();
           driver.close();
           driver.switchTo().window(ParentWindow);// coming to Parentwindow
           WebElement Openmultiple=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
           Openmultiple.click();
           Thread.sleep(3000);
           int size=driver.getWindowHandles().size();
           System.out.println("number of opened window is :"+size);
           Thread.sleep(3000);
           WebElement dontcloseme=driver.findElement(By.id("color"));
           dontcloseme.click();
           //close all window if its not Parentwindow
           Set<String> newwindowhandles= driver.getWindowHandles();
           for (String Allwindows : newwindowhandles)
           {
        	if (!Allwindows.equals(ParentWindow))   
        	{
        	driver.switchTo().window(Allwindows);
        	driver.close();
        	} 
           }
           driver.quit();
			
		}
          
	}


