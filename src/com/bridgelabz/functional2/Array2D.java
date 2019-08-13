package com.bridgelabz.functional2;

import com.bridgelabz.utility.Utility2;

public class Array2D {

	public static void main(String[] args)
	{
		int[][] m=new int[3][3];
		System.out.println("Enter elements in array");
		
		
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m.length;j++)
			{
				m[i][j]=Utility2.integerInput();
			}
		}

		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m.length;j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.println("  ");
		}

	}

}
