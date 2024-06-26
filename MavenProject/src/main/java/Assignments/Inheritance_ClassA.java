package Assignments;
import java.util.Scanner;
public class Inheritance_ClassA {
	int basicpay;
	int deduction;
	int bonus;
	public  void salarydetails() {
		//basicpay
	Scanner bp=new Scanner(System.in);
	System.out.println("Enter the basic salary");
	 this.basicpay=bp.nextInt();
	      //deduction
	Scanner d=new Scanner(System.in);
	System.out.println("Enter the deducted amount");
	 this.deduction=d.nextInt();
	     //bonus
	Scanner b=new Scanner(System.in);
	System.out.println("Enter the bonus amount");
	 this.bonus=b.nextInt();
	}

}
