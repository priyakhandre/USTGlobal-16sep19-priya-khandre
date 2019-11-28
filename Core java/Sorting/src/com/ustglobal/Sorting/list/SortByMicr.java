package com.ustglobal.Sorting.list;

import java.util.Comparator;

public class SortByMicr implements Comparator<Bank> {
	@Override
	public int compare(Bank o1, Bank o2) {
		Long l = o1.micr;
		Long m = o2.micr;
		return l.compareTo(m);
	}
	
	

}
