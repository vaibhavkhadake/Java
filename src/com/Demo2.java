package com;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args)
	{
		int[][] number=new int[3][3];
		int[][] number2=new int[3][3];
		int[][] number3=new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		String m;
		System.out.println("\n enter elements for first matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			m=sc.nextLine();
			number[i][j]=Integer.parseInt(m);
			}
		}
	/*	System.out.println("\n enter elements for second matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			m=sc.nextLine();
			number2[i][j]=Integer.parseInt(m);
			}
		}
		*/
			System.out.println("\nAddition of Matrix are : ");
            for(int i=0;i<3;i++)
    		{
    			for(int j=0;j<3;j++)
    			{
    			number3[i][j]=number[i][j]+number[i][j];
    			
    			if(number3[i][j]==number[i][j])
    				System.out.println("magic");  
    			System.out.print(number3[i][j]+" ");
    			}
    			
    		}
            
		
            sc.close();
	}

}
