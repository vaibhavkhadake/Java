package com;

public class ReverseString {

	public static void main(String[] args) 
	{
		String  st= "Vaibhav,amit,sunil,akash";
		String temp="";
		
		String[] arr=st.split(" ,");
		
		for(int i=arr.length;i>=0;i++)
		{
			temp=temp+st.charAt(i);
			
		}
		
		System.out.println(temp);
	}

}
