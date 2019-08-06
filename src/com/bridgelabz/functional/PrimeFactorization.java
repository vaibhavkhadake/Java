package com.bridgelabz.functional;
/******************************************************************************
 *  
 *  Purpose:Only prime number factorization.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   05-08-2019
 *
 ******************************************************************************/
import com.bridgelabz.utility.Utility;

public class PrimeFactorization {

	public static void main(String[] args)
	{
		int number;
		System.out.println("Enter Number greater than 2 ");
		number=Utility.integerInput();
		Utility.prime_fact(number);
				
		
			
		}
		

}
