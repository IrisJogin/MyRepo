package exception;

public class Exception_Customized {
	
	public void voting_age(int age) throws InvalidException {
		
		if(age>=18) {
			System.out.println("Eligible");
		}
		
		else if(age<18) {
			
			throw new InvalidException("Ineligible");
			
		}
	}

	public static void main(String[] args) throws InvalidException {
		
		Exception_Customized obj=new Exception_Customized();
		obj.voting_age(4);
	}

}
