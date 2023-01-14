package com.userregistration;

public class Main {

	public static void main(String[] args) {
		User_Registration obj=new User_Registration();
		//obj.firstName();
		//obj.lastName();
		try {
			obj.gmail();
		} catch (UserException e) {
			
			e.printStackTrace();
		}
	}

}
