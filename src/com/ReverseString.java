package com;

public class ReverseString {

	public static void main(String[] args) 
	{
		String  st= "Vaibhav,amit,sunil,akash";
		String temp="";
		
		String[] arr=st.split(",");
		
		for(int i=0;i<arr.length;i++)
		{
			char a[]=arr[i].toCharArray();
			for(int j=a.length-1;j>=0;j--)
			{
			temp=temp+a[j];
			}
			temp=temp+" ";
		}
		
		System.out.println(temp);
	}

}
