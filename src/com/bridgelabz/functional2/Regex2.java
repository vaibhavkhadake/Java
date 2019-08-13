package com.bridgelabz.functional2;

import java.util.regex.*;

public class Regex2 {

	public static void main(String[] args) {
		String st="Hello name, We have your full name\n" + 
				"as <<full name>> in our system. your contact number is 91­xxxxxxxxxx. Please,let us\n" + 
				"know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		
		Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		
		String mobile_Number= "919503359498";
		Matcher m = p.matcher(mobile_Number);
		
		System.out.println(m);
		String s1=st.replace("name","Vaibhav");
		
		String s2=st.replace("full name","Vaibhav khadake");
		String s3=st.replace("91­xxxxxxxxxx", "919503359498");
		
	//	System.out.println(s1);
	//	System.out.println(s2);

	}

}
