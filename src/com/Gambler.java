package com;

import com.bridgelabz.utility.Utility;

public class Gambler {

	public static void main(String[] args) 
	{
	int stake ;
	int goal;
	int number;
	System.out.println("Enter stake");
	stake=Utility.integerInput();
	
	System.out.println("Enter goal");
	goal=Utility.integerInput();
	
	System.out.println("Enter number of times");
	number=Utility.integerInput();
	
	int bets=0,wins=0;
	for(int i=0;i<number;i++)
	{	
		int cash=stake;
		while(cash>0 && cash<goal)
		{
			
			if(Math.random()<0.5)
			{
				cash++;//win
			}
			else
			{
				cash--; //loss
			}
			
		}
		if(cash==goal)
		{
			wins++;	
		}
		else
		{
			bets++;
		}
	}
	
	System.out.println("wins "+wins);
	System.out.println("Winning % "+wins*100/number);
	System.out.println("bets "+bets);
	}

}
