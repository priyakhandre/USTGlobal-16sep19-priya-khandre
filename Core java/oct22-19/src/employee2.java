
public class employee2 {
	String name;
	int id;
	long adhar;
	employee2(String name ,int id , long adhar)
	{
		this.name=name;
		this.id=id;
		this.adhar=adhar;
	}
	employee2 (String name , int id){
		this.name=name;
		this.id=id;
	}
	employee2 (int id , String name){
		
		this.id=id;
		this.name=name;
	}
	void display(){
		System.out.println("name is = " +name);
		System.out.println("id is =" +id);
		System.out.println("adharNo is = " +adhar);
	}
	public static void main(String[] ar) {
		employee2 e1=new employee2("priya",101);
		e1.display();
		employee2 e2=new employee2("pooja", 102 , 9876543);
		e2.display();
		employee2 e3=new employee2( 102 ,"vikram");
		e3.display();
	}

}
