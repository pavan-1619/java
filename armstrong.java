package com.oops9;
import java.util.Scanner;
public class armstrong {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number n:");
		int n=sc.nextInt();
		
		String res=checkarm(n);
		System.out.println(res);
		
		
	}
	public static String checkarm(int n)
	{
		String s="";
		if(checksum(n)==n)
		{
			s=n+"is a armstrong number";
		}
		else
		{
			s=n+"is not a armstrong number";
		}
		return s;
	}
	public static int checksum(int n)
	{ 
		int n1=n;
		int count=0;
	    int sum=0;
		while(n>0)
		{
			int dig=n%10;
			count++;
			n=n/10;
		}
		while(n1>0)
		{
			int pro=1;
			int dig=n1%10;
			for(int i=1;i<=count;i++)
			{
				pro=pro*dig;
			}
			n1=n1/10;sum=sum+pro;
		}
		return sum;
	}

}
