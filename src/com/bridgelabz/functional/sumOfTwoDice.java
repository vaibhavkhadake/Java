/******************************************************************************
 *  
 *  Purpose: Calculate sum of two dice randomly
 *
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class sumOfTwoDice {

	public static void main(String[] args) 
	{
		int dice1,dice2;
		Utility utility=new Utility();
		
		//math.random function get random value  
		dice1 =(int)(Math.random()*6)+1;
		dice2=(int)(Math.random()*6)+1;
		
		System.out.println(dice1);
		System.out.println(dice2);
		
		utility.sumOfTwodice(dice1, dice2);
		
	}

}
