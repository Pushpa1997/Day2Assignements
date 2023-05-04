package org.day2assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "pushpa";
		
		int testLength=test.length();
		
		char[] charArray = test.toCharArray();
	
		for (int i = 0; i < testLength; i++) {
			
			if (charArray[i]%2!=0) {
				

				System.out.print(Character.toUpperCase(charArray[i]));
				
			}

		}
		
	}

}
