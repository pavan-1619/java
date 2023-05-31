package com.oops9;
import java.util.Iterator;
import java.util.Scanner;
public class prime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number n:");
		int n=sc.nextInt();
		String res=checkprime(n);
		System.out.println(res);
		
		
	}
	public static String checkprime(int n)
	{
		String s="";
		if (checkf(n)==2) 
		{
			s=n+"is prime";
			
			
		}
		else
		{
			s=n+"is not a prime";
		}
		return s;
	
	}
	public static int checkf(int n)
	{
	    int count=0;
	    for(int i=1;i<=n;i++)
	    {
	    	if(n%i==0)
	    	{
	    		count++;
	    		
	    	}
	    	
	    }
	    return count;
	}

}
