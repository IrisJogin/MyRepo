package testNG;

import org.testng.annotations.Test;

public class BasicAnnotations {
  @Test
  public void testcase10() {
	  
	  System.out.println("testcase10");
  }
  
  @Test(groups="SmokeTest")
  public void testcase02() {
	  
	  System.out.println("testcase02");
  }
  
  @Test
  public void testcase03() {
	  
	  System.out.println("testcase03");
  }
  
  @Test(groups="SmokeTest")
  public void testcase04() {
	  
	  System.out.println("testcase04");
  }
  
  @Test
  public void testcase05() {
	  
	  System.out.println("testcase05");
  }
  
  @Test
  public void testcase06() {
	  
	  System.out.println("testcase06");
  }
}
