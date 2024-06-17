package inheritance;

public class Hybrid_ClassC extends Hybrid_CLassA{
	public void display2() {
		System.out.println("Class C");
	}

	public static void main(String[] args) {
		Hybrid_ClassC obj=new Hybrid_ClassC();
		obj.display();
		obj.display2();
		
		

	}

}
