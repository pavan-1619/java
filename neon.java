package com.oops9;
import java.util.Scanner;
public class neon 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number n:");
		int n=sc.nextInt();
		int m=n*n;
		 
		String res=checkneon(n,m);
		System.out.println(res);
		
	}
	public static String checkneon(int n,int m)
	{
		String s="";
		if(checksum(m)==n)
		{
			s=n+"is a neon number";
		}
		else
		{
			s=n+"is not a neon number";
		}
		return s;
	}
	public static int checksum(int m)
	{
		int sum=0;
		
		while(m>0)
		{
			int dig=m%10;
			sum=sum+dig;
			m=m/10;
			
		}
		return sum;
	}

}
