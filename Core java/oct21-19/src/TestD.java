
public class TestD {
	public static void main(String[] ar)
	{
		BTM b=new BTM();
		b.swipe();
		int count=b.getCount();
		System.out.println("count is=" +count);
		int TotalCount=b.getTotalCount();
		System.out.println("totalcount is=" +TotalCount);
	}

}
