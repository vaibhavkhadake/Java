package com.bridgelabz.utility;
import java.util.Arrays;
/******************************************************************************
 *  
 *  Purpose: It is a utility class where we written all progams logic.
 *
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   06-08-2019
 *
 ******************************************************************************/
import java.util.Scanner;

public class Utility2 
{
	
	/**
	 * Taking values from user
	 */
	static Scanner scanner =  new Scanner(System.in);
	/**
	 * 
	 * @return integer value
	 */
	public static int integerInput()
	{
		int integerValue = scanner.nextInt();
		return integerValue;
	}
	/**
	 * @return double value
	 */
	public static double doubleInput()
	{
		double doubleValue= scanner.nextDouble();
		return doubleValue;
	}
	/**
	 * 
	 * @return stringvalue
	 */
	public static String stringInput() 
	{
		String stringValue=scanner.nextLine();
		return stringValue;
		
	}
	/**
	 * 
	 * @param string1
	 * @param string2
	 */
	public static boolean anagram(String string1, String string2) 
	{
				// convert string to character
				char[] ch1=string1.toCharArray(); 
				char[] ch2=string2.toCharArray(); 
				boolean anagram = true;  
				//sort the elements 
				Arrays.sort(ch1);
				Arrays.sort(ch2);
				
				//compare elements
				anagram=Arrays.equals(ch1, ch2); 
				
				if(anagram)
				{
					System.out.println("String is anagrams");
				}
				else
				{
					System.out.println("String is not anagrams");
				}
				return anagram;
				
		
	}
	public static boolean palindrome(String string1)
	{
		int temp=string1.length();
		String string2="";
		
		for(int i=temp-1;i>=0;i--)
		{
			string2=string2+string1.charAt(i);
		}
		if(string1.equalsIgnoreCase(string2))
		
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		
		return false;
		
		
	}

}
