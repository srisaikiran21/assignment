package com.capg.assignment;

import java.util.Scanner;

public class Factorial {
	 public static void main(String args[]){  
		  int i,fact=1;  
		  System.out.println("Enter a number");
		  Scanner scan=new Scanner(System.in);
		  int n=scan.nextInt();
		  scan.close();
		  if(n>1 && n<18)
		  {
		  for(i=1;i<=n;i++){    
		      fact=fact*i;    
		  }
		  
		  System.out.println("Factorial of "+n+" is: "+fact);    
		 }
		  else
		  {
			  System.out.println("Invalid Input");
		  }
		 }
		}  

