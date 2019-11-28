
public class employee {
	String name;
	int id;

	employee(String ename , int eid)
	{
		name= ename;
		id=eid;
	}
     void printDetails()
	{
		System.out.println("employee name is " +name);
		System.out.println("employee id is " +id);
	}
	public static void main(String[] ar) {
		employee e1=new employee("priya", 143);
		e1.printDetails();
		employee e2=new employee("pooja" ,  420);
		e2.printDetails();
		employee e3=new employee("vikram",670);
		e3.printDetails();
		
		
		
		}

}
