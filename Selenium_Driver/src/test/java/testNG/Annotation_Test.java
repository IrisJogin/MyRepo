package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotation_Test {
  @Test
  
public void testcase10() {
	  
	  System.out.println("testcase10");
  }
  
  @Test
  public void testcase02() {
	  
	  System.out.println("testcase02");
  }
  
  @Test
  public void testcase03() {
	  
	  System.out.println("testcase03");
  }
  
  @Test
  public void testcase04() {
	  
	  System.out.println("testcase04");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("afterSuite");
  }

}
