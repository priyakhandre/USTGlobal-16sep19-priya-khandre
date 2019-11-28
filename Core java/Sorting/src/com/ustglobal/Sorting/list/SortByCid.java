package com.ustglobal.Sorting.list;

import java.util.Comparator;

public class SortByCid  implements Comparator <Customer>{
	@Override
	public int compare(Customer o1, Customer o2) {
		Integer p = o1.id;
		Integer q = o2.id;
		return p.compareTo(q);
	}

}
