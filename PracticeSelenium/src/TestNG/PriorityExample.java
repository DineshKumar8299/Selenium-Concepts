package TestNG;

import org.testng.annotations.Test;

public class PriorityExample {
	
    @Test (priority = 0,dataProvider="Login data",dataProviderClass=DATAProvider.class)
	public void siva() {
		System.out.println("this is first testcase");
	}
    @Test (priority = 1) 
   
    public void kani() {
    	System.out.println("this is second testcse ");
    }
    @Test (priority = 2)
    public void dinesh() {
    	System.out.println("this is third testcase");
    }
}
