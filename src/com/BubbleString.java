package com;

public class BubbleString {

	public static void main(String[] args) 
	{
		String[] s= {"vaibhav","abc","jj","kk"};
		String temp;
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[j].compareTo(s[i])<0)
				{
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
				
			}
			System.out.print(s[i]+" ");
		}

	}

}
