package com.ustglobal.object_class;

public class Usbport {
	public static void connect (Object obj)
	{
		if (obj instanceof Mouse)
		{
			Mouse m = (Mouse)obj;
			m.click();
			m.scroll();
		}else if (obj instanceof pendrive) {
			pendrive p = (pendrive)obj;
			p.read();
			p.write();
			
		}else 
			System.out.println("invalid object");
		
	}
}
