/******************************************************************************
 *  
 *  Purpose: Determines  performing Integer operations
 *
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;

public class IntOpt {

	public static void main(String[] args) {
	/**
	 * Take three interger values  
	 */
		System.out.println("Enter a , b, and c values");
		int a=Utility.integerInput();
		int b=Utility.integerInput();
		int c=Utility.integerInput();
		
		Utility.integerOperations(a, b, c);
	}

}
