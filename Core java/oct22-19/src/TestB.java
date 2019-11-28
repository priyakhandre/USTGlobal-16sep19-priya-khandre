
public class TestB {
	static int a=25;
	int x;
	public static void add() {
	   
		final int b;
		b=20;
		
		System.out.println(a);     
		System.out.println(b);
		
	}
	public static void main(String[] ar) {
		add();
		TestB t=new TestB();
		System.out.println("x value is " +t.x);
		
	}

}
