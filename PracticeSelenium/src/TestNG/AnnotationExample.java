package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationExample {
  @Test
  public void TestCase() {
	  System.out.println("I am Testcase");
  }
  @Test(priority = -0)
  public void TestCase2() {
	  System.out.println("I am Testcase2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am afterSuitee");
  }

}
