package testNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Cls1 {
  
	@AfterClass
	  public void afterClass() {
		 System.out.println("After Class");
	  }
	@Test
  public void func1() {
  
  System.out.println("Test 1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  
  }
  @Test
  public void func2() {
	  System.out.println("Test 2");
  
  }
}
