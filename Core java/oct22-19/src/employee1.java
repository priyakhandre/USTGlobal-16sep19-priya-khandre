
public class employee1 {
	String name;
	int id;

	employee1(String name , int id)
	{
		this.name= name;
		this.id=id;
	}
     void printDetails()
	{
		System.out.println("employee name is " +name);
		System.out.println("employee id is " +id);
	}
     
     public static void main(String[] ar)
     {
    	 employee1 e1=new employee1("deepika", 123);
    	 e1.printDetails();
    	 employee1 e2=new employee1("alia" , 345);
    	 e2.printDetails();
    	 employee1 e3=new employee1("priya" , 987);
    	 e3.printDetails();
    	 
     }

}
