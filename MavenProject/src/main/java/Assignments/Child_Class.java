package Assignments;

public class Child_Class extends Parent_Class {
	
	public void display() {
		
		System.out.println("This is child");
		super.display();
		
	}

	public static void main(String[] args) {
		
		Child_Class  obj=new Child_Class ();
		obj.display();

	}

}
