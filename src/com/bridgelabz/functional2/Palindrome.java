package com.bridgelabz.functional2;
/******************************************************************************
 *  
 *  Purpose: String function calculate string is Palindrome or not.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   06-08-2019
 *
 ******************************************************************************/
import com.bridgelabz.utility.Utility2;

public class Palindrome {

	public static void main(String[] args)
	{
		String string1;
		System.out.println("Enter String");
		string1=Utility2.stringInput();
		Utility2.palindrome(string1);
	}

}
