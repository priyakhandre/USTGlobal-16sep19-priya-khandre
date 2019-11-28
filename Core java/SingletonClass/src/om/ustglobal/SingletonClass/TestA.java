package om.ustglobal.SingletonClass;

public class TestA {
	public static void main(String[] args) {
		MySingleton ms=MySingleton.getDbConnection();
		ms.s = "priya";
		System.out.println("hashcode is " +ms.hashCode());
		MySingleton mx=MySingleton.getDbConnection();
		mx.s = "pooja";
		System.out.println("hashcode is " +mx.hashCode());
		System.out.println(ms.s);
		System.out.println(mx.s);
		
	}

}

