package TestNG;

import org.testng.annotations.Test;

public class Dependencyexample extends Skiptestcase {
	@Override
	@Test
	public void dinesh() {
	System.out.println("extends skiptestcase");
	super.dinesh();
	}
	    @Test (enabled= true)
		public void siva() {
			System.out.println("this is first testcase");
		}
	    @Test ( dependsOnMethods="siva")
	    public void hari() {
	    	System.out.println("this is second testcse");
	    }
	    @Test (dependsOnMethods="hari")
	    public void dhamo() {
	    	System.out.println("this is third testcase");
	    }

}
