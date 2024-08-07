package aggregartion;

public class Aggregation_Child_1 {
	
	int projectnumber;
	Agrregation_Parent_1 join;
	
	public Aggregation_Child_1(int projectnumber,Agrregation_Parent_1 join )
	{
		this.projectnumber=projectnumber;
		this.join=join;
	}
	
	public void display() {
		System.out.println(projectnumber);
		System.out.println(join.projectname+" "+join.numbers);
	}

	public static void main(String[] args) {
		
		Agrregation_Parent_1 obj1=new Agrregation_Parent_1 ("Spectrum",3);
		
		Aggregation_Child_1 obj=new Aggregation_Child_1(7,obj1);
		obj.display();
		
	}

}
