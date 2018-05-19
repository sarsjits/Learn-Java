package com.sarsjits.java.random.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<StudentClassForSorting> arr = new ArrayList<>();
		arr.add(new StudentClassForSorting(1, "Jitendra", "Jodhpur"));
		arr.add(new StudentClassForSorting(5, "Shanu", "Agra"));
		arr.add(new StudentClassForSorting(3, "Manik", "Ambala"));
		Collections.sort(arr, new SortByRoll());
		for(StudentClassForSorting s : arr) {
			System.out.println(s.toString());
		}
	}

}
