package org.day2assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Build a logic to find the given string is palindrome or not
	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */

		
		String st="madam";
		
		String revvalue="";
		
		for (int i =st.length()-1;i>=0;--i) {
			
			revvalue=revvalue+st.charAt(i);
			
		}
		
		
		if (st.equalsIgnoreCase(revvalue)) {
			
			System.out.println("Given is string is the palinDrome:" + revvalue);
			
		}
		
		else {
			
			System.out.println("Given is string is the not a palinDrome");
			
		}
	}

}
