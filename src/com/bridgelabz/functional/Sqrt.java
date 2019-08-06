package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

/******************************************************************************
 *  
 *  Purpose: Calculate Harmonic series. 
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   02-08-2019
 *
 ******************************************************************************/
public class Sqrt {

	public static void main(String[] args)
	{
		
		double cnumber;
		System.out.println("Enter number");
		cnumber=Utility.doubleInput();

		Utility.newtonSqrt(cnumber);
	}

}
