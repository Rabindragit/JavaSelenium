package ravi.ops;

import java.util.Scanner;

//Prime no is divisible by 1 and itself
//Example:-----------------
//7= Divisible by 1, 7 this prime no
//9= Divisible 1,3,9 this is not prime no

public class ToCheckPrimeNumber 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	
	{
		boolean prime=true;
		System.out.println("Enter number to be checked ");
		Scanner obj = new Scanner(System.in);// User input
		Integer num=obj.nextInt();
		
		for(int i=2;i<num;i++)
		    {
			if (num%i==0) 
		    { 
			prime=false;
		    }	
		    }
		
		   if(prime==true)
		   {
			System.out.println("Given no is a prime number");
	       }   
		   else 
		   {
			 System.out.println("Given no is a NOT a prime number");
		   }
   }
 }
