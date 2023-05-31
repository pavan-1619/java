package com.oops9;
import java.util.Scanner;
public class perfect 
{
	public static String checkperfect(int n)
	{
		String s="";
		if(checkf(n)==n)
		{
			s=n+"is a perfect";
		}
		else
		{
			s=n+"is not a perfect number";
		}
		return s;
	}
	public static int checkf(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number n");
		int n=sc.nextInt();
		String res=checkperfect(n);
		System.out.println(res);
		
		
	}

}
