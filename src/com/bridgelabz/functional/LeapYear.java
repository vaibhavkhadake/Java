/******************************************************************************
 *  
 *  Purpose: Determines program that takes a year as input and outputs the Year is
             a Leap Year or not a Leap Year.
 *
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class LeapYear {

	public static void main(String[] args) 
	{
        System.out.println("Enter Year ");
        int year= Utility.integerInput();
        Utility.leapYear(year);       
	}

}
