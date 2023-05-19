package com.String_Concept;

import java.security.PublicKey;
import java.sql.ShardingKey;
import java.util.Arrays;

import javax.lang.model.element.NestingKind;

public class String_Methods {

	public static void main(String[] args) {
		
		
		String s = "Hi, Welcome to Java World";
		s.intern(); // It wont take duplicate value because already there and we can not make duplicate
		
		String l = "this is my java code and i am happy and i want to learn more and i am cool";
		System.out.println("The 0th index value is :"+l.charAt(0));
		System.out.println("The 5th index value is :"+l.charAt(5));
		// System.out.println(l.charAt(100)); StringIndexOutOfBoundsException 
		System.out.println("I am the total count of the String :" +l.length());
		System.out.println(l.indexOf("i")); // 1st occurrence
		System.out.println(l.indexOf("i", l.indexOf("i")+1));	// 2nd occurrence	
		System.out.println(l.indexOf("i", l.indexOf("i", l.indexOf("i")+1)+1));
		System.out.println("------------");
		System.out.println(l.indexOf("i", l.indexOf("i", l.indexOf("i", l.indexOf("i")+1)+1)+1));
		System.out.println("------------");
		System.out.println(l.indexOf("i", l.indexOf("i", l.indexOf("i", l.indexOf("i", l.indexOf("i")+1)+1)+1)+1));
		System.out.println("------------");
		
		String mesg="Welcome null";
		if (mesg.indexOf("admin")>0) {
			System.out.println("Admin is Present");
			
		}else {
			System.out.println("Fail");
		}
		
		//System.out.println(l.indexOf("i"));
		String tS = "this is my java code";
		System.out.println(tS.toUpperCase());
		System.out.println(tS.toLowerCase());
		
		// Trim : trim method will remove the cor0rner 
		String t="     Selenium Automation   "; // SCP 
		System.out.println(t.trim());
		t=t.replace(" ", ""); // Heap
		System.out.println("Removing the sapce inbetween selenium and Automation:" + t);
		
		// Replace:
		String dob = "01-02-1990"; //01/02/1990
		dob.replace("-", "/");
		System.out.println("Changing the formate with replace method: " +dob);
		
		
		// Substring : 
		String mg = "your order id is qwertzy";
		System.out.println(mg.substring(7)); // It will print after the 0 to 6 character (7)
		System.out.println(mg.substring(0, 7)); // Here the last index - 1, (0 to 6)
		
		System.out.println(mg.substring(mg.indexOf("is")+2, mg.length())); // It will print with space the +2 is counting like i =1, s = 2 (2)
		System.out.println(mg.substring(mg.indexOf("is")+3, mg.length())); // +3 is counting like i =1, s = 2, space =3 
		
		
		// contains : in particular string i want to check specific string
		
		String g = "Hello find my name Prem";
		System.out.println(g.contains("Prem")); 
		
		if (g.contains("Prem")) { // We can use this check points in terms and condition and labels name
			
			System.out.println("The Prem character is avaiable - Pass");
			
		} else {
			System.out.println("The Prem character is not avaiable - Fail");
		}
		
		System.out.println("-------");
		
		
		// equals:
		
		String p1 = "Hello Selenium";
		String p2 = "Hello selenium";
		System.out.println(p1.equals(p2)); // Hard comparison 
		System.out.println("-------");
		System.out.println(p1.equalsIgnoreCase(p2)); // Soft comparison // only it will accept case sensitive and It won't accept space 
		System.out.println("-------");
		
		
		//split:
		
		String lang = "JAVA_PYTHON_RUBY_JAVASCRIPT";
		String lg[]= lang.split("_"); // Split return type is string array
		System.out.println(lg[0]); // java is 0th index
		System.out.println(lg[1]); // python is 1st index
		System.out.println(Arrays.toString(lg));
		
		System.out.println("-------");
		
		// Case 2
		String top = "xXtestingXxXSeleniumXXxXAutomationxXXCypress";
		String tp[] = top.split("xX");
		System.out.println("The value of 0th index is: " + tp[0].length()); // Here it will not print the 0th index 
		//why because we split it and no values(nothing) in 0th position,
		System.out.println(tp[1]);
		System.out.println(tp[2]);
		System.out.println(tp[3]);
		System.out.println(tp[4]);
		//System.out.println(tp[5]); // AEIOB
		System.out.println(Arrays.toString(tp));
		
		System.out.println("-------");
		
		// Case 3:
		String mk = "my order id is prem";
		String orderid = mk.split("is")[1].trim();
		System.out.println(orderid);
		System.out.println("-------");
		
		// Case 4;
		String empData = "Eden;Automation;London;Kirchstrasse;1000;kita;Germany";
		String userInfo[] = empData.split(";");
		
		for (String e : userInfo) {
			
			System.out.println(e);
			
		}
		System.out.println("-------");
		
		// Case 5; pipe case will print 0th index as a P : Pipe is having special value is the regular expression 
		
		String empData1 = "Peter|Automation|London|Kirchstrasse|1000|kita|Germany";
		String userInfo1[] = empData1.split("\\|"); // if u put backslash java will understand normal not a regular expression 
		System.out.println(userInfo1[0]);
		
		System.out.println("-------");
		String d = "I Love \"Java\" and I so Happy";
		
		// I want to Print like 'I Love "Java" and I so Happy
		System.out.println(d);
		
		System.out.println("-------");
 
		createXpath("Prem");
	}
	public static void createXpath(String empName) {
		
		String xpath = "//a[text()='"+empName+"']"; // Appending the string 
		System.out.println(xpath);
		
	}

}
	