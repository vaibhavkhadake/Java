/******************************************************************************
 *  
 *  Purpose: Calculate distance using Math.pow() function 
 *
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   01-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;

public class Distance {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		
		Utility utility=new Utility();
		 
		int x,y;
		
		//convert string to integer
		//Take two interger value from commandLine
		x=Integer.parseInt(args[0]);
		
		y=Integer.parseInt(args[1]);

		utility.distance(x,y);

	}

}
