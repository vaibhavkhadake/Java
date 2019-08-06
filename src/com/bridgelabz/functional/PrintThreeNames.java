/******************************************************************************
 *  
 *  Purpose: Determines three persons names then reverse the order of names.
 *
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class PrintThreeNames {
	
	public static void main(String[] args) 
	{
		String firstPerson,secondPerson,thirdPerson;

		System.out.println("You need to enter three persons Names ");
		
		System.out.println("Enter first person name ");
		firstPerson=Utility.stringInput();
		
		System.out.println("Enter second person name ");
		secondPerson=Utility.stringInput();
		
		System.out.println("Enter third person name ");
		thirdPerson=Utility.stringInput();
		
		System.out.println("Reverse order names are \t");
		
		// we call method 
		
		Utility.threeNames(firstPerson, secondPerson, thirdPerson);
		
	}

}
