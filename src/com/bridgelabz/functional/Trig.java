package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

/******************************************************************************
 *  
 *  Purpose: Perform various trigonometric functions in the Math library.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   02-08-2019
 *
 ******************************************************************************/
public class Trig {

	public static void main(String[] args) 
	{
		System.out.println("Enter number");
		double number=Utility.doubleInput();
		double degree=(Math.toDegrees(number));
		System.out.println("Convert in degree "+degree);
		double radian=(Math.toRadians(degree));
		System.out.println("convet degree to radian "+radian);
		
		Utility.convert(radian);
	}

}
