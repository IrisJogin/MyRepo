package interfaceprograms;

public class Interface_Multiple_ClassC implements Interface_Multiple_ParentA,Interface_Multiple_ParentB {

	public static void main(String[] args) {
		
	
		Interface_Multiple_ClassC obj=new Interface_Multiple_ClassC ();
		obj.display1();
		obj.display2();

	}

	
	public void display2() {
		
		System.out.println("A");
		
		
	}

	
	public void display1() {
		System.out.println("B");
		
	}

}
