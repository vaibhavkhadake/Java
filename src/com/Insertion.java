package com;

public class Insertion {

	public static void main(String[] args) {
		
		int[] number= {5,6,1,2,3,7,8,9};
		
		for (int j=1;j<number.length;j++)
		{
			
			int key=number[j];
			int i=j-1;
			
			while((i>=0)&&(number[i]>key))
			{
				number[i+1]=number[i];
				i--;
			}
			number[i+1]=key;
		}
			for(int i:number)
			{
				System.out.print(i);
			}
	}

}
