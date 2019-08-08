package com;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args)
	{
		int[][] number=new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		String m;
		System.out.println("enter elements");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			m=sc.nextLine();
			number[i][j]=Integer.parseInt(m);
			}
		}
			System.out.println("Elements in Matrix are : ");
            for(int i=0;i<3;i++)
    		{
    			for(int j=0;j<3;j++)
    			{
    			System.out.print(number[i][j]+" ");
    			}
    			System.out.println();
    		}
            
		
            sc.close();
	}

}
