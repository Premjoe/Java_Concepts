package com.Data_Conversion;

import java.lang.annotation.AnnotationTypeMismatchException;

public class Data_Convert {

	public static void main(String[] args) {
	String x = "100";
	System.out.println("This is string concadnation: "+ x+50);
	
    
	// type casting is converting byte to int (data type conversation)
	 // Using wrapper class we can convert the (Converting Premitive in to non permitive -  Data type in to class conversation)
	
	
	// Ex String to int ;
					int i = Integer.parseInt(x);
					System.out.println("Converted String in to integer class: " + i);
					
	// Whenever we are converting and conversation String to Integer, It will check pure numeric string value or not ? 
					
//					String test="100A"; // This is alfa numeric value 
//					int k=Integer.parseInt(test); //NumberFormatException
//					System.out.println(k);
					
	// String to double ;
					String s="56.78";
					System.out.println("Adding String with double:" + s+2.2);
					double d = Double.parseDouble(s);
					System.out.println("Coverted string to double:" + s);
					
					
					
					System.out.println("The Max value of Byte: "+Byte.MAX_VALUE);
					System.out.println(Byte.MIN_VALUE);
					
 // String to boolean ;		
					String headless="true";
					System.out.println(headless);
					if(Boolean.parseBoolean(headless));
					System.out.println(headless);
					
// int to String : 					
					int u = 100;
					System.out.println(u+20);
					String j = String.valueOf(u); // It convert int to String "100"
					System.out.println("int to String converted: "+ j);
					
					
	}

}
