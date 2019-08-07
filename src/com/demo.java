package com;

public class demo {

	public static void main(String[] args) {
		int number=19 ;
		int rem=0;
		int add=0;
		while(number>0)
		{
		rem=number%10;
		add=add+(rem*rem);
		number=number/10;
		}
		if(number==1)
			
		{
			System.out.println("Happy");
		}
		else
		{
			System.out.println("unhappy");
		}
	}

}
