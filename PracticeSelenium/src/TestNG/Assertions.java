package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
  @Test
  public void assertion() {
	  String name="Agni";
	 // boolean value=true;
		/*
		 * if(name.equals("Agni")) { System.out.println("The nme is Agni"); } else
		 * {System.out.println("the name is not equal Agni");
		 * 
		 * }
		 */
	    Assert.assertEquals(name, "Agni");
	// Assert.assertNotEquals(name, "agni");
	// Assert.assertTrue(value, "False");
	// Assert.assertNotSame(name, "agni");
	  }
  }

