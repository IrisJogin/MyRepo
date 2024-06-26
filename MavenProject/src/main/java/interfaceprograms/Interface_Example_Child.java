package interfaceprograms;

public class Interface_Example_Child implements Interface_Example_Parent{

	public static void main(String[] args) {
		
		Interface_Example_Child obj=new Interface_Example_Child();
		obj.display();

	}

	
	public void display() {
		System.out.println("Interface");
	}

}
