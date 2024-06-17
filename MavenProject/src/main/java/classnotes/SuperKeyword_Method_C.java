package classnotes;

public class SuperKeyword_Method_C extends SuperKeyword_Method_P {
	
	public void display() {
		
		super.add(5, 6);  // invokes immediate parent class
	}

	public static void main(String[] args) {
		
		SuperKeyword_Method_C obj=new SuperKeyword_Method_C();
		obj.display();
	}

}
