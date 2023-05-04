package org.day2assignments;

import java.util.Arrays;
import java.util.Iterator;

public class MissingElementInAnArray {

	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,7,6,8};
		
		int x=arr.length;
		
	
		Arrays.sort(arr);
		
		for (int i = 0; i <x; i++) {
			
			
			if (i+1!=arr[i]) {
				
				System.out.println(i+1);
				
				break;
			}
			
			
		}
		
			
		}

	}

