/******************************************************************************
 *  
 *  Purpose: Determine two variable month and day and check entered month and day are between given range.
 *
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class SpringSeason {

	public static void main(String[] args) {
		
		Utility utility=new Utility();
		int month,day;
		System.out.println("Enter month number");
		month=Utility.integerInput();
		
		System.out.println("Enter day number");
		day=Utility.integerInput();
		
		utility.monthDay(month, day);	
	}

}
