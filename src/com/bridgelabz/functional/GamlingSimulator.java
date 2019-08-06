package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

/******************************************************************************
 *  
 *  Purpose: ­Simulates a gambler who start with $stake and place fair $1 bets
 *  		 until she goes broke or reach $goal. Keeps track of the number of
 *  		 times she wins and the number of bets she makes. Run the experiment N
 *  		 times, averages the results, and prints them out.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   02-08-2019
 *
 ******************************************************************************/
public class GamlingSimulator {

	public static void main(String[] args) 
	{
		double stake, goal  ,trails;
		
		System.out.println("Enter stake ");
		stake=Utility.doubleInput();
		System.out.println("Enter goal ");
		goal=Utility.doubleInput();
		System.out.println("Enter trails ");
		trails=Utility.doubleInput();
		
		Utility.gamling(stake,goal,trails);
	}

}
