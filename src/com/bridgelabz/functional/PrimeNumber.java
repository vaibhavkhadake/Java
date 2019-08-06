package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;
/******************************************************************************
 *  
 *  Purpose: Calculate prime numbers in given series.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   02-08-2019
 *
 ******************************************************************************/

public class PrimeNumber {

	public static void main(String[] args) 
	{
		System.out.println("Enter Range ");
		int range=Utility.integerInput();
		
		Utility.prime(range);
	}

}
