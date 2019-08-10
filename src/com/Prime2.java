package com;

public class Prime2 {

	public static void main(String[] args)
	{
		int flag=0;int sum=0;
		for(int r=2;r<10;r++)
		{
			for(int i=2;i<r;i++)	
			{
				if(r%i==0)
					{
					flag=1;
					break;
					}
				else
					{
					sum=sum+i;
					flag=0;
					}
			} 
			if(flag==0)
			{
			System.out.println("Prime number "+sum);
			}	
		}// range loop 
		System.out.println("Prime number "+sum);
	}

}
