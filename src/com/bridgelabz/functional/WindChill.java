/******************************************************************************
 *  
 *  Purpose: Calculate
 *
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since  01-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		
		Utility utility=new Utility();
		/**the formula is not valid if tempereture is larger than 50 in absolute value or if wind_speed is larger
		than 120 or less than 3 (you may assume that the values you get are in that range).
		*/
		double temperature=Double.parseDouble(args[0]);
		double wind_speed=Double.parseDouble(args[1]);
		
		utility.windchil(temperature,wind_speed);	
	}

}
