
public class TestA {

	public static void main(String[] args) {
		pen p=new pen();
		p.cost=100;
		p.color = "blue";
		p.brand = "parker";
		System.out.println("cost is =" + p.cost);
		System.out.println("color is =" + p.color);
		System.out.println("brand is =" + p.brand);
		p.write();
		System.out.println("****************************************************");
		van v=new van();
		v.cost = 200000;
		v.color = "black";
		System.out.println("van cost is" +v.cost);
		System.out.println("van color is" +v.color);
		v.move();

		van v1=new van();
		v1.cost = 270000;
		v1.color = "blue";
		System.out.println("van cost is" +v1.cost);
		System.out.println("van color is" +v1.color);
		v.move();
		System.out.println("****************************************************");
		
		cow c=new cow();
		c.name = "swathi";
		c.color ="black";
		System.out.println("cow name is "  + c.name);
		System.out.println("cow color is "  +  c.color);
		c.eat();
		c.sleep();
		
		cow c1=new cow();
		c1.name = "ganga";
		c1.color ="brown";
		System.out.println("cow name is "  + c1.name);
		System.out.println("cow color is "  +  c1.color);
		c1.eat();
		c1.sleep();
	}
}
