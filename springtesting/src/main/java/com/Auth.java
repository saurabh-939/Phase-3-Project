package com;
public class Auth {

	boolean authenticate(String uname, String pwd)
	{
		if(uname.equals("admin") && pwd.equals("admin"))
			return true;
		else
			return false;
	}
}
