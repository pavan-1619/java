package com.oops9;
import java.util.Scanner;
public class calsiii 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String res="";
		boolean b1=false;
		 do {
			System.out.println("enter the 1st num");
			int a=sc.nextInt();
			System.out.println("enter the 2nd num");
			int b=sc.nextInt();
			System.out.println("enter the operation ");
			System.out.println("select 1 for addition");
			System.out.println("select 2 for subtraction");
			System.out.println("select 3 for multiplication");
			System.out.println("select 4 for division");
			int option=sc.nextInt();
			switch(option)
			{
			case 1:
			{
				res=add(a,b);
				System.out.println(res);
				
			}break;
			case 2:
			{
				res=sub(a,b);
				System.out.println(res);
			}break;
			case 3:
			{
				res=mul(a,b);
				System.out.println(res);
				
 			}break;
			case 4:
			{
				res=div(a,b);
				System.out.println(res);
			}break;
			}
			System.out.println("to continue press 1 to exit 0");
			int n=sc.nextInt();
			if (n==0) 
			{
				b1=true;
				System.out.println("tata bye bye");
				
			}
	
			
			
		}
	   while(!b1);
	}
		public static String add(int a,int b)
		{
			int sum=a+b;
		String res="sum of"+a+"and"+b+"is:"+sum;
		return res;
		}
		public static String sub(int a,int b)
		{
			int sub=a-b;
		String res="sub of"+a+"and"+b+"is:"+sub;
		return res;
		}
		public static String mul(int a,int b)
		{
			int mul=a*b;
		String res="mul of"+a+"and"+b+"is:"+mul;
		return res;
		}
		public static String div(int a,int b)
		{
			int div=a/b;
		String res="div of"+a+"and"+b+"is:"+div;
		return res;
		}

		
		
	
}
