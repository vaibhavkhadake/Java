package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
/******************************************************************************
 *  
 *  Purpose: It is a utility class where we written all progams logic.
 *
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/
public class DoubleOpt {

	public static void main(String[] args) 
	{
		
        Utility utility = new Utility();
		System.out.println("Enter a , b, and c values");
		double a=Utility.doubleInput();
		double b=Utility.doubleInput();
		double c=Utility.doubleInput();	
		
	    utility.doubleOperations(a, b, c);
	}

}
