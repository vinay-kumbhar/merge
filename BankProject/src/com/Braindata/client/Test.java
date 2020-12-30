package com.Braindata.client;

import java.util.Scanner;

import com.Braindata.servicesIMPl.SBI;

public class Test 
{
	
	public static void main(String[] args) 
	{
		SBI bb=new SBI();
		while(true)
		{
		System.out.println("Enter number");
		System.out.println("1.Create acc");
		System.out.println("2.Details");
		System.out.println("3.Display Balance");
		System.out.println("4.Deposite Money");
		System.out.println("5.withdraw");
		
		Scanner sc=new Scanner(System.in);
		int ip=sc.nextInt();
		
		switch (ip) 
		{
		case 1:
			
			bb.CreateAccount();
			
			break;
		case 2:
			bb.DisplayAllDetail();
			break;
		
			
		case 3:
			bb.DisplayBalance();
			break;
			
		case 4:
			bb.DepositeMoney();
			break;
			
			
		case 5:
			bb.withdraw();
			break;

		default:
			break;
		}
	}
	}

}
