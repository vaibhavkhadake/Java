package com.bridgelabz.functional2;
//import com.bridgelabz.utility.Utility;
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
		/*int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		
		String[] month1= {"","January", "February", "March","April", "May", "June","July", "August", "September","October", "November", "December"};
		int[] dayInMonth= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		if (month == 2 && leapYear(year)) dayInMonth[month] = 29;

	           System.out.println(" "+month1[month]+" "+year);
	           System.out.println("S M T W TH F SA");
	           
	           int d = day(month, 1, year);
	           
	           for (int i = 0; i < d; i++)
	               System.out.print("   ");
	           for (int i = 1; i <= dayInMonth[month]; i++)
	           		{
	               System.out.print("  "+i);
	               
	               if (((i + d) % 7 == 0) || (i == dayInMonth[month]))
	            	   {
	            	  System.out.println();
	            	   }
	           }

		//Utility2.calender(month,year);
		
		 
	}
	
	public static int day(int month, int day, int year)
	{
        int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31*m)/12) % 7;
        return d;
    }

	private static boolean leapYear(int year) {
		if  ((year % 4 == 0) && (year % 100 != 0))
			{
			return true;
			}
		else if  (year % 400 == 0) 
        	{
        	return true;
        	}
		return false;
		*/
	}
	

}
