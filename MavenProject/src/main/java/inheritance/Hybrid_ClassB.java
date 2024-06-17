package inheritance;

public class Hybrid_ClassB extends Hybrid_CLassA{
	public void display1() {
		System.out.println("Class B");
	}

	public static void main(String[] args) {
		
		Hybrid_ClassB obj=new Hybrid_ClassB();
		obj.display();
		obj.display1();

	}

}
