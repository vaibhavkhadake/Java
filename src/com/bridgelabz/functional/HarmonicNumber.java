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
public class HarmonicNumber {

	public static void main(String[] args)
	{
		int number=Integer.parseInt(args[0]);
		Utility.harmonic(number);
	}

}
