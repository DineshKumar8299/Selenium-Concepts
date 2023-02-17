package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
            driver.navigate().to("http://www.leafground.com/pages/Link.html");
            
            // coming back to previous page
            WebElement GotoHome=driver.findElement(By.linkText("Go to Home Page"));
            GotoHome.click();
            Thread.sleep(3000);
            driver.navigate().back();
            
            // The link is going to Where?
            WebElement Wheretogo=driver.findElement(By.partialLinkText("Find where"));
            String Where= Wheretogo.getAttribute("href");
            System.out.println("This link is going to "+Where );
            
            // verify the page title to identify the link is broken
             WebElement Brokenlink=driver.findElement(By.linkText("Verify am I broken?"));
            Brokenlink.click();
            String Title=driver.getTitle();
            if(Title.contains("404")) {
            	System.out.println("The link is Broken");
            }
            driver.navigate().back();
            
            // Intreact with same link StsteElementReferenceException occurs
            WebElement gotohomeSamelink=driver.findElement(By.linkText("Go to Home Page "));
            gotohomeSamelink.click();
            driver.navigate().back();
            
            driver.close();
            
            
            
	}

}
