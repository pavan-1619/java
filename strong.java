package com.oops9;
import java.util.Scanner;
public class strong 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		String res=checkstrong(n);
		System.out.println(res);
		
	}
	public static String checkstrong(int n)
	{
		String s="";
		if(checkf(n)==n)
		{
			s=n+"is a strong number";
		}
		else
		{
			s=n+"is not a strong number";
		}
		return s;
	}
	public static int checkf(int n)
	{
		 int sum=0;
		
		while(n>0)
		{
			int pro=1;
			int dig=n%10;
			for(int i=1;i<=dig;i++)
			{
				pro=pro*i;
			}
			n=n/10;sum=sum+pro;
		}
		return sum;
	}

}
