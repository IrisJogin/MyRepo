package exception;

public class Exception_NumberFormat {

	public static void main(String[] args) {
		
		try {
		
		int a=Integer.parseInt(null);
		
		}
		
		catch(NumberFormatException q) {
			System.out.println(q);
		}

	}

}
