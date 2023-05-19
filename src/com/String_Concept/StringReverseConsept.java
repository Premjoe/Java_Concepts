package com.String_Concept;
import java.util.spi.LocaleNameProvider;

import javax.naming.AuthenticationException;

import Exception_Handling.FrameworkException;

public class StringReverseConsept {

		public static String reverseString(String str) {
			// Null Check: 1
			if (str== null) { // If the condition is true it wont execute the loop
				System.out.println("This is null value and not allowed");
				throw new FrameworkException("STRING CAN NOT BE NULL");
			}
			
			
			int len = str.length(); // 8
			System.out.println(str + " length is: " +len );
			
			// Length Check: 2
			if (len==0) {
				System.out.println("The lenth is 0");
				return "Length 0 not allowed";
				//return "-1";
				
			}
			
			// Length Check is not == to more than 2 char : 3
			if (len==1) { // If the condition is true it wont execute the loop
				return str;
			}
			
			
			String rev = "";
			for(int i= len-1; i >=0; i--) {
				rev = rev+str.charAt(i);
				//System.out.println(rev);
			}
			return rev;
			
		}
	public static void main(String[] args) {
		// Selenium --> muineleS
		// T --> T
		// null ?
		// 123 --> 321
		System.out.println(reverseString(""));
//		System.out.println(reverseString("Selenium"));
//		System.out.println(reverseString("Selenium test"));
//		System.out.println(reverseString("Selenium test 123"));
//		System.out.println(reverseString("T")); // The length of t is 1 no need to do with entire loop right
//		System.out.println(reverseString(null)); // Need to over come the null exception
		
	}

}
