package testNG;

import org.testng.annotations.Test;

public class priorityTest {
  @Test(enabled=false)
 public void testcase03() {
	  
	  System.out.println("testcase03");
  }
  
  @Test(priority=-1)
  public void testcase04() {
	  
	  System.out.println("testcase04");
  }
}
