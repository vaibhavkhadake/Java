package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

/******************************************************************************
 *  
 *  Purpose:Repeat the Die Roll n times and suggest which
			number between 1 and 6 fall maximum number of times.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   05-08-2019
 *
 ******************************************************************************/
public class Rolldice {

	public static void main(String[] args)
	{
		int number;
		
		System.out.println("enter number");
		number=Utility.integerInput();
		Utility.countDice(number);
		
	}

}
