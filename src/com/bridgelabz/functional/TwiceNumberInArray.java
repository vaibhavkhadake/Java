package com.bridgelabz.functional;
/******************************************************************************
 *  
 *  Purpose:an array with 100 integers containing 1 to 100 and among them one number is
			repeated twice.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   05-08-2019
 *
 ******************************************************************************/
public class TwiceNumberInArray {

	public static void main(String[] args) 
	{
		
		int array[]=new int[100];
		
		int i,j;
		
		//print 1 to 100 element
		for(i=0;i<array.length;i++)
		{
			array[i]=i;
		}
		//we re-insert element in array  
		array[40]=25;
		for(i=0;i<array.length;i++)
		{
			for(j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					System.out.println("Number is repeted "+array[i]);
				}
			}
			
		}
		
		
		
		
	}

}
