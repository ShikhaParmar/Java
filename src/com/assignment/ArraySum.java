package com.assignment;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		int[][]a=new int[3][3];
		int[][]b=new int[3][3];
		int[][]c=new int[3][3];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter value of a: ");
		for (int i = 0; i < 2; i++) {
		 for (int j = 0; j < 2; j++) {
			 a[i][j]=sc.nextInt();
		// System.out.print(a[i][j]);	
		}	
		}
		
		System.out.println("enter value of b: ");
		for (int i = 0; i < 2; i++) {
		 for (int j = 0; j < 2; j++) {
			 b[i][j]=sc.nextInt();
		// System.out.print(b[i][j]);	
		 }
		}
		System.out.println("Sum is...");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.println(c[i][j]);
			}	
		}
		sc.close();
	}

}
