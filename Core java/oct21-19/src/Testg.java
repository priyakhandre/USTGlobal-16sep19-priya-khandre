
public class Testg {
	public static void main(String[] ar)
	{
		FirstGen fg=new FirstGen();
		ThirdGen tg=new ThirdGen();
		fg.msg();
		fg.call();
		SecondGen sg=new SecondGen();
		sg.msg();
		sg.call();
		sg.games();
		tg.msg();
		tg.call();
		tg.games();
		tg.camera();
		
	}

}
