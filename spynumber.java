package com.oops9;
import java.util.Scanner;
public class spynumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number n:");
		int n=sc.nextInt();
		String res=checkspy(n);
		System.out.println(res);
		
		
	}
	public static String checkspy(int n)
	{
		String s="";
		if(checksum(n)==checkpro(n))
		{
			s=n+"is a spy number";
			
		}
		else
		{
			s=n+"is not a spy number";
		}
		return s;
	}
	public static int checksum(int n)
	{
		int sum=0;
		while(n>0)
		{
		int dig=n%10;
		sum=sum+dig;
		n=n/10;
		}
		return sum;
		 
	}
	public static int checkpro(int n)
	{
		int pro=1;
		while(n>0)
		{
		int dig=n%10;
		pro=pro*dig;
		n=n/10;
		}
		return pro;
		
	}

}
