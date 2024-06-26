package classnotes;

public class MethodOverriding_Child extends MethodOverriding_Parent {
	public void display()
	{
		System.out.println("B");
	}

	public static void main(String[] args) {
		
		MethodOverriding_Child obj=new MethodOverriding_Child ();
		obj.display();

	}

}
