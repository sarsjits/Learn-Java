package com.sarsjits.java.random.comparator;

public class StudentClassForSorting {
	int rollNumber;
	String name, address;

	public StudentClassForSorting(int rollNumber, String name, String address) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentClassForSorting [rollNumber=" + rollNumber + ", name=" + name + ", address=" + address + "]";
	}
}
