package com.userregistration;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws UserException {
		User_Registration obj=new User_Registration();
//		obj.firstName();
//		obj.lastName();
//		obj.gmail();
//		obj.phoneNumber();
//		obj.passward();
		List<String> gmail=new ArrayList<String>();
		gmail.add("abc@yahoo.com");
		gmail.add("abc-100@yahoo.com");
		gmail.add("abc111@abc.com");
		gmail.add("abc-100@abc.net");
		gmail.add("abc.100@abc.com.au");
		gmail.add("abc@1.com");
		gmail.add("abc@gmail.com.com");
		gmail.add("abc+100@gmail.com");
		for(String a:gmail) {
			obj.gmailList(a);
			System.out.println(a);
		}
		
	}

}
 