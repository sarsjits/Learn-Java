package com.sarsjits.java.random.comparator;

import java.util.Comparator;

public class SortByRoll implements Comparator<StudentClassForSorting> {

	@Override
	public int compare(StudentClassForSorting o1, StudentClassForSorting o2) {
		return o2.rollNumber - o1.rollNumber;
	}
	
}
