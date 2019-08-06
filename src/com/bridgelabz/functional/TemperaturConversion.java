package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class TemperaturConversion {

	public static void main(String[] args)
	{
		Utility utility=new Utility();
		System.out.println("Enter the temperature in fahrenheit=");
		double Fahrenheit=Utility.doubleInput();
		
		System.out.println("Enter the temperature in Celsius=");
		double Celsius=Utility.doubleInput();
		
		utility.temperature(Fahrenheit,Celsius);
	}

}
