package encapsulation;

public class For_Each_Loop {

	public static void main(String[] args) {
		
		String []a= {"Cat","Dog","Blue","Red","Duck"};
		
		for(String b:a) {
			System.out.println(b);
			
			int []c= {23,45,67,89,00};
			for(int d:c) {
				System.out.println(d);
			}
		}
	}

}
