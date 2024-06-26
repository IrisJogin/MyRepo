package classnotes;

public class This_CurrentMethod_Example {
	public void display1() {
		System.out.println("A");
		
	}
	public void display2() {
		System.out.println("B");
		this.display1();
	}

	public static void main(String[] args) {
		
		This_CurrentMethod_Example obj=new This_CurrentMethod_Example();
		obj.display2();

	}

}
