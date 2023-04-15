package com.pattern;
//      *
//    * * *
//  * * * * *
//    * * *
//      *
public class PatternThree {
	public static void main(String[] args) {
for (int i = 1; i <=5; i++) {
			
			for (int k = i; k <=5; k++) {
				System.out.print(" ");
				
			}
			for (int j = 1; j <=i; j++) {
				if(i%2!=0) {
     			System.out.print(" *");
				}
			}
			System.out.println();
		}
  for(int i=4; i>=1; i--) {
           for (int k=5; k>=i;k--) {
        	   System.out.print(" ");
           }
	  for (int j=1; j<=i;j++) {
		  if(i%2!=0) {
               System.out.print(" *");
            	}
	  }
            	System.out.println();
            }
            	
    }
	
}