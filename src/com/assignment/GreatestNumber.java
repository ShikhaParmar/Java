package com.assignment;

import java.util.Scanner;

/*
 * greatest of three number
 */
public class GreatestNumber {
	public static void main(String[] args) {
		int a,b,c;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter a......");
		a=scanner.nextInt();
		
		System.out.println("enter b......");
		b=scanner.nextInt();
		
		System.out.println("enter ......");
		c=scanner.nextInt();
		
		
		
		if (a>b) {
			if (a>c) {
				System.out.println("a is greater");
			}else {
				System.out.println("c is greater");
			}
		}
			else {
				if (b>c) {
					System.out.println("b is greater");
			}else {
				System.out.println("C is greater..");
				  }
			}
		scanner.close();
	}

}
