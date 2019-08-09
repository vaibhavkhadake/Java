package com;

import com.bridgelabz.utility.Utility2;

public class demo {

	public static void main(String[] args) 
	{
		System.out.println("enter number");
		int number=Utility2.integerInput();
		int rem=0;
		int number2=0;
		int a = 0,b = 0;
		
		while(number>1)
		{
			rem=number%10;
			number2=number/10;
			if(number2>9)
			{
				 a=number2%10;
				 b=number2/10;
				 number=(rem*rem)+(a*a)+(b*b);
			}
			else
			{
				number=(rem*rem)+(number2*number2);
			}	
			//if number is unhappy then goes to infinite loop
			if(number==4)
			{
				System.out.println("Unhappy");	
				break;
			}
			
		}
		if(number==1)
		{
			System.out.println("happy");
		}
	
		
	}

}
