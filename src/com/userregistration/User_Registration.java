package com.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class User_Registration {

	public static void main(String[] args) {
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

}
