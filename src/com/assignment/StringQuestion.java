package com.assignment;

public class StringQuestion {
	public static void main(String[] args) {
		
	
	 String s1=new String("Hello!! ");
	 String s2=new String(" World");
    
     System.out.println(s1.concat(s2));
     
     if (s1.compareTo(s2)==0) {
    	 System.out.println("both are same");
     }else {
    	 System.out.println("both are different");
     }
     s1.compareTo(s2);

//     // compare first and second strings
//     boolean result1 = first.equals(second);
//     System.out.println("Strings first and second are equal:.... " + result1);
//     
//     // concatenate string
//    System.out.println("concatenate string......"+result1);
//     
	}
}
