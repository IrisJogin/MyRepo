package Assignments;

public class Inheritnace_ClassC extends Inheritnace_ClassB {

	public void display() {

int total_salary=(basicpay+hra+pf-deduction+bonus);
   System.out.println("Total Salary"+" "+total_salary);
	}
	public static void main(String[] args) {
		
		Inheritnace_ClassC obj=new Inheritnace_ClassC();
		
		obj.additional();
		obj.display();
		
	}

}
