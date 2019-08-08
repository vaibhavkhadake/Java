package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

/******************************************************************************
 *  
 *  Purpose: Prints a table of the powers of 2 that are less than or equal to 2^n. 
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   02-08-2019
 *
 ******************************************************************************/
public class PowerOf2 {

	public static void main(String[] args) 
	{
		int number=Integer.parseInt(args[0]);
		///System.out.println(number);
		Utility.power(number);
	}

}
