package com;

public class Prime {

	public static void main(String[] args) {
		int number=1000;
		int sum=0;
		int num=0;
		for(int i=2;i<=10;i++)
		{
			int count=0;
			for(num=i-1;num>=2;num--)
			{
				if(i%num==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				sum=sum+i;
			}
			System.out.println(sum);
		}
		
		

}
}