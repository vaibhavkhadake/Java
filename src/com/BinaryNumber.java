package com;


import java.util.Scanner;

public class BinaryNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter how many elements");
		int number=sc.nextInt();
		int [] array= new int[number];
		int low=0,high=number-1;
		int mid = low+high/2;
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();		
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		System.out.println("\n enter element to search");
		int search=sc.nextInt();
		
			while(low<=high)
			{
				if(mid==search)
				{
					System.out.println("element found");
					break;
				}
				else if(mid<search)
				{
					low=mid+1;
				}
				else
				{
					high=mid-1;
					
				}
				mid = low+high/2;
			}
				if(low>high)
				{
					System.out.println("not found");
				}
			
		sc.close();
	}

}
