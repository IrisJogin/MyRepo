package Assignments;

public class Inheritnace_ClassB extends Inheritance_ClassA  {
	int hra;
	int pf;

	public void additional() {
		super.salarydetails();
		 this.hra=(5*basicpay)/100;
		this.pf=(20*basicpay)/100;

}}
