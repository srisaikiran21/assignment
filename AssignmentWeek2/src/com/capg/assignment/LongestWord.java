package com.capg.assignment;



public class LongestWord {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	    
	        String s = "Welcome back to Capgemini";
	        String[] word = s.split( " " );
	        //System.out.println(word.length);
	        String rts = " ";

	        for ( int i = 0; i < word.length; i++ )
	        {
	            if ( word[i].length() > rts.length() )
	                rts = word[i];

	        }
	        System.out.println( rts );
	    

	}

}
