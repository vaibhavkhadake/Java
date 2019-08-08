package com.bridgelabz.functional2;
/******************************************************************************
 *  
 *  Purpose:Static Function to find Day Of Week that takes a date as input and returns the day of the
			week that date falls on.
 *  @author  Vaibhav P  Khadake
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
import com.bridgelabz.utility.Utility2;

public class DayOfWeek {

	public static void main(String[] args) {
		
		int day=Integer.parseInt(args[0]);
		int month=Integer.parseInt(args[1]);
		int year=Integer.parseInt(args[2]);
		
		Utility2.dayOfWeek(day, month, year);	

	}

}
