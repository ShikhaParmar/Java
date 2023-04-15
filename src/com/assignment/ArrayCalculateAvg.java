package com.assignment;

import java.util.Scanner;

public class ArrayCalculateAvg {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int size=sc.nextInt();
		
		int array[]=new int[size];
		int sum=0;
		int avg=0;
		
		System.out.println("enter the array elements: ");
		int i = 0;
		for (int i1=0; i1<array.length; i1++);{
		array[i]=sc.nextInt();
		sum=sum+array[i];
		}
		avg=sum/array.length;
		System.out.println("Average: "+avg);
		
		sc.close();
	}

}
