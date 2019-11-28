
public class student {
	String name;
	int id;
	long phone;
	String cname;
	String grade;
	
	public student(String name,int id,long phone,String cname,String grade)
	{
		this.name=name;
		this.id=id;
		this.phone=phone;
		this.cname=cname;
		this.grade=grade;
	}
	void display()
	{
		System.out.println("name is = "  +name);
		System.out.println("id is = " +id);
		System.out.println("phoneNo is = " +phone);
		System.out.println("cname is = " +cname);
		System.out.println("grade is = " +grade);
	}
	public static void main(String[] args)
	{
		student s1=new student("priya",101,77955509,"gndec","S");
		s1.display();
		student s2=new student("pooja",102,77955508,"pdeec","S+");
		s2.display();
		student s3=new student("som",103,77955519,"vcbd","A");
		s3.display();
		student s4=new student("vikram",104,77965509,"Nsit","A+");
		s4.display();
		student s5=new student("chinnu",105,779556709,"GNsit","B");
		s5.display();
		student s6=new student("shantu",106,78955509,"rynse","C");
		s6.display();
		student s7=new student("swathi",107,77955559,"pgit","D");
		s7.display();
		student s8=new student("saumya",108,77985509,"gndec","A");
		s8.display();
		student s9=new student("subhram",109,77945509,"Nsit","B");
		s9.display();
		student s10=new student("kiran",110,91412759,"gurc","F");
		s10.display();
		
	}
	
	

}
