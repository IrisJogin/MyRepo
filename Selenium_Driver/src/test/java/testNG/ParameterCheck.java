package testNG;

import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

public class ParameterCheck {
  @Test
  @Parameters({"p1","p2"})
 
  public void test2(int a, String C) {
	  
	  System.out.println("Interger:"+ a);
	  System.out.println("String:"+ C);
	  
  }
}
