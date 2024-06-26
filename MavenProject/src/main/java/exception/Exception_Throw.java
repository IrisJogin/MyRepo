package exception;

public class Exception_Throw {

	public static void main(String[] args) {
		
		int age=10;
		
		if(age>=18) {
			System.out.println("Eligible");
		}
		
		else {
			throw new ArithmeticException("Invalid age entered");
		}
	}

}
