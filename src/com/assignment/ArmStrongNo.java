package com.assignment;

public class ArmStrongNo {
public static void main(String[] args) {
	int no=153,num=no, rem,cube,sum=0;
	
	while(no!=0) {
		rem=no%10;
		no=no/10;
		cube=rem*rem*rem;
		sum=sum+cube;
		
	}
	if(sum==num) {
	System.out.println("Armstrong no..");
}else {
	System.out.println("Not Armstrong no..");
}
}
}
