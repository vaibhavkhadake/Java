package com.bridgelabz.functional2;
import com.bridgelabz.utility.Utility2;
/******************************************************************************
 *  
 *  Purpose: String function calculate string is anagram or not.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   06-08-2019
 *
 ******************************************************************************/
public class StringFunction {

	public static void main(String[] args)
	{
		String string1,string2;
		  
		System.out.println("Enter string 1");
		string1=Utility2.stringInput();
		System.out.println("Enter string 2");
		string2=Utility2.stringInput();
		
		Utility2.anagram(string1,string2);
		
		

	}

}
