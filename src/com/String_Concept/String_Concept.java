package com.String_Concept;

public class String_Concept {

	public static void main(String[] args) {
		
		// String is class
		// String is the collection of character or String is the array of characters 
		
				String s="testing"; // String Literals  - It's stored in String constant pool (SCP)
				String s1=new String("testing"); // String is class and we can create the object - It's stored in Heap
				
				// int i = 0; It's stored in stack memory 
				
				String s2 = "testing";
				System.out.println(s==s2); // true  // The double equal method is one applicable for string litreals 
				System.out.println(s==s1); // false : comparing pool memory with heap object memory 
				System.out.println(s.equals(s2)); // true  : It's not checking the reference variable and It's checking content(value)
				System.out.println(s.equals(s1)); // true 
				
				String s3 = "java"; // java will be in pool memory without any reference
				s3=null; // String default values is null
				System.out.println(s3);
				
				String s4 = "java"; // here new java variable own't create and old value will take the reference
				
				String s6=new String("testing");
				
				
				String t1 = "Selenium"; // SCP
				String t0 = "selenium"; // SCP
				
				String t2 = new String("Selenium"); // heap
				t2.intern(); // SCP : One Selenium copy will be updated in pool memory without any reference 
				String t3 = "Selenium"; // Here the previous without reference value "Selenium"(pool), will be pointed with t3 variable
				// It won't create new value for t3
				
				
				String top = "prem";
				String top1="prem";
				String top3= new String("prem");
				top =null; // top is breaking the connection with prem but "prem" value is still in pool memory 
				top1=null;
				String top4="prem"; 
				System.out.println(top==top1); // SCP --> True : comparison is happening in inside the pool memory  
				//System.out.println(top.equals(top1)); // comparison is happening between pool and heap
				System.out.println(top4==top3); // False : The memory address is different or reference is different 
				System.out.println(top4.equals(top3)); // True:  .equals method always will check the content or value : prem = prem is true
				
				
				String z= "testing";
				z.concat("automation");
				System.out.println(z);
				
				String z2= "testing";
				z2=z2.concat("automation");
				System.out.println(z2);
				String y = "testing"; //String is Immutable : the value won't change : This operation is happening in pool memory
				System.out.println(y);
				
				
				String z1= "testing";
				String l = z1.concat("automation");
				System.out.println(l);
				
				
				String r = "  Cypress  ";
				System.out.println(r.trim());
				System.out.println(r); // String is Immutable : the value won't change
				r = r.trim();
				System.out.println(r); 
				
				// String Buffer and String Builder :Both are Mutable's Strings
				
				// 
				// String Buffer :Thread Safe, Synchronised , slower . Since 1.0
				// Thread Safe : For Parallel Execution : The second thread can't do any operation, It's locked for 2nd thread
				// It will unlock when first thread is done
				
				// String Builder : Not Thread Safe, Not Synchronised, fast, Since 1.5
				// All the threads are performing same time 
				
				
				StringBuilder sb=new StringBuilder("Prem");
				
				sb.append("Automation");
				System.out.println(sb);
				
				
				String g = "JavaProgram";
				String g1 = "Java";
				String g2 = g1 + "Program"; // JavaProgram will create in inside the heap
				String g3 = "Java" + "Program"; // Here already JavaProgram is there in pool memory and only it will create new reference g3
				
				
				System.out.println(g ==g2); // False  It will check the reference with pool memory with object heap memory
				System.out.println(g ==g3); // True
				
				
				String up= "hi this is my java program";
				System.out.println(up.toUpperCase());
				
				String p= "HI THIS IS MY JAVA PROGRAM";
				String lc = up.toLowerCase();
				System.out.println(lc);
				
				
				
				
	
	}

}
