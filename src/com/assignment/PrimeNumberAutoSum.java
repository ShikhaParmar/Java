package com.assignment;

public class PrimeNumberAutoSum {
public static void main(String[] args) {
	int no=100,sum=0,count=0;
	
	for (int i=1; i<=no; i++) {
		count=0;
		for(int j=1;j<=no;j++) {
			if(i%j==0) {
				count++;
		}
	}
	if(count==2) {
		System.out.println(i);
		sum= sum+i;
	}
	}
	
	System.out.println("the sum of prime number : "+sum);
}
}
