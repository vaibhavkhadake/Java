package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

/******************************************************************************
 *  
 *  Purpose: Flip the coin check what percent head and tails occurs.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   02-08-2019
 *
 ******************************************************************************/
public class FlipCoin {

	public static void main(String[] args) {
		
		int coin;
		System.out.println("Enter a number we want to Flip the coin");
		coin=Utility.integerInput();
		
		Utility.coin(coin);
		
	}

}
