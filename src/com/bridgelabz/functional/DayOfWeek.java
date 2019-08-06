package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;
/******************************************************************************
 *  
 *  Purpose: It is a utility class where we written all progams logic.
 *
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   01-08-2019
 *
 ******************************************************************************/
public class DayOfWeek {
/**
 * @param args
 */
	public static void main(String[] args) {
		
		Utility utility=new Utility() ;
		int day=Integer.parseInt(args[0]);
		int month=Integer.parseInt(args[1]);
		int year=Integer.parseInt(args[2]);
		
		utility.dayWeek( day, month, year);	
	}

}
