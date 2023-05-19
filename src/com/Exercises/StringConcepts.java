package com.Exercises;

public class StringConcepts {

	public static void main(String[] args) {
		String a = "eden";
		String a1="eden";
		System.out.println(a==a1); // true 
		System.out.println(a.equals(a1)); // True : Both are in inside the pool memory and both are having the same content 
		
		
		String a2="prem";
		System.out.println(a==a2); // F
		System.out.println(a.equals(a2));
		
		String a3 = new String("eden");
		
		System.out.println(a1==a3);// f
		
		System.out.println(a1.equals(a3)); // True 
        System.out.println(a2.equals(a3)); // F
        System.out.println(a2==a3); // F Here the both variables are not same so it's false 
        
        
        String b = "pink";
        String b1 = "pink";
        
        String b3 = "blue";
        b3=null;
        System.out.println(b3);
        
        String k="blue";
        
        String b4 = new String("pink"); 
        String bn = new String("pink"); 
        b4=null;
        System.out.println(b4.equals(k));
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        		
	}

}
