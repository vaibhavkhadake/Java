/******************************************************************************
 *  
 *  Purpose: Determines Quadratic equcation.
 *
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		double a,b,c;
		System.out.println("Enter a, b, and c values");
		a=Utility.doubleInput();
		b=Utility.doubleInput();
		c=Utility.doubleInput();

		utility.quadratic(a, b, c);	
	}

}
