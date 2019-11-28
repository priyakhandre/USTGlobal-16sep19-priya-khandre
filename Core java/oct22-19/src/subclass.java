
public class subclass extends superclass {
	String s = "subclass variable";
	
	subclass() {
		super();
		System.out.println("subclass constructor");
	}
	
void getData() {
	System.out.println(s);
	System.out.println(this.s);
	System.out.println(super.s);
	super.superClassMethod();
	superClassMethod();
}

}
