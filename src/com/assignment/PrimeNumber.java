package com.assignment;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int no=10,flag=1;
		
		for (int i=2; i<no; i++) {
			
			if(no%i==0) {
				//System.out.println("Not a Prime Number");
				flag=0;
			}
		//	else {
		//		System.out.println("Prime Number");
		//}
				
			
		}
		if(flag==1) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
		}
	}

}
