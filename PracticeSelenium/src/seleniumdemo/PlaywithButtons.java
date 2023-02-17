package seleniumdemo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaywithButtons {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://testleaf.herokuapp.com/pages/Button.html");
			WebElement Buttonposition=driver.findElement(By.id("position"));
			
			// using getLoation(),getX(),getY() to identify the position of the button.
			
			org.openqa.selenium.Point XYvalue=Buttonposition.getLocation();
			int xvalue=XYvalue.getX();
			int yvalue=XYvalue.getY();
			System.out.println("X position is "+xvalue);
			System.out.println("Y position is "+yvalue);
			
			// using getCssvalue() method to find button color
			
			WebElement Buttoncolor=driver.findElement(By.id("color"));
			String color=Buttoncolor.getCssValue("background-color");
			System.out.println("the color of the button is "+color);
			
			// using getSize(),getHeight(),getWidth() method to find height ,width of the button
			
			WebElement Buttonsize=driver.findElement(By.id("size"));
	        int height  =Buttonsize.getSize().getHeight();
	        int width  = Buttonsize.getSize().getWidth();
	        System.out.println("Height of the button is "+height);
	        System.out.println("width of the button is "+width);
	        driver.quit();

	}

}
