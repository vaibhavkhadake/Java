package com.bridgelabz.functional;

/******************************************************************************
 *  
 *  Purpose:Convert decimal to binary ,
 *  	    Swaping nibbles and get new decimal number and check number is power of 2 or not.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   03-08-2019
 *
 ******************************************************************************/
import com.bridgelabz.utility.Utility;

public class BinaryNibble {

	public static void main(String[] args)
	{
		System.out.println("Enter Decimal number");
		int decimalNumber=Utility.integerInput();
		Utility.decimalToBinry(decimalNumber);
		Utility.swapNibble(decimalNumber);

	}

}
