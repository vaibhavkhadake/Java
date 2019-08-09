package com;

import java.util.Scanner;

import com.bridgelabz.utility.Utility2;

public class Demo4 {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		int number=Utility2.integerInput();
		int rem,total=0;
		int temp=number;
		while(number>0)
		{
			
			rem=number%10;
			number=number/10;
			total=total+(rem*rem*rem);
		}
			System.out.println(total);	
			if(temp==total)
				System.out.println("a");
			else 
				System.out.println("n");
	}

}
