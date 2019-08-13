package com.bridgelabz.utility;

import com.bridgelabz.utility.Utility2;

public class Magic2 {

	public static void main(String[] args)
	{
		int[][] arr=new int[3][3];
		System.out.println("Enter elements in array");
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				 arr[i][j]=Utility2.integerInput();
			}
		}
		//display array elements
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				 System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int sum1=0,sum2=0,sum3=0,sum4=0,sum5=0,sum6=0,sum7=0,sum8=0;
		
		//addition of matrix row wise
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				if(i==0&&j==0 || i==1&&j==1 || i==2&&j==2)
				{
					sum7+=arr[i][j];
				}

				if(i==0&&j==2 || i==1&&j==1 || i==2&&j==0)
				{
				sum8+=arr[i][j];
				}
				
				
				if(i==0)
				{
					sum1+=arr[i][j];
				}
				if(i==1)
				{
					sum2+=arr[i][j];
				}
				if(i==2)
				{
					sum3+=arr[i][j];
				}
				
				
				
				if(j==0)
				{
					sum4+=arr[i][j];
				}
				if(j==1)
				{
					sum5+=arr[i][j];
				}
				if(j==2)
				{
					sum6+=arr[i][j];
				}
			}
		}
			
		
		
		
		System.out.println("row1    "+sum1);
		System.out.println("row2    "+sum2);
		System.out.println("row3    "+sum3);
		System.out.println("column1 "+sum4);
		System.out.println("column2 "+sum5);
		System.out.println("column3 "+sum6);
		System.out.println("digonal1 "+sum7);
		System.out.println("digonal2 "+sum8);
		
		
		int row_total=sum1+sum2+sum3;
		int column_total=sum4+sum5+sum6;
		
		if(row_total==column_total && sum7==sum8)
		{
			System.out.println("Magic square");
		}
		else
		{
			System.out.println("Not a Magic square");
		}
		
	}

}
