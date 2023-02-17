package TestNG;

import org.testng.annotations.Test;

public class GroupingExample  {
	
		
		
		  @Test (groups = "one")
			public void siva() {
				System.out.println("this is first testcase");
			}
		    @Test (groups = "one+")
		    public void kani() {
		    	System.out.println("this is second testcse");
		    }
		    @Test (groups = "one+pro")
		    public void dinesh() {
		    	System.out.println("this is third testcase");
	
		
	}
	

}
