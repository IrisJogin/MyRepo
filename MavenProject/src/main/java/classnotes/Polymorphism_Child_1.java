package classnotes;

public class Polymorphism_Child_1 extends Polymorphism_Parent_1  {
	public void display() {
		System.out.println("Child");
		super.display("Maya");
	}

	public static void main(String[] args) {
		
		Polymorphism_Child_1 obj=new Polymorphism_Child_1();
		obj.display();
	}

}
