package com.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class User_Registration {

	void firstName() {
		/*
		 * Check First Name are valid or not
		 */
		String fname;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first name: ");
		fname=sc.next();
		boolean fName=Pattern.matches("[A-Z]{1}[a-zA-Z]{2}", fname);
        System.out.print("Enterd Name "+ fName+" are");
        if(fName==true)
        {
        	System.out.println(" Valid.");
        }
        else
        {
        	System.out.println(" Invalid.");
        }
	}
	void lastName() {
        /*
         * Check Last Name are valid or not
         */
		String lname;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter last name: ");
		lname=sc.next();
		boolean lName=Pattern.matches("[A-Z]{1}[a-zA-Z]{2}", lname);
        System.out.print("Enterd Name "+lname+" are");
        if(lName==true)
        {
        	System.out.println(" Valid.");
        }
        else
        {
        	System.out.println(" Invalid.");
        }
	}
	

}
