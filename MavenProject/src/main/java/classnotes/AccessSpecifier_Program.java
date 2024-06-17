package classnotes;

public class AccessSpecifier_Program {
	
	public void display1()
	{
		System.out.println("This is a public");
	}

	private void display2()
	{
		System.out.println("Private");
	}
	
	protected void display3()
	{
		System.out.println("Protected");
	}
	
	void display4()
	{
		System.out.println("Default");
	}
	public static void main(String[] args) {
		
		AccessSpecifier_Program obj=new AccessSpecifier_Program ();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();
	}

}
