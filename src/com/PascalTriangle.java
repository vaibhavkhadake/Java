package com;

public class PascalTriangle {

	public static void main(String[] args)
	{
		int no=5;
		int space=no;
		int no2=1;
		for(int i=0;i<=no;i++)
		{
			for(int s=1;s<=space;s++)
			{
				System.out.print(" ");
			}
			 no2=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(no2+" ");
				no2=no2*(i-j)/(j+1);
			}
			space--;
			System.out.println();
			
		}

	}

}
