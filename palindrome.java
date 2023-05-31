package com.oops9;
import java.util.Scanner;
public class palindrome 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
       System.out.println("enter the number n:");
         int n=sc.nextInt();
        String res=checkrev(n);
        System.out.println(res);
	}
	public static String checkrev(int n)
	{
		String s="";
		if(reverse(n)==n)
		{
			s=n+"is a palindrome";
			
		}
		else
		{
		s=n+"is not a palindrome";
		}
		return s;
	}
	public static int reverse(int n )
	{
		int rev=0;
		while(n>0)
		{
			int dig=n%10;
			rev=(rev*10)+dig;
			n=n/10;
		}
		return rev;
	}



}
