package com;

public class Pp {

	public static void main(String[] args) 
	{
		int n=5;
		int space=n;
		for(int i=0;i<n;i++)
		{
			for(int r=1;r<space;r++)
			{
				System.out.print("  ");
			}
		for(int j=0;j<=i;j++)
			{
				System.out.print(j+"   ");
				
			}
			System.out.println();
			space--;
		}
		
	}

}
