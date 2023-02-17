package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithIMAGES {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.leafground.com/pages/Image.html");
			
           /* WebElement Firstimage=driver.findElement
             (By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
            
	        Firstimage.click();*/
			
	        WebElement Brokenimage=driver.findElement
	        		(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
	        
	// cssProperty getattribute "naturalwidth"=0 thats broken image
	        
	        if(Brokenimage.getAttribute("naturalwidth").equals("0")) 
	        {
	        	System.out.println("the image is broken");
	        }else {
	        	System.out.println("the image is not broken");
	        }
	        driver.close();
	}

}
