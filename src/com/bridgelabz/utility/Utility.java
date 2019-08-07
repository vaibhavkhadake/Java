/******************************************************************************
 *  
 *  Purpose: It is a utility class where we written all progams logic.
 *
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility {
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
	 * In  threeNames() method we reverse the names.
	 * @param firstPerson
	 * @param secondPerson
	 * @param thirdPerson
	 */
	public static void threeNames(String firstPerson,String secondPerson, String thirdPerson)
	{
		System.out.println("Hi "+thirdPerson+" "+secondPerson+" and "+firstPerson);
	}
	/** In  leapYear() method we check year is leap year or not a leap year.
	 * @param year
	 * @return
	 */
	public static int leapYear(int year)
	{
		if(year>=1582)
		{
			if(year%400==0)
			{
				System.out.println("Leap year");	
				
			}
			else if(year%100==0)
			{
				System.out.println("Not a Leap year");
			}
			else if(year%4==0)
			{
				System.out.println("Leap year");
			}
			else
			{
				System.out.println("Not a Leap year");
			}
			
		}
		else
		{
			System.out.println("Plese enter valid year");
		}
		return year;
		}
	/**
	 * Perform following intger operations
	 * @param a
	 * @param b
	 * @param c
	 */
	public static void integerOperations(int a,int b,int c)
	{
		System.out.println("a + b *c ="+(a + b *c));
		System.out.println("a * b + c="+(a * b + c));
		System.out.println("c + a / b="+(c + a / b));
		System.out.println("a % b + c="+(a % b + c));	
	}
	/**
	 * Perform following operation using Double operations
	 * @param a
	 * @param b
	 * @param c
	 */
	public void doubleOperations(double a, double b, double c) 
	{
		System.out.println("a + b *c ="+(a + b *c));
		System.out.println("a * b + c="+(a * b + c));
		System.out.println("c + a / b="+(c + a / b));
		System.out.println("a % b + c="+(a % b + c));	
	}
	/**
	 *  calculate  month and day betweem given range
	 * @param month
	 * @param day
	 */
	 public void monthDay(int month ,int day)
	 {
		 if(month==3 && day>=20 && day<=31) 
			{
				System.out.println("True");
			}
			else if((month==4 && day>=1 && day<=30) )
			{
				System.out.println("True");
				
			}
			else if((month==5 && day>=1 && day<=31) )
			{
			
				System.out.println("True");
			}
			else if((month==6 && day>=1 && day<=20) )
				
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
	 } 
	 /**
	  *  calculate  Quadratic equation
	  * @param a
	  * @param b
	  * @param c
	  */
	 public void quadratic(double a,double b,double c)
	 { 
		 double delta=b*b-4*a*c;
		 System.out.println("Delta ="+delta); 
		 double root1,root2;
		 if(delta>0)
		 {
		  root1=(-b+ Math.sqrt(delta))/(2*a);
		  System.out.println("Root 1 ="+root1);
		  
		  root2=(-b- Math.sqrt(delta))/(2*a);
		  System.out.println("Root 2 ="+root2);;
		 }
		 else if(delta==0)
		 {
			 root1=-b/(2*a);
			 System.out.println("Root 1 ="+root1);
			
			 root2=-b/(2*a);
			 System.out.println("Root 2 ="+root2);;
		 }
		 // if delta<0 
		 else
		 {
			 double realPart = -b / (2 *a);
	         double imaginaryPart = Math.sqrt(-delta) / (2 * a);
	         
	         System.out.println("realPart="+realPart+"\n ImaginaryPart"+imaginaryPart);   
		 }
		 
	 }
	 /**
	  * calculate Sum of two dice. it take random values.
	  * @param dice1
	  * @param dice2
	  */
	public void sumOfTwodice(int dice1, int dice2) {
		
		int sum=dice1+dice2;
		System.out.println("Sum of Dice is="+sum);
	}
	/**
	 * calculate distance using math.power() function 
	 * @param x
	 * @param y
	 */
	public void distance(int x, int y) {
		
		int distance=(int)Math.sqrt(Math.pow(x,x)+Math.pow(y,y));
		
		System.out.println("Distance = "+distance);
		
		
	}
/**
	 * Calculate minimum value,maximum value,average using math() function 
	 * @param value1
	 * @param value2
	 * @param value3
	 * @param value4
	 * @param value5
	 */
	public void random(double value1, double value2, double value3, double value4, double value5) {
		// TODO Auto-generated method stub
		
		double minimum=(Math.min(value1,Math.min(value2,Math.min(value3,Math.min(value4, value5)) )));
		double maximum=(Math.max(value1,Math.max(value2,Math.max(value3,Math.max(value4, value5)) )));
		double average=value1+value2+value3+value4+value5/5;
		
		System.out.println("Minimum Value="+minimum);
		System.out.println("Maximum Value="+maximum);
		System.out.println("Average Value="+average);
	}
/**
 * calculate windchill 
 * @param temperature
 * @param wind_speed
 */
	public void windchil(double temperature, double wind_speed)
	{
		System.out.println("Temperature"+temperature);
		System.out.println("Wind speed"+wind_speed);
		double wind_chill = 35.74 + 0.6215*temperature + (0.4275*temperature - 35.75) * Math.pow(wind_speed, 0.16);
		System.out.println("Wind_Chill"+wind_chill);
	}
	/**
	 * Calculate Date take input from command prompt. 
	 * @param day
	 * @param month
	 * @param year
	 */
	public void dayWeek(int day, int month, int year) {
		
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
 * Convert Celsius to Fahrenheit and Fahrenheit to Celsius.
 * @param fahrenheit
 * @param celsius
 */
	public void temperature(double fahrenheit, double celsius) {
		
		//calculate Fahrenheit to Celsius
		celsius = (fahrenheit- 32)*(5/9);
		System.out.println("Celsius  "+celsius);
		
		//calculate  Celsius to Fahrenheit 
		fahrenheit = (celsius*9/5)  + 32;
		System.out.println("Fahrenheit "+fahrenheit);
	}
	/**
	 * 
	 * @param principal
	 * @param rate_of_interest
	 * @param period
	 */
public static void loan(double principal, double rate_of_interest, double period)
	{
	double payment =principal * (Math.pow((1 + rate_of_interest / 100),period)); 
	System.out.println(payment);
	}
/**
 * 
 * @param radian
 */
	public static void convert(double radian)
	{
		double sin=Math.sin(radian);
		System.out.println("Converting radiun to sin "+sin);
		double cos=Math.cos(radian);
		System.out.println("Converting radiun to cos "+cos);
		
	}
	/**
	 * 
	 * @param coin
	 */
		public static void coin(int coin) 
	{	
			int head=0,tail=0;
			for(int i=1;i<=coin;i++)
			{
				if(Math.random()<0.5)
				{
					head++;
				}		
				else
				{
					tail++;
				}

			}
			System.out.println("Head="+head);
			System.out.println("tail="+tail);
			
			//calculate percentage
			double headPercentage=(head*100)/coin;
			double tailPercentage=(tail*100)/coin;
			System.out.println("headPercentage= "+headPercentage);
			System.out.println("tailPercentage= "+tailPercentage);
		}
/**
 * 
 * @param number
 */
	public static void power(int number) 
	{
		for(int i=1;i<=number;i++)
		{
		int power=(int)Math.pow(i, 2);
		System.out.println(power);
		}
		
	}
	/**
	 * 
	 * @param number
	 */
	public static void harmonic(int number)
	{
		double harmonicNumber=1;
		for(double i=2;i<=number;i++)
		{
			harmonicNumber=harmonicNumber+(1/i);
			
		}
	
	System.out.println("Sum of harmonic series "+harmonicNumber);
	}
	/**
	 * 
	 * @param cnumber
	 */
	public static void newtonSqrt(double cnumber)
	{
		double epsilon = 1.0e-15; 
		double tnumber=cnumber;

		double a=tnumber-(cnumber/tnumber);
		double b=epsilon*tnumber;
		System.out.println(a+"  "+b);
		while(Math.abs(a)>(b))
		{
			//for average
			tnumber=(cnumber/tnumber)+tnumber/2.0;
			break;
		}
		System.out.println("Square root of cnumber by using newtons method "+tnumber);	
	}
	/**
	 * 
	 * @param stake
	 * @param goal
	 * @param trails
	 */
	public static void gamling(double stake, double goal, double trails) 
	{
		int bets=0,wins=0;
		for(int i=0;i<trails;i++)
		{
		double cash=stake;
			while(cash>0 && cash<goal)
			{
				bets++;
				if(Math.random()<0.5)
				{
					// win #1
					cash++;
				}
				else
				{
					//for loss $1
					cash--;
				}
				if (cash == goal)
					{
					wins++;
					}
			}//while loop end
		}//for loop end
		System.out.println("Numbers of win= "+wins+" out of "+trails);
		System.out.println("Percentage of win ratio= "+wins*100/trails);
		System.out.println("average of bets= "+(1*bets/trails));
		}
	
	/**
	 * /*
		 *
	 * 
	 * @param range
	 */
	public static void prime(int range) 
	{
		
		int flag=0;
		for(int r=2;r<range;r++)
		{
			for(int i=2;i<r;i++)	
			{
				if(r%i==0)
					{
					flag=1;
					break;
					}
				else
					{
					flag=0;
					}
			} 
			if(flag==0)
			{
			System.out.println("Prime number "+r);
			}	
		}// range loop end
		
	}
	/**
	 * 
	 * @param decimalNumber
	 */
	public static void decimalToBinry(int decimalNumber) 
	{
		int mod;
		String binary=" ";
		while(decimalNumber>0)
		{
			mod=decimalNumber%2;
			binary=binary+""+mod;
			decimalNumber=decimalNumber/2;	
		}
		System.out.println("Binary Number is"+binary);	
	}
	/**
	 * Swaping nibbles and get new decimal number and check number is power of 2 or not.
	 * @param decimalNumber
	 */
	public static void swapNibble(int decimalNumber)
	{
		int swap;
		//The expression “x & 0x0F” gives us last 4 bits of x.
		//The expression “x & 0xF0” gives us first four bits of x.
		
		swap=((decimalNumber&0x0F)<<4|(decimalNumber&0xF0) >> 4);
		System.out.println("Swaping nibbles and new decimal number="+swap);	
		
		if(swap%2!=0)
		{
			System.out.println("Number is not a power of 2 ");
		}
		else
		{
			for(int i=0;i<=swap;i++)
			{
				if((Math.pow(2, i))==swap)
				{
					System.out.println("Number is a power of 2 ");
					break;
				}
				
			}//for loop end
		}//else loop
	}
	
	/**
	 * @param number
	 */
	public static void countDice(int number) 
	{
		int dice;
		int arr[]=new int[20];
		int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0;
		
		for(int i=0;i<number;i++)
			
		{
		dice=(int)(Math.random()*6)+1;
		arr[i]=dice;
			 
			 if(arr[i]==1)
			 {
			 System.out.print(":" + arr[i]);
			 count1++;
			 }else if(arr[i]==2)
			 {
				 System.out.print(":" + arr[i]);
				 count2++;
			 }
			 else if(arr[i]==3)
			 {
				 System.out.print(":" + arr[i]);
				 count3++;
			 }
			 else if(arr[i]==4)
			 {
				 System.out.print(":" + arr[i]);
				 count4++;
			 }
			 else if(arr[i]==5)
			 {
				 System.out.print(":" + arr[i]);
				 count5++;
			 }
			 else if(arr[i]==6)
			 {
				 System.out.print(":" + arr[i]);
				 count6++;
			 }
				 
		 }
		int g=Math.max(count1,Math.max(count2,Math.max(count3,Math.max(count4,Math.max(count5, count6)))));
		
		if(g==count1)
		{
			System.out.println("\n1 fall maximum number of times.");
		}
		else if(g==count2)
		{
			System.out.println("\n2 fall maximum number of times.");
		}
		else if(g==count3)
		{
			System.out.println("\n3 fall maximum number of times.");
		}
		else if(g==count4)
		{
			System.out.println("\n4 fall maximum number of times.");
		}
		else if(g==count5)
		{
			System.out.println("\n5 fall maximum number of times.");
		}
		else if(g==count6)
		{
			System.out.println("\n6 fall maximum number of times.");
		}
		
		
	
	}
	/**
	 * 
	 * @param number
	 */
	public static void sin(double number) 
	{
		
		// Convert number into  angle
		number= number % (2 * Math.PI);
		
		double term=1,sum=0;
		double fact=1;
		sum=number-sum;
		
		 for (double i = 3; term != 0.0; i+=2) 
		 {
			 for(double j=1;j<=i;j++)
			 {
				 fact=fact*j;
				 term=Math.pow(number, i)/fact;
			 }
	         if (i % 4 == 1) 
	        	 {
	        	 sum += term;
	        	 }
	         else if (i % 4 == 3)
	        	 {
	        	 sum -= term;
	        	 }
		 }
		System.out.println(sum);
		
		}
	/**
	 * 
	 * @param number
	 */
	public static void cos(double number) 
	{
		// Convert number into  angle
				number= number % (2 * Math.PI);
				
				double term=1,sum=0;
				double fact=1;
				sum=number-sum;
				
				 for (double i = 2; i <=20; i+=2) 
				 {
					 for(double j=1;j<=i;j++)
					 {
						 fact=fact*j;
						 term=Math.pow(number, i)/fact;
					 }
			         if (i % 4 == 0) 
			        	 {
			        	 sum += term;
			        	 }
			         else if (i % 4 == 2)
			        	 {
			        	 sum -= term;
			        	 }
				 }
				System.out.println(sum);
		}
	/**
	 * find second lowest number in given array
	 * @param array
	 */
	public static void second_lowest_number(int[] array)
	{
		int firstnumber,secondNumber;
		
		firstnumber=secondNumber=Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++)
		{
			
			if(array[i]<firstnumber)
			{
				secondNumber=firstnumber;
				firstnumber=array[i];
			}
			else if(array[i]<secondNumber && array[i]!=firstnumber)
			{
				secondNumber=array[i];
			}
		}
		System.out.println("\n Second smallest element is "+secondNumber);
		
	}
	/**
	 * find second highest number in given array
	 * @param array
	 */
	public static void second_highest_number(int[] array)
	{
		int firstnumber,secondNumber;
		
		firstnumber=secondNumber=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>firstnumber)
			{
				secondNumber=firstnumber;
				firstnumber=array[i];
			}
			else if(array[i]>secondNumber && array[i]!=firstnumber)
			{
				secondNumber=array[i];
			}
		}
		System.out.println("\n Second highest element is "+secondNumber);

	}
	/**
	 * Calculate prime number factorization.
	 * @param number
	 */
	public static void prime_fact(int number)
	{
		
		for(int i = 2; i*i<= number; i++)
		{
	         while(number%i == 0) 
	         {
	            System.out.print(i+" * ");
	            number = number/i;
	         }
	     }
	      if(number >2) 
	      {
	         System.out.println(number);
	      }
	}
	
	

}
