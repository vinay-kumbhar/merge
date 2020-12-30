package com.Braindata.servicesIMPl;

import java.util.Scanner;

import com.Braindata.model.Account;

public class SBI 
{
	Account ac=new Account();
	
	double dm;
	public void CreateAccount()
	{
		System.out.println("Enter your name");
		Scanner sc=new Scanner(System.in);
		String nm=sc.next();
		ac.setName(nm);
		
		System.out.println("Enter your mobile number");
		String mn=sc.next();
		ac.setMno(mn);
		
		System.out.println("Set Account Number ");
		String at=sc.next();
		ac.setAccno(at);
		
		System.out.println("gender:");
		String  gd=sc.next();
		if(gd.equals(ac.getGender()))
		{
		ac.setGender(gd);
		}
		System.out.println("adhno");
		String  an=sc.next();
		ac.setAdhno(an);
		
		
		System.out.println("Bal");
		Double ba=sc.nextDouble();
		if(ba>=500) 
		{
		ac.setBalance(ba);
		}
		else
		{
			System.out.println("Balance must be greater than 500");
		}
		}
		
		
	
	public void DisplayAllDetail()
	{
		System.out.println(ac.getName());
		System.out.println(ac.getMno());
		System.out.println(ac.getAccno());
		System.out.println(ac.getGender());
		System.out.println(ac.getAdhno());
		System.out.println(ac.getBalance());
	}
	
	public void DisplayBalance()
	{
	
		System.out.println(ac.getBalance());
	}
	
	
	
		public void DepositeMoney()
	{
		System.out.println("Enter amount to deposite");
		Scanner sc1=new Scanner(System.in);
		double dm=sc1.nextDouble();
	
		double depmoney=dm+ac.getBalance();
		System.out.println("Your Balance is = "+depmoney);
		ac.setBalance(depmoney);
	}
		
		

	public void withdraw()
	{
		while(true)
		{
		System.out.println("Enter Amount ");
		Scanner sc2=new Scanner(System.in);
		double wm=sc2.nextDouble();
		
		double wmoney=ac.getBalance()-wm;
		if(wmoney<500) 
		{
			System.out.println("low balance");
			
		}
		else
		{
		System.out.println("Your Remaining Balance is="+wmoney);
		ac.setBalance(wmoney);
		break;
		}
		}
		
	}

}
