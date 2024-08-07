package variables;

public class Variables {

	
	static int b=20; //static variable
	
	int c=100; //Instance variable
	
	
			public void display1() {
			int a=10; // Local variable
			
		System.out.println("Local variable:"+" "+a);
		int b1=b;
		System.out.println("Static variable:"+" "+b1);
			}

			

	public static void main(String[] args) {
	
		Variables obj=new Variables();
		obj.display1();
	
		
		System.out.println("Instance variable"+" "+obj.c);
		
		System.out.println("Static variable:"+" "+b);
		
		
		
	}

}


