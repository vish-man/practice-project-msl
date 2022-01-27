package com.step1.lesson2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationOfAnEmailId {

	 public static boolean isValidEmail(String email) {		
		 // TODO Auto-generated method stub
		
		  String regex = "^(.+)@(.+)$";
		  
			 //initializing the object pattern		  
		       Pattern pattern = Pattern.compile(regex);
		       Matcher matcher = pattern.matcher(email);
		       return matcher.matches();
      }
               public static void main(String[] args) {
		       List<String> emailid = new ArrayList<String>();
		       
		       // some of the valid email id's
		       emailid.add("xyz123@etc.com");
		       emailid.add("45abc@eg.com");
		       
		       //some of the invalid email id's
		       emailid.add("ootd.btech.com");
		       emailid.add("nothing.something55");

		       for (String value : emailid) {
		           System.out.println("The Email id " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
     }
		       
		       // taking email id's from user input for validation
		       System.out.println("\nEnter the Email id to check whether it's valid or invalid : \n");
		       try (Scanner theScan = new Scanner(System.in)) {
			   String input = theScan.nextLine();
				   System.out.println("The entered Email id " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
			}
	  }
}

