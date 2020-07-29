package com.capg.assignment;


public class LetterCapital {
	public static void main(String[] args)
	{
		String str = "this program changes first letter of every word to capital.";
		StringBuilder result = new StringBuilder(str.length());
		String words[] = str.split("\\s"); 
		for (int i = 0; i < words.length; i++)
		{			
			result.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
			
		}
		System.out.println(result); 
	}
 
}
