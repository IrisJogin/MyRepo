package abstraction;

public class Abstraction_Child extends Abstraction_Ex {

	public static void main(String[] args) {
		Abstraction_Child obj=new Abstraction_Child();
		obj.display1();
		obj.display2();

	}

	
	public void display2() {
		System.out.println("Abstract class implementation");
		
	}

}
