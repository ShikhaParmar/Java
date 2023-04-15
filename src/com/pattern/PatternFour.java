package com.pattern;

public class PatternFour {
	public static void main(String[] args) {
		/*
		 * 1
		 * 01
		 * 101
		 * 0101
		 * 10101
		 */
				System.out.println(" ");
				for (int i = 1; i<=5; i++)
				{
					for (int j = i; j >=1; j--){
						if(j%2==0){
						System.out.print(0);
					}else {
						System.out.print(1);
					}
					
					}
					System.out.println();
				}
	}				

}
