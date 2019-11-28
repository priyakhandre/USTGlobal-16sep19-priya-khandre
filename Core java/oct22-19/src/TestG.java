
public class TestG {
	final void add() {
		System.out.println("add() method");
	}
	final void add (int a) {
		System.out.println("add(int a) method");
	}
	public static void main(String[] ar) {
		superclass sup=new superclass();
	System.out.println("**************************************");
	subclass sub=new subclass();
	sub.getData();
	
   TestG tg=new TestG();
   tg.add();
   tg.add(10);
	
	}

}
