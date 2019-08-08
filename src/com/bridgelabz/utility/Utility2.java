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
	/**
	 * 
	 * @param string1
	 * @return
	 */
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
	/**
	 * 
	 * @param day
	 * @param month
	 * @param year
	 */
	public static void dayOfWeek(int day, int month, int year) 
	{
		/*input taken from command line DD/MM/YYYY format
		*month = 0 for january ,1 for feb...... 
		*day= 0 sunday,1 for monday .......
		**/
		int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int date = (day + x + (31*m)/12) % 7;
        
       if(date==0)
       {
    	   System.out.println("Day is Sunday");
    	   
       }
       else if(date==1)
       {
    	   System.out.println("Day is Monday");
    	   
       }
       else if(date==2)
       {
    	   System.out.println("Day is Tuesday");
    	   
       }
       else if(date==3)
       {
    	   System.out.println("Day is Wednesday");
    	   
       }
       else if(date==4)
       {
    	   System.out.println("Day is Thirsday");
    	   
       }
       else if(date==5)
       {
    	   System.out.println("Day is Friday");
    	   
       }
       else if(date==6)
       {
    	   System.out.println("Day is Saturday");
    	   
       }
		
		
	}
	/**
	 * 
	 * @param month
	 * @param year
	 */
	public static void calender(int[] month, int[] year)
	{
		
		
		
	}
	/**
	 * 
	 * @param number
	 * @return
	 */
	public static long factorial(int number)
	{
		int fact=1;
		if(number>0)
		{
			for(int i=1;i<=number;i++)
			{
				fact=fact*i;
			}
			System.out.println(fact);
		}
		return 0;
	}
	/**
	 * 
	 * @param number
	 * @return
	 */
	public static int prime(int number)
	{
		 boolean flag=true;
		 if(number>1)
		 {
		 for(int i=2;i<=number/2;i++)
		 {
			 if(number%i==0)
			 {
				 flag=false;
				 break;
			 }
			 else
			 {
				 flag=true;
			 }
		 }
			 
		 }
		 if(flag==true)
		 {
			 System.out.println("Prime"); 
		 }
		else
		{
			System.out.println("Not a Prime number");
		}
		return 0;
		
		
	}
	/**
	 * 
	 * @param amount
	 * @param rate_of_interest
	 * @param period
	 */
	public static double compound_interest(double amount, double rate_of_interest, double period) 
	{
		double total=amount*Math.pow((1+rate_of_interest/100),period);
		System.out.println("total amount "+total);
		return total;
		
	}
	/**
	 * 
	 * @param amount = Compound interest value.
	 * @param rate_of_interest
	 * @param period
	 */
	public static void current_value(double amount, double rate_of_interest, double period)
	{
		double initialValue=amount/Math.pow((1+rate_of_interest/100),period);
		System.out.println("total amount "+initialValue);
		
		
	}
	
	
}
