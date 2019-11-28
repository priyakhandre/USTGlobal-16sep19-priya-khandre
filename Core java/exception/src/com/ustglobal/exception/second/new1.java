package com.ustglobal.exception.second;

import java.io.File;
import java.io.IOException;

public class new1 {
	
	void open() throws IOException {
		File f1=new File("b.txt");
		f1.createNewFile();
	}

}
