package com.capg.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabetSoup {
	 
	String AlphabetSoup(String str) { 
		  
		    char[] ch = new char[str.length()];

		  for (int i = 0; i < str.length(); i++) {
		   ch[i] = str.charAt(i);
   }
		    
		  Arrays.sort(ch);
		  String str1 ="";
		  for (int i = 0; i < str.length(); i++) {
		   str1= str1+ ch[i];
		 
		  }
		   return str1;
		 
	 } 
	  public static void main (String[] args) {   
	    Scanner s = new Scanner(System.in);
	    AlphabetSoup c = new AlphabetSoup();
	    String value=s.nextLine();
	    if(value.matches("^[a-zA-Z]*$"))
	    {
	    System.out.print(c.AlphabetSoup(value));
	    }
	    else {
	    	System.out.println("Invalid string");
	    }
	    s.close(); 
	  }   
	 

}
