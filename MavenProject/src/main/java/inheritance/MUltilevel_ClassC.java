package inheritance;

public class MUltilevel_ClassC extends MUltilevel_ClassB{

	 public void display2() {
		 System.out.println("Class C");
	 }
	public static void main(String[] args) {
		
		MUltilevel_ClassC obj=new MUltilevel_ClassC();
		obj.display();
		obj.display1();
		obj.display2();

	}

}
