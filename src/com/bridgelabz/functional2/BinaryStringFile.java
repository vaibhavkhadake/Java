package com.bridgelabz.functional2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class BinaryStringFile
{

	public static void main(String[] args) throws IOException
	{
		File file = new File("/home/admin1/Desktop/Git_Rep/Java_Programs/binarystring.odt"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  while ((st = br.readLine()) != null) 
		    System.out.println(st); 

	}

}
