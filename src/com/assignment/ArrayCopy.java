package com.assignment;

public class ArrayCopy {
public static void main(String[] args) {
	int[] a= {43,45,456};
	int b[]=new int[a.length];
	for (int i = 0; i < a.length; i++) {
		b[i]=a[i];
	}
	System.out.println("original array");
	for (int i = 0; i < a.length; i++) {System.out.println(a[i]);
		
	}
	System.out.println("Copy of Array");
	for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
	}
}
}