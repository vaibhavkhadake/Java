package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

/******************************************************************************
 *  
 *  Purpose:Convert decimal to binary
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   03-08-2019
 *
 ******************************************************************************/
public class Binary {

	public static void main(String[] args) {
		
		int decimalNumber=Integer.parseInt(args[0]);
		Utility.decimalToBinry(decimalNumber);
		/*String b=Integer.toBinaryString(decimalNumber);
		System.out.println(b);
		*/
	}

}
