package com.ustglobal.Sorting.list;

import java.util.Comparator;

public class SortByPincode implements Comparator <Bank> {
	@Override
	public int compare(Bank p1, Bank p2) {
		Integer p = p1.pincode;
		Integer q = p2.pincode;
		return p.compareTo(q);
			
		
	}
		
}
