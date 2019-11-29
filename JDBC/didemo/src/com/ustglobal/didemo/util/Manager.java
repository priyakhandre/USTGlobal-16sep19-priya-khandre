package com.ustglobal.didemo.util;

import com.ustglobal.didemo.dao.I;
import com.ustglobal.didemo.daoimpl.A;

public class Manager {
	A a = null;
	
	public I getI() {
		if(a==null) {
			a=new A();
			
		}
		return a;
	}

	

}

