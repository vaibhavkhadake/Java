package com.bridgelabz.functional2;
import java.util.Calendar;
import java.util.Date;

/******************************************************************************
 *  
 *  Purpose: Prints the Calendar of that month and year 
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
import com.bridgelabz.utility.Utility2;

public class Calender {

	public static void main(String[] args) 
	{
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		
		String[] month1= {"","January", "February", "March","April", "May", "June","July", "August", "September","October", "November", "December"};
		int[] dayInMonth= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		Calendar c = Calendar.getInstance();
		
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
	           
		//Utility2.calender(month,year);
		
		 
	}

}
