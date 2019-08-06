package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class CarLoan {

	public static void main(String[] args) 
	{
		double principal,rate_of_interest,period;
		System.out.println("Enter Principal amount");
		principal=Utility.doubleInput();
		System.out.println("Enter Rate of interest");
		rate_of_interest=Utility.doubleInput();
		System.out.println("Enter period");
		period=Utility.doubleInput();
		Utility.loan(principal,rate_of_interest,period);
	}

}
