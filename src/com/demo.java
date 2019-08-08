package com;

public class demo {

	public static void main(String[] args) 
	{
		int number=1000;
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
		}
		if(number==1)
		{
			System.out.println("happy");
		}
		
		
	}

}
