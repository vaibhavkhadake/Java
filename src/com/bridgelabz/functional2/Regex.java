package com.bridgelabz.functional2;
/******************************************************************************
 *  
 *  Purpose: Use replaceAll function.
 *
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   12-08-2019
 *
 ******************************************************************************/

import com.bridgelabz.utility.Utility2;
public class Regex {

	public static void main(String[] args)
	{
		System.out.println("Enter animal name");
		String animal=Utility2.stringInput();
		System.out.println("Enter animal sound");
		String sound=Utility2.stringInput();
		
		String poem=
				"Old MacDonald had a farm,\n" + 
						"E­I­E­I­O.\n" + 
						"a\n" + 
						"And on his farm he had some %ANIMAL%,\n" + 
						"E­I­E­I­O.\n" + 
						"a\n" + 
						"With a %SOUND%, %SOUND% here,\n" + 
						"And a %SOUND%, %SOUND% there,\n" + 
						"Here a %SOUND%, there a %SOUND%,\n" + 
						"Everywhere a %SOUND%, %SOUND%,";
		
		String s=Utility2.regex(animal,sound,poem);
		System.out.println(s);
		
	}

}
