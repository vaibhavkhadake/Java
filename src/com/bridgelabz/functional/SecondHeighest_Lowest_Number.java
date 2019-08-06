package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
/******************************************************************************
 *  
 *  Purpose: Find the second lowest and second heighest number in given array; 
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   05-08-2019
 *
 ******************************************************************************/
public class SecondHeighest_Lowest_Number {

	public static void main(String[] args)
	{
		int array[]= {5,6,78,10,45,65,1,23,12};
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(+array[i]+",");
		}
		
		Utility.second_lowest_number(array);
		Utility.second_highest_number(array);
		
	}

}
