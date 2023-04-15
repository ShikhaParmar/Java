package com.assignment;

public class ArraySecondNo {
	public static void main(String[] args) {
		
			int[] a= {1,4,2,5,9,12,7};
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) { 
				if (a[i]<a[j]) {
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}	
			}	
		}
		System.out.println("second largest no...."+a[1]);
	}

}
