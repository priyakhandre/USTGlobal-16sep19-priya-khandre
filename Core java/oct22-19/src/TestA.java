
public class TestA {
	
	public static int add(int a,int b) {
		System.out.println("add(int a int b) method");
		return a+b;
		
	}
	public static long add (long a,long b)
	{
		System.out.println("add(int a ,int b) method");
		return a+b;
		
	}
	public static void add (int a ,byte b)
	{
		System.out.println("add(int a , byte b) method ");
	}
	public int multiply (int a,int b) {
		System.out.println("multiply (int a,int b) method");
		return a+b;
		
	}
	public int multiply(byte a ,int b)
	{
		System.out.println("multiply (int a,int b)method");
	    return a+b;
	}
	
	public static void main(String[] args) {
		System.out.println("main (String[] args");
		main(10);
		add(10,20);
		add(12,34);
		add(98,56);
		TestA t=new TestA();
		t.multiply(12,45);
		t.multiply(12,34);
		
	}
	public static void main(int a)
	{
		System.out.println("main (int a)method");
	}
}
