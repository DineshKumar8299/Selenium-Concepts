package TestNG;

import org.testng.annotations.Test;


public class Skiptestcase {
	
		
	    @Test (priority = 0)
		public void siva() {
			System.out.println("this is first testcase");
		}
	    @Test (priority = 1 ,enabled=false) 
	    public void kani() {
	    	System.out.println("this is second testcse");
	    }
	    @Test (invocationCount=0,priority = 2)
	    public void dinesh() {
	    	System.out.println("this is third testcase");
	    }
	}


