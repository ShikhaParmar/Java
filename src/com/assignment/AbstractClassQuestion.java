package com.assignment;
abstract class Parent{
	
	public void message() {
		
	}
}
 class FirstSubClass extends Parent{
	
	public void message() {
		System.out.println(" this is first subclass");
	}
}
 class SecondSubClass extends Parent{
	 public void message() {
			System.out.println(" this is a second subclass");		
	}
 }
public class AbstractClassQuestion {
	public static void main(String[] args) {
		FirstSubClass f=new FirstSubClass();
		SecondSubClass s=new SecondSubClass();
		
		f.message();
		s.message();	
		
	}

}
