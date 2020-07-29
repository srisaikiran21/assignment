package com.capg.assignment;


public class LetterChanges {
	private static String LetterChanges(String str){
		char ch;
		for(int i=0;i<str.length();i++){
		ch=str.charAt(i);
		Character c1 = new Character(ch);
		if(c1.equals('z')){
		c1=(char)(c1-25);
		c1=c1.toUpperCase(c1);
		str = str.substring(0, i) + c1 + str.substring(i+ 1);
		}
		else{
		c1=(char)(c1+1);
		if(c1.equals('e')||c1.equals('i')||c1.equals('o')||c1.equals('u')){
		c1=c1.toUpperCase(c1);
		}
		str = str.substring(0, i)  + c1 + str.substring(i + 1);
		}
		}
		return str;
		}
		public static void main (String[] args) throws java.lang.Exception
		{
	
		String s= "bgzhszmxzdhnt";
		String a=LetterChanges(s);
		System.out.println(a);
		}
}
