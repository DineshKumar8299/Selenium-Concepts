package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testclass {

	@Test(retryAnalyzer=Failedclass.class)// for iannotation analyzer dont mention retryanalyzer in testag
	public void test() {
		
		Assert.assertTrue(false);
		System.out.println("this is test case");
	}
}

/*<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
<listeners >
<listener class-name="TestNG.Failedclass"></listener>
</listeners>
  <test thread-count="5" name="Test">
    <classes>
      <class name="TestNG.testclass"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->*/
