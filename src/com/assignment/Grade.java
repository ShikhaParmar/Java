package com.assignment;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double a,b,c,d,e;
			
		System.out.println("enter a marks ");
		a=sc.nextDouble();
		System.out.println("English marks........."+a);
		System.out.println("enter b marks ");
		b=sc.nextDouble();
		System.out.println("Gujarati marks........"+b);
		System.out.println("enter c marks ");
		c=sc.nextDouble();
		System.out.println("Maths marks..........."+c);
		System.out.println("enter d marks ");
		d=sc.nextDouble();
		System.out.println("Science marks........."+d);
		System.out.println("enter e marks ");
		e=sc.nextDouble();
		System.out.println("Hindi marks..........."+e);
		System.out.println("===============================");
		double  mysum=(a+b+c+d+e);
		System.out.println("Total marks..........."+(a+b+c+d+e));
		System.out.println("===============================");
		double myavg=((mysum)/5);
		System.out.println("Avrage................"+((mysum)/5));
		System.out.println("===============================");
		
		
		
		
		 if (myavg>=91 && myavg<=100) {
				System.out.println("AA Grade");
			 }else if (myavg>=80 && myavg<=100 ) {
				 System.out.println("AB Grade");
			 }else if (myavg>=70 && myavg<=100) {
				  System.out.println("BB Grade");
			 }else if (myavg>=60 && myavg<=100) {
				 System.out.println("BC Grade");
			 }else if (myavg>=50 && myavg<=100) {
				 System.out.println("CD Grade");
			 }else if (myavg>=40 ) {
				 System.out.println("DD Grade");
				 
				
			 
			} else {
				System.out.println("Fail");

			}
		
		
		sc.close();
		
		
}
}
