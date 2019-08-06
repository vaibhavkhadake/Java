/******************************************************************************
 *  
 *  Purpose: Take five uniform random values between 0 and 1,
             their average value, and their minimum and maximum value.
 *
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since  01-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Stats5 {

	public static void main(String[] args) {
		
		Utility utility=new Utility();
		
		double value1=Math.random();
		double value2=Math.random();
		double value3=Math.random();
		double value4=Math.random();
		double value5=Math.random();
		System.out.println("Values are"+value1+"\n"+value2+"\n"+value3+"\n"+value4+"\n"+value5);
		utility.random(value1,value2,value3,value4,value5);
		

	}

}
