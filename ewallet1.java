package com.oops9;
import java.util.Scanner;
public class ewallet1 {

	

	
	static int bal=2000;
   
	public static void main(String[] args) 
{
		
		int pwd=8844;
		Scanner sc=new Scanner(System.in);
		boolean b=false;
		System.out.println("enter the password");
		while(!b)
		{
			
			int pwd1=sc.nextInt();
			if(pwd1==pwd)
			{
				b=true;
				mainmenu();
			}
			else
			{
				System.out.println("press 1 to re-enter the password");
				System.out.println("press 2 to exit");
				int input=sc.nextInt();
				switch(input)
				{
				case 1:
				{
					System.out.println("enter the correct password");
					b=false;
					
					
				}break;
				case 2:
				{
					System.out.println("tq");
					b=true;
				}
				}
			}
			
		}
		
		
		
	}
	public static void shopping() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("shopping");
		System.out.println("enter 1 for watch");
		System.out.println("enter 2 for shoes");
		System.out.println("enter 3 for bags");
		int option=sc.nextInt();
		switch(option)
		{
		case 1:
		{
			watch();
		}break;
		case 2:
		{
			shoes();
		}break;
		case 3:
		{
			bags();
		}break;
		}
	}
	public static void addmoney() 
	{
		
		 boolean h=false;
		   while(!h)
			{
            System.out.println("<<<<<<<<<<<<<<<<ADD BALANCE>>>>>>>>>>>>>>>>>");
      System.out.println("10% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000 T0 999999");
   System.out.println("2.5% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000000");



	System.out.println("ENTER THE BALANCE TO BE ADDED");
	Scanner sc=new Scanner(System.in);
	int bal1=sc.nextInt();
		 if (bal1>=1000&&bal1<=999999)
		 {
			 bal=(bal+bal1-(bal1*10/100));
			 System.out.println("UPDATED BALANCE IS: "+bal);
			  boolean b5=false;
		 while (!b5)
		 {
			 System.out.println("PRESS 1 TO MAIN MENU");
			 System.out.println("PRESS 2 TO EXIT");
			 int S5=sc.nextInt();
			 switch(S5)
			 {
				 case 1:
				 {
					 System.out.println("ENJOY OUR SERVICES");
					 b5=true;
					
					 h=true;
					 mainmenu();
				 }
				 break;
				 case 2:
				 {
					 System.out.println("THANK YOU VISIT US AGAIN");
					 b5=true;
					
					 h=true;

				 }

				 }


		 }
		 }
		 else if (bal1>=1000000)
		 {
			 bal=(bal+bal1-(bal1*10/100));
			 System.out.println("UPDATED BALANCE IS: "+bal);
			  boolean b5=false;
		 while (!b5)
		 {
			 System.out.println("PRESS 1 TO MAIN MENU");
			 System.out.println("PRESS 2 TO EXIT");
			 int S5=sc.nextInt();
			 switch(S5)
			 {
				 case 1:
				 {
					 System.out.println("ENJOY OUR SERVICES");
					 b5=true;
					 
					 h=true;
					 mainmenu();
				 }
				 break;
				 case 2:
				 {
					 System.out.println("THANK YOU VISIT US AGAIN");
					 b5=true;
					
					 h=true;

				 }

				 }


		 }

		 }
		 else if (bal1>=1&&bal1<=999)
		 {
			 System.out.println("MINIMUM BALANCE TO ENTER IS GREATER THAN 1000");
			 System.out.println("PRESS 1 TO ENTER MONEY");
			 System.out.println("PRESS 2 TO CONTINUE TO SHOPPING");
			 int h1=sc.nextInt();
			 switch (h1)
			 {
			 case 1 :
				 {
					 h=false;
					 
				 }break;
				 case 2:
				 { 
					 h=true;
					 mainmenu();
					
				 }break;
			 
			 }
		 
		   
		 }
			}
		
		
	}
	public static void checkbalance() 
	{
		
		
		Scanner sc=new Scanner(System.in);
		 System.out.println("<<<<<<<<<<<<<<<<CHECK BALANCE>>>>>>>>>>>>>>>>>");
		 System.out.println("BALANCE :"+bal);
		  boolean b6=false;
			 while (!b6)
			 {
				 System.out.println("PRESS 1 TO MAIN MENU");
				 System.out.println("PRESS 2 TO EXIT");
				 int S5=sc.nextInt();
				 switch(S5)
				 {
					 case 1:
					 {
						System.out.println("enjoy our services");
						 b6=true;
						 mainmenu();
						 
						
					 }
					 break;
					 case 2:
					 {
						 System.out.println("thankyou visit us again");
						 b6=true;

					 }

					 }


			 }
			 

	}
	public static void mainmenu()
{   Scanner sc=new Scanner(System.in);
		System.out.println("main menu");
		
		System.out.println("enter 1 for shopping");
		System.out.println("enter 2 for add balance");
		System.out.println("enter 3 for check balance");
		int option=sc.nextInt();
		
		switch(option)
		{
		case 1:
		{
			shopping();
		}break;
		case 2:
		{
			addmoney();
		}break;
		case 3:
		{
			checkbalance();
		}break;
			
		}
}
	public static void watch()
	{
		Scanner sc=new Scanner(System.in);
		int min_bal=2000;
				  
				  
				  System.out.println("//////////WATCHES////////");
				  System.out.println("COST OF FASTRACK :3000");
				  System.out.println("COST OF FOSSIL :5000");
				  System.out.println("COST OF TITAN :7000");
				  System.out.println("=============================================================================================");
				  System.out.println("PRESS 1 FOR FASTRACK");
				  System.out.println("PRESS 2 FOR FOSSIL");
				  System.out.println("PRESS 3 FOR TITAN");
				  System.out.println("****************************************************");


				  
				  int S2=sc.nextInt();
				  switch(S2)
				{
					  case 1:
					{
						   int f_cost=3000;
					   
					  int deduction=bal-f_cost;
					  if (deduction>min_bal)
						{
						  bal=bal-f_cost;
						  System.out.println("PURCHASE SUCCESSFUL");
						
						   
						   boolean b3=false;
						   while (!b3)
						   {
							   System.out.println("PRESS 1 FOR CONTINUE WATCHES");
							   System.out.println("PRESS 2 FOR SHOPPING");
							   System.out.println("PRESS 3 FOR MAIN MENU");
							   System.out.println("PRESS 4 TO  EXIT");
							   
							   int S3=sc.nextInt();
							   switch(S3)
							   {
								   case 1:
								   {
									   System.out.println("<<<<<< WATCHES>>>>>");
									   b3=true;
									  
									   
									   watch();
									   

								   }
								   break;
								   case 2:
								   {
									   
									   b3=true;
									
									   
									   
									   shopping();
							
									   
									   
								   }break;
								
								   case 3:
								   {
									   System.out.println("<<<<MAIN MENU>>>>>");
									   b3=true;
									   
									   
									  
									   mainmenu();
									  
									 

								   }break;
								   case 4:
								   { 
									   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
									    b3=true;
									  
									   
								   }
							   }
						   }
		  

}
else
						{
	 System.out.println("you are not maintaing sufficient balance");
	  System.out.println("PRESS 1 TO ADD MONEY");
	  System.out.println("PRESS 2 TO CONTINUE SHOPPING");
	  int input=sc.nextInt();
	  switch(input)
	  {
	  case 1:
	  {
		  addmoney1();
		  watch();
		  
		  
	  }break;
	  case 2:
	  {
		  shopping();
	  }break;
	  }
	  
	                      
						}
				
					}break;
					

case 2:
					{
						   int fo_cost=5000;
					  
					  int deduction=bal-fo_cost;
					  if (deduction>min_bal)
						{
						  bal=bal-fo_cost;
						  System.out.println("PURCHASE SUCCESSFUL");
						
						   
						   boolean b3=false;
						   while (!b3)
						   {
							   System.out.println("PRESS 1 FOR CONTINUE WATCHES");
							   System.out.println("PRESS 2 FOR SHOPPING");
							   System.out.println("PRESS 3 FOR MAIN MENU");
							   System.out.println("PRESS 4 TO  EXIT");
							   
							   int S3=sc.nextInt();
							   switch(S3)
							   {
								   case 1:
								   {
									   System.out.println("<<<<<< WATCHES>>>>>");
									   b3=true;
									   watch();
									  
									  
									   

								   }
								   break;
								   case 2:
								   {
									   
									   b3=true;
									   shopping();
			
									   
									  
									
									   
									   
								   }break;
								
								   case 3:
								   {
									   System.out.println("<<<<MAIN MENU>>>>>");
									   b3=true;
									   mainmenu();
					
									   
									  
									
									 

								   }break;
								   case 4:
								   { 
									   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
									    b3=true;
								
									  
								   }
							   }
						   }
		  

}
else
						{
	
	 System.out.println("you are not maintaing sufficient balance");
	  System.out.println("PRESS 1 TO ADD MONEY");
	  System.out.println("PRESS 2 TO CONTINUE SHOPPING");
	  int input=sc.nextInt();
	  switch(input)
	  {
	  case 1:
	  {
		  addmoney1();
		  watch();
	  }break;
	  case 2:
	  {
		  shopping();
	  }
	  }
	  
						}
						}break;

								
case 3:
					{
						   int titan_cost=7000;
					  
					  int deduction=bal-titan_cost;
					  if (deduction>min_bal)
						{
						  bal=bal-titan_cost;
						  System.out.println("PURCHASE SUCCESSFUL");
						
						   
						   boolean b3=false;
						   while (!b3)
						   {
							   System.out.println("PRESS 1 FOR CONTINUE WATCHES");
							   System.out.println("PRESS 2 FOR SHOPPING");
							   System.out.println("PRESS 3 FOR MAIN MENU");
							   System.out.println("PRESS 4 TO  EXIT");
							   
							   int S3=sc.nextInt();
							   switch(S3)
							   {
								   case 1:
								   {
									   System.out.println("<<<<<< WATCHES>>>>>");
									   b3=true;
									   watch();
									  
									  
									   

								   }
								   break;
								   case 2:
								   {
									   
									   
									   b3=false;
									   shopping();
									   
									  
									 
									   
									   
								   }break;
								
								   case 3:
								   {
									   System.out.println("<<<<MAIN MENU>>>>>");
									   b3=true;
									   mainmenu();
									   
									   
									   
									 

								   }break;
								   case 4:
								   { 
									   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
									    b3=true;
									   
								   }
							   }
							  
						   }
		  

}
					  else
					  {
						  
						  System.out.println("you are not maintaing sufficient balance");
						  System.out.println("PRESS 1 TO ADD MONEY");
						  System.out.println("PRESS 2 TO CONTINUE SHOPPING");
						  int input=sc.nextInt();
						  switch(input)
						  {
						  case 1:
						  {
							  addmoney1();
							  watch();
						  }break;
						  case 2:
						  {
							  shopping();
						  }
						  }
						  
						  
						  
					  }
					}break;
				}
				  
			

						
						
					
		
	}
	public static void shoes()
	{
		Scanner sc=new Scanner(System.in);
		int min_bal=2000;
				  
				  
				  System.out.println("//////////SHOES////////");
				  System.out.println("COST OF PUMA :5000");
				  System.out.println("COST OF ADIDAS :6000");
				  System.out.println("COST OF SPARX:7000");
				  System.out.println("=============================================================================================");
				  System.out.println("PRESS 1 FOR PUMA");
				  System.out.println("PRESS 2 FOR ADIDAS");
				  System.out.println("PRESS 3 FOR SPARX");
				  System.out.println("****************************************************");


				  
				  int S2=sc.nextInt();
				  switch(S2)
				{
					  case 1:
					{
						   int p_cost=5000;
					   
					  int deduction=bal-p_cost;
					  if (deduction>min_bal)
						{
						  bal=bal-p_cost;
						  System.out.println("PURCHASE SUCCESSFUL");
						
						   
						   boolean b3=false;
						   while (!b3)
						   {
							   System.out.println("PRESS 1 FOR CONTINUE SHOES");
							   System.out.println("PRESS 2 FOR SHOPPING");
							   System.out.println("PRESS 3 FOR MAIN MENU");
							   System.out.println("PRESS 4 TO  EXIT");
							   
							   int S3=sc.nextInt();
							   switch(S3)
							   {
								   case 1:
								   {
									   System.out.println("<<<<<< SHOES>>>>>");
									   b3=true;
									  
									   
									   shoes();
									   

								   }
								   break;
								   case 2:
								   {
									   
									   b3=true;
									
									   
									   
									   shopping();
							
									   
									   
								   }break;
								
								   case 3:
								   {
									   System.out.println("<<<<MAIN MENU>>>>>");
									   b3=true;
									   
									   
									  
									   mainmenu();
									  
									 

								   }break;
								   case 4:
								   { 
									   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
									    b3=true;
									  
									   
								   }
							   }
						   }
		  

}
else
						{
	 System.out.println("you are not maintaing sufficient balance");
	  System.out.println("PRESS 1 TO ADD MONEY");
	  System.out.println("PRESS 2 TO CONTINUE SHOPPING");
	  int input=sc.nextInt();
	  switch(input)
	  {
	  case 1:
	  {
		  addmoney1();
		  shoes();
		  
		  
	  }break;
	  case 2:
	  {
		  shopping();
	  }break;
	  }
	  
	                      
						}
				
					}break;
					

case 2:
					{
						   int a_cost=5000;
					  
					  int deduction=bal-a_cost;
					  if (deduction>min_bal)
						{
						  bal=bal-a_cost;
						  System.out.println("PURCHASE SUCCESSFUL");
						
						   
						   boolean b3=false;
						   while (!b3)
						   {
							   System.out.println("PRESS 1 FOR CONTINUE SHOES");
							   System.out.println("PRESS 2 FOR SHOPPING");
							   System.out.println("PRESS 3 FOR MAIN MENU");
							   System.out.println("PRESS 4 TO  EXIT");
							   
							   int S3=sc.nextInt();
							   switch(S3)
							   {
								   case 1:
								   {
									   System.out.println("<<<<<< SHOES>>>>>");
									   b3=true;
									   shoes();
									  
									  
									   

								   }
								   break;
								   case 2:
								   {
									   
									   b3=true;
									   shopping();
			
									   
									  
									
									   
									   
								   }break;
								
								   case 3:
								   {
									   System.out.println("<<<<MAIN MENU>>>>>");
									   b3=true;
									   mainmenu();
					
									   
									  
									
									 

								   }break;
								   case 4:
								   { 
									   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
									    b3=true;
								
									  
								   }
							   }
						   }
		  

}
else
						{
	
	 System.out.println("you are not maintaing sufficient balance");
	  System.out.println("PRESS 1 TO ADD MONEY");
	  System.out.println("PRESS 2 TO CONTINUE SHOPPING");
	  int input=sc.nextInt();
	  switch(input)
	  {
	  case 1:
	  {
		  addmoney1();
		  shoes();
	  }break;
	  case 2:
	  {
		  shopping();
	  }
	  }
	  
						}
						}break;

								
case 3:
					{
						   int s_cost=7000;
					  
					  int deduction=bal-s_cost;
					  if (deduction>min_bal)
						{
						  bal=bal-s_cost;
						  System.out.println("PURCHASE SUCCESSFUL");
						
						   
						   boolean b3=false;
						   while (!b3)
						   {
							   System.out.println("PRESS 1 FOR CONTINUE SHOES");
							   System.out.println("PRESS 2 FOR SHOPPING");
							   System.out.println("PRESS 3 FOR MAIN MENU");
							   System.out.println("PRESS 4 TO  EXIT");
							   
							   int S3=sc.nextInt();
							   switch(S3)
							   {
								   case 1:
								   {
									   System.out.println("<<<<<< SHOES>>>>>");
									   b3=true;
									   shoes();
									  
									  
									   

								   }
								   break;
								   case 2:
								   {
									   
									   
									   b3=false;
									   shopping();
									   
									  
									 
									   
									   
								   }break;
								
								   case 3:
								   {
									   System.out.println("<<<<MAIN MENU>>>>>");
									   b3=true;
									   mainmenu();
									   
									   
									   
									 

								   }break;
								   case 4:
								   { 
									   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
									    b3=true;
									   
								   }
							   }
							  
						   }
		  

}
					  else
					  {
						  
						  System.out.println("you are not maintaing sufficient balance");
						  System.out.println("PRESS 1 TO ADD MONEY");
						  System.out.println("PRESS 2 TO CONTINUE SHOPPING");
						  int input=sc.nextInt();
						  switch(input)
						  {
						  case 1:
						  {
							  addmoney1();
							  shoes();
						  }break;
						  case 2:
						  {
							  shopping();
						  }
						  }
						  
						  
						  
					  }
					}break;
				}
				  
			

						
						
					
		
	}	
	public static void bags()
	{
		Scanner sc=new Scanner(System.in);
		int min_bal=2000;
				  
				  
				  System.out.println("/////////BAGS////////");
				  System.out.println("COST OF WILDCRAFT :1000");
				  System.out.println("COST OF SKYBAGS:2000");
				  System.out.println("COST OF TOMMY:3000");
				  System.out.println("=============================================================================================");
				  System.out.println("PRESS 1 FOR WILDCRAFT");
				  System.out.println("PRESS 2 FOR SKYBAGS");
				  System.out.println("PRESS 3 FOR TOMMY");
				  System.out.println("****************************************************");


				  
				  int S2=sc.nextInt();
				  switch(S2)
				{
					  case 1:
					{
						   int 	w_cost=1000;
					   
					  int deduction=bal-w_cost;
					  if (deduction>min_bal)
						{
						  bal=bal-w_cost;
						  System.out.println("PURCHASE SUCCESSFUL");
						
						   
						   boolean b3=false;
						   while (!b3)
						   {
							   System.out.println("PRESS 1 FOR CONTINUE BAGS");
							   System.out.println("PRESS 2 FOR SHOPPING");
							   System.out.println("PRESS 3 FOR MAIN MENU");
							   System.out.println("PRESS 4 TO  EXIT");
							   
							   int S3=sc.nextInt();
							   switch(S3)
							   {
								   case 1:
								   {
									   System.out.println("<<<<<< BAGS>>>>>");
									   b3=true;
									  
									   
									   bags();
									   

								   }
								   break;
								   case 2:
								   {
									   
									   b3=true;
									
									   
									   
									   shopping();
							
									   
									   
								   }break;
								
								   case 3:
								   {
									   System.out.println("<<<<MAIN MENU>>>>>");
									   b3=true;
									   
									   
									  
									   mainmenu();
									  
									 

								   }break;
								   case 4:
								   { 
									   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
									    b3=true;
									  
									   
								   }
							   }
						   }
		  

}
else
						{
	 System.out.println("you are not maintaing sufficient balance");
	  System.out.println("PRESS 1 TO ADD MONEY");
	  System.out.println("PRESS 2 TO CONTINUE SHOPPING");
	  int input=sc.nextInt();
	  switch(input)
	  {
	  case 1:
	  {
		  addmoney1();
		  bags();
		  
		  
	  }break;
	  case 2:
	  {
		  shopping();
	  }break;
	  }
	  
	                      
						}
				
					}break;
					

case 2:
					{
						   int sb_cost=2000;
					  
					  int deduction=bal-sb_cost;
					  if (deduction>min_bal)
						{
						  bal=bal-sb_cost;
						  System.out.println("PURCHASE SUCCESSFUL");
						
						   
						   boolean b3=false;
						   while (!b3)
						   {
							   System.out.println("PRESS 1 FOR CONTINUE BAGS");
							   System.out.println("PRESS 2 FOR SHOPPING");
							   System.out.println("PRESS 3 FOR MAIN MENU");
							   System.out.println("PRESS 4 TO  EXIT");
							   
							   int S3=sc.nextInt();
							   switch(S3)
							   {
								   case 1:
								   {
									   System.out.println("<<<<<< BAGS>>>>>");
									   b3=true;
									   bags();
									  
									  
									   

								   }
								   break;
								   case 2:
								   {
									   
									   b3=true;
									   shopping();
			
									   
									  
									
									   
									   
								   }break;
								
								   case 3:
								   {
									   System.out.println("<<<<MAIN MENU>>>>>");
									   b3=true;
									   mainmenu();
					
									   
									  
									
									 

								   }break;
								   case 4:
								   { 
									   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
									    b3=true;
								
									  
								   }
							   }
						   }
		  

}
else
						{
	
	 System.out.println("you are not maintaing sufficient balance");
	  System.out.println("PRESS 1 TO ADD MONEY");
	  System.out.println("PRESS 2 TO CONTINUE SHOPPING");
	  int input=sc.nextInt();
	  switch(input)
	  {
	  case 1:
	  {
		  addmoney1();
		  bags();
	  }break;
	  case 2:
	  {
		  shopping();
	  }
	  }
	  
						}
						}break;

								
case 3:
					{
						   int t_cost=32000;
					  
					  int deduction=bal-t_cost;
					  if (deduction>min_bal)
						{
						  bal=bal-t_cost;
						  System.out.println("PURCHASE SUCCESSFUL");
						
						   
						   boolean b3=false;
						   while (!b3)
						   {
							   System.out.println("PRESS 1 FOR CONTINUE BAGS");
							   System.out.println("PRESS 2 FOR SHOPPING");
							   System.out.println("PRESS 3 FOR MAIN MENU");
							   System.out.println("PRESS 4 TO  EXIT");
							   
							   int S3=sc.nextInt();
							   switch(S3)
							   {
								   case 1:
								   {
									   System.out.println("<<<<<< BAGS>>>>>");
									   b3=true;
									   bags();
									  
									  
									   

								   }
								   break;
								   case 2:
								   {
									   
									   
									   b3=false;
									   shopping();
									   
									  
									 
									   
									   
								   }break;
								
								   case 3:
								   {
									   System.out.println("<<<<MAIN MENU>>>>>");
									   b3=true;
									   mainmenu();
									   
									   
									   
									 

								   }break;
								   case 4:
								   { 
									   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
									    b3=true;
									   
								   }
							   }
							  
						   }
		  

}
					  else
					  {
						  
						  System.out.println("you are not maintaing sufficient balance");
						  System.out.println("PRESS 1 TO ADD MONEY");
						  System.out.println("PRESS 2 TO CONTINUE SHOPPING");
						  int input=sc.nextInt();
						  switch(input)
						  {
						  case 1:
						  {
							  addmoney1();
							  bags();
						  }break;
						  case 2:
						  {
							  shopping();
						  }
						  }
						  
						  
						  
					  }
					}break;
				}
				  
			

						
						
					
		
	}	
	public static void addmoney1() 
	{
		
		
            System.out.println("<<<<<<<<<<<<<<<<ADD BALANCE>>>>>>>>>>>>>>>>>");
      System.out.println("10% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000 T0 999999");
   System.out.println("2.5% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000000");



	System.out.println("ENTER THE BALANCE TO BE ADDED");
	Scanner sc=new Scanner(System.in);
	int bal1=sc.nextInt();
		 if (bal1>=1000&&bal1<=999999)
		 {
			 bal=(bal+bal1-(bal1*10/100));
			 System.out.println("UPDATED BALANCE IS: "+bal);
			 
		 }
		 
		 else if (bal1>=1000000)
		 {
			 bal=(bal+bal1-(bal1*10/100));
			 System.out.println("UPDATED BALANCE IS: "+bal);
			 
				

		 }

		 
		 else if (bal1>=1&&bal1<=999)
		 {
			 System.out.println("MINIMUM BALANCE TO ENTER IS GREATER THAN 1000");
			 System.out.println("PRESS 1 TO ENTER MONEY");
			 System.out.println("PRESS 2 TO CONTINUE TO SHOPPING");
			
			 }
		 
		   
		 }
			
		
		
	}



