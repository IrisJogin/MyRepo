package exception;

public class Exception_Arithemetic_1 {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
       try {
		int c= a/b;
		System.out.println(c);
		}
		
		catch(ArithmeticException q) {
			System.out.println("Error"+" "+ q);
		}
  
       finally {
    	   
    	   System.out.println("Stop");
       }
    
	}

}
