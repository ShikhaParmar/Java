package com.pattern;

public class PatternOne {
	public static void main(String[] args) {
		//     1           
		//    1 2          
		//   1 2 3         
		//  1 2 3 4       
		// 1 2 3 4 5       
		
//		for (int i = 1; i <=5; i++) {
//			
//			for (int k = i; k <=5; k++) {
//				System.out.print(" ");
//				
//			}
//			for (int j = 1; j <=i; j++) {
//     			System.out.print(j+" ");
//				
//			}
//			System.out.println();
//		}
		

		

		/*
		 *      1
		 *     2 2
		 *    3 3 3
		 *   4 4 4 4   
		 */
		       System.out.println(" ");
		       for (int i = 1; i <=4; i++) {
		    	   for (int k = i; k <=4; k++) {
		    		   System.out.print(" ");
		    	   }
		    	   for (int j = i; j>=1; j--) {
		    		   System.out.print(i+" ");
		    	   }
		    	   System.out.println();
				}

	
}
}
