package classnotes;

public class SuperKeyword_Variable_C extends SuperKeyword_Variable_P  {
	String bagcolor="White";
	
	public void display() {
		System.out.println(bagcolor);
		System.out.println(super.bagcolor);
	}
	

	public static void main(String[] args) {
		
		SuperKeyword_Variable_C obj=new SuperKeyword_Variable_C();
		obj.display();
	}

}
