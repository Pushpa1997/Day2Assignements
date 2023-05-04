package org.day2assignments;

import java.util.Iterator;

public class Day2Extraassignments {

	
	public static void main(String[] args) {
		
		
		String s= "Hello World";
		
		String lastword=s.substring(s.lastIndexOf(" ")+1);
		
		//System.out.println(lastword);
		
		for (int i = 0; i <s.length(); i++) {
			
			
			int len=lastword.length();
			
			System.out.println("The last word is"+" "+lastword+" "+"with "+ "lenght " + len);
			
			break;
		}
		
		
		
	}
}
