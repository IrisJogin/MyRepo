package classnotes;

public class Agg_Child_1 {
	String rank;
	int div;
	Agg_Parent_1 add; //aggregation
	
	public Agg_Child_1(String rank, int div,Agg_Parent_1 add) {
		this.rank=rank;
		this.div=div;
		this.add=add;
		
	}
	
	public void display() {
		System.out.println(rank+" "+div);
		System.out.println(add.name+" "+add.rollnumber+" "+add.age+" "+add.city);
	}

	public static void main(String[] args) {
		Agg_Parent_1 obj=new Agg_Parent_1("Elvy",12,34,"TVM");
		
		Agg_Child_1 obj2=new Agg_Child_1("First",11,obj);
		
		obj2.display();
		

	}

}
