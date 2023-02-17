package seleniumdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTables {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://testleaf.herokuapp.com/pages/table.html");
		
		// FindRows using tagname"tr"
		List<WebElement> Rows=driver.findElements(By.tagName("tr"));
		int RowsCount=Rows.size();
		System.out.println("Number of Rows present in the table is "+RowsCount);
		
		// FindColoums using tagname"th"
		List<WebElement> Coloums=driver.findElements(By.tagName("th"));
		int ColoumsCount=Coloums.size();
		System.out.println("Number of Coloums present in the table is "+ColoumsCount);
		
		// FindPercentage from writing Xpath using td ,normalize-space() , //following 
		WebElement percent=driver.findElement(
				By.xpath("//td[normalize-space ()='Learn to interact with Elements']//following::td[1]"));
		String percentage=percent.getText();
		System.out.println("Learn to interact with element is "+percentage);
		
		//get least value take td[2] to identify 3 values
		List<WebElement> allprogress=driver.findElements(By.xpath("//td[2]"));
		
	    //create integer list to store integer values
		List<Integer> NumberList=new ArrayList<Integer>();
		
		//To iterate oneby one value use foreach loop
		 for (WebElement webElement : allprogress)
		 {
			String individualValue= webElement.getText().replace("%", "");// replace % to avoid numberformatException
			//the getText() value is string to change integer datatype to add integer list
			NumberList.add(Integer.parseInt(individualValue));
		 }
         System.out.println("Final List"+NumberList);
         
         // to take minimum value in numberlist
         int smallvalue=Collections.min(NumberList);
         System.out.println("The leaset value is "+smallvalue);
         
         // to print xpath number value change into string
         String smallvaluestring=Integer.toString(smallvalue);
         
         //td[normalize-space ()='20%']//following::td[1]
         String FinalXpath=" //td[normalize-space ()='"+smallvaluestring+"%']//following::td[1]";
         System.out.println(FinalXpath);
         
         WebElement checkboxclick=driver.findElement(By.xpath(FinalXpath));
         checkboxclick.click();
         Thread.sleep(3000);
         driver.close();
         
	}

}
