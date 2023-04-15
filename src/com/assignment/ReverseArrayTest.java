package com.assignment;

public class ReverseArrayTest {
	public static void main(String[] args) {
		  ReverseArrayTest aReverseArrayTest = new ReverseArrayTest();
	        
	        int[] intArray = {12, 56, 34, 79, 26, 100};
	        aReverseArrayTest.printArray(intArray);
	        aReverseArrayTest.reverseArray(intArray);
	        aReverseArrayTest.printArray(intArray);
	    }
	    
	    private void reverseArray(int[] intArray) {
	        if (intArray.length == 0) {
	            return;
	        }
	        
	        for(int i = 0; i < intArray.length / 2; i++) {
	            int tmp     = intArray[i];
	            intArray[i] = intArray[intArray.length - i -1];
	            intArray[intArray.length - i - 1] = tmp;
	        }
	    }
	    
	    private void printArray(int[] intArray) {
	        for(int i = 0; i < intArray.length; i++) {
	            System.out.printf("%d ", intArray[i]);
	        }
	        System.out.println();
	}

}
