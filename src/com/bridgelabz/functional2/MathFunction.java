package com.bridgelabz.functional2;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.Utility2;

/******************************************************************************
 *  
 *  Purpose: Create MathFunction.java class and write following static methods
 *
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/

public class MathFunction {

	public static void main(String[] args) 
	{
		int number,choice;
		double  amount,rate_of_interest,period;
		 System.out.println("Press \n 1 for factorial \n 2 for prime number \n 3 Compound Interest \n 4 Original amount \n 5 Integer_array calculate minimum and maximum value ");
		 System.out.println("Enter Your choice ");
		 choice=Utility2.integerInput();
		
		
		 switch (choice)

		 {
		 case 1:
			 	System.out.println("Enter Number");
			 	number=Utility2.integerInput(); 
			 	Utility2.factorial(number);
			 	break;
		 
		 case 2:
			 	System.out.println("Enter Number");
			 	number=Utility2.integerInput(); 
			 	Utility2.prime(number);
			 	break;
		 case 3:
			 	System.out.println("Enter amount");
			 	amount=Utility2.doubleInput();
			 	System.out.println("Enter rate of interest");
			 	rate_of_interest=Utility2.doubleInput();
			 	System.out.println("Enter period");
			 	period=Utility2.doubleInput();
			 	
			 	Utility2.compound_interest(amount,rate_of_interest,period);
			 	break;
		 case 4:
			 	System.out.println("Enter compound interest amount");
			 	amount=Utility2.doubleInput();
			 	System.out.println("Enter rate of interest");
			 	rate_of_interest=Utility2.doubleInput();
			 	System.out.println("Enter period");
			 	period=Utility2.doubleInput();
			 	
			 	Utility2.current_value(amount,rate_of_interest,period);
			 	break;
		 case 5:
			 	int[] intergeArray= {2,8,7,6,1,9};
			 	for(int i=1;i<intergeArray.length;i++)
			 	{
			 	System.out.print(intergeArray[i]+" ");
			 	}
			 	int min=intergeArray[0];
			 	for(int i=1;i<intergeArray.length;i++)
			 	{
			 		if(min>intergeArray[i])
			 		{
			 			min=intergeArray[i];
			 		}	
			 	}
			 	System.out.println("\nMinimum value in array "+min);
			 	
			 	int max=intergeArray[0];
			 	for(int i=1;i<intergeArray.length;i++)
			 	{
			 		if(max<intergeArray[i])
			 		{
			 			max=intergeArray[i];
			 		}	
			 	}
			 	System.out.println("Minimum value in array "+max);
		 }//switch case end
	 }	
}
