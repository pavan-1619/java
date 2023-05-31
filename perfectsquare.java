package com.oops9;
import java.util.Scanner;
public class perfectsquare 
{
  public static void main(String[] args) 
  {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the number n:");
	  int n=sc.nextInt();
	  String res=checkperfectsq(n);
	  System.out.println(res);
	  
	}
  public static String checkperfectsq(int n)
  {
	   String s="";
	  if(checksq(n))
	  {
		  s=n+"is a perfect sq";
		  
	  }
	  
	  else
	  {
		  s=n+"is not a perfect sq";
	  }
	  return s;
      }
  public static boolean checksq(int n)
  {
	  boolean b=false;
	  for(int i=1;i<=n;i++)
	  {
	  if(i*i==n)
	  {
		  b=true;
	  }
	  }
	  
	  return b;
  }
}
