package com.ustglobal.Sorting.list;

import java.util.Comparator;

public class SortByName implements Comparator<Bank> {
	@Override
	public int compare(Bank o1, Bank o2) {
		return o1.name.compareTo(o2.name);
	}
	
	
	

}
