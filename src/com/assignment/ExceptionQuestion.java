package com.assignment;

import java.util.Scanner;

class ShikhaException extends Exception{
	double amount;
	public ShikhaException(double amount){
	this.amount=amount;
	}
}
class ATM{
	double balance;
	public void deposit(double amount) {
		balance += amount; //balance= balance+amount
		System.out.println(+amount+ " deposited to your account. your currant balance is "+balance);
		
	}
	public void withdraw(double amount) throws ShikhaException {
		if (amount<=balance) {
			balance -= amount;
			System.out.println(amount+ "rs withdrawn to your account ");
			
		}else {
			double needs;
			needs=amount-balance;
			throw new ShikhaException(needs);
		}
	}
}
public class ExceptionQuestion {
	public static void main(String[] args) {
ATM a=new ATM();
        
		Scanner sc=new Scanner(System.in);
		double amount;
		System.out.println("enter deposit amount: ");
		amount=sc.nextDouble();
		a.deposit(amount);
		System.out.println("enter withdrawn amount: ");
		amount=sc.nextDouble();
		
		try {
			a.withdraw(amount);
		} catch (ShikhaException e) {
			System.out.println("we need"+e.amount+ "rs more to withdraw "+amount+ "rs");
			// TODO: handle exception
		}
		sc.close();
	}

}
