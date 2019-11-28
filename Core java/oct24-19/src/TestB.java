
public class TestB {
	static int b;
	int a;
	{
		a=10;
		b=20;
		System.out.println("Non static block 1");
	}
	public static void main(String[] args) {
		System.out.println("main started");
		TestB t = new TestB();
		 TestB t1=new TestB();
		 System.out.println("main ended");
	}
	{
		System.out.println("Non static block 2");
	}
	{
		System.out.println("a value is " +a);
		System.out.println("bf value is " +b);
	}

}
