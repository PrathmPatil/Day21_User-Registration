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
		boolean  lName=Pattern.matches("[A-Z]{1}[a-zA-Z]{2}", lname);
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
	void gmail()throws UserException  {
		/*
		 * Check Gmail are volid or not				
		 */
		String usergmail;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Gmail (abc.xyz@bl.co.in): ");
		try {
		usergmail=sc.nextLine();
		boolean checkmail=Pattern.matches("^abc.[a-z]+@bl.co.[a-z]{1,}$", usergmail);
		if(checkmail==true)
		{
			System.out.println(checkmail);		
		}
		else
		{
			throw new  UserException("Here an exceptin has come");
		}
		}catch( UserException e)
		{
			System.out.println("Enter Valid mail");
		}
		
		//^abc.[a-zA-Z0-9+_-]+@bl.co.[a-zA-Z0-9-]+$
//		System.out.println(checkmail);
		
	}

}
