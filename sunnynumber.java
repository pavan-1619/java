package com.oops9;
import java.util.Scanner;
public class sunnynumber 
{
  public static void main(String[] args) 
  {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the number n:");
	  int n=sc.nextInt();
	  String res=checksunny(n);
	  System.out.println(res);
	  
	}
  public static String checksunny(int n)
  {
	   String s="";
	  if(checksq(n))
	  {
		  s=n+"is a sunny number";
		  
	  }
	  
	  else
	  {
		  s=n+"is not a sunny number";
	  }
	  return s;
      }
  public static boolean checksq(int n)
  {
	  boolean b=false;
	  for(int i=1;i<=n;i++)
	  {
	  if((i*i)-1==n)
	  {
		  b=true;
	  }
	  }
	  
	  return b;
  }
}
