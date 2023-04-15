package com.assignment;

import java.util.Scanner;

/*
 * factorial number
 * fact=fact*i ===> formula
 */

public class FactorialNumber {
	public static void main(String[] args) {
		
		int no,fact=1;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter no...");
		no=scanner.nextInt();
			
		for (int i=no; i>=1; i--) {
			fact=fact*i;
			
		}
		System.out.println("fact= "+fact);
		
		
		scanner.close();
	}
	

}
