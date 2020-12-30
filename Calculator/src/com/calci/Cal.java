package com.calci;

import java.util.Scanner;

public class Cal 
{
	public static void main(String[] args) 
	{
		System.out.println("**Calculator**");
		
		
		System.out.println("Option are....");
		System.out.println("1.Addition");
		System.out.println("2.Substration");
		System.out.println("3.Multiplication");
		System.out.println("4.division");
		
		System.out.println("Enter the number which Operation perform");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		if(no==1)
		{
			addition();
		}
		else if(no==2)
		{
			substration();
			
		}
		
		else if(no==3)
		{
			mul();
			
		}
		else if(no==4)
		{
			division();
		}
		}
		
		public static void addition()
		{
			int nof,nos;
			System.out.println("Addition");
			System.out.println("Enter the first number");
			Scanner no1=new Scanner(System.in);
			nof=no1.nextInt();
			System.out.println("Enter second number ");
			Scanner no2S=new Scanner(System.in);
			nos=no1.nextInt();
			System.out.println("Sum: " + nof + " + " + nos + " = " + (nof + nos));
		}
		public static void substration()
		{
			System.out.println("SUB Operation");
			System.out.println("ENter first number");
			Scanner no1=new Scanner(System.in);
			int nof=no1.nextInt();
			System.out.println("Enter the another number");
			Scanner no2=new Scanner(System.in);
			int nos=no2.nextInt();
			System.out.println("SUB:"+nof+"-"+nos+"="+(nof-nos));
		}
		
		public static void mul()
		{
			System.out.println("Multiplication Operation");
			System.out.println("Enter the number");
			Scanner no1=new Scanner(System.in);
			int nof=no1.nextInt();
			System.out.println("Enter another number");
			Scanner no2=new Scanner(System.in);
			int nos=no2.nextInt();
			System.out.println("Mul:"+nof+"*"+nos+"="+(nof*nos));
		}
		
		public static void division()
		{
			float nof,nos;
			System.out.println("Division Operation");
			System.out.println("Enter the number");
			Scanner no1=new Scanner(System.in);
			nof=no1.nextFloat();
			System.out.println("enter the another number");
			Scanner no2=new Scanner(System.in);
			nos=no2.nextFloat();
			System.out.println("DIV :"+nof+"/"+nos+"="+nof/nos);
		}
		
		
		
}
		
