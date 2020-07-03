package com.flows;

import org.testng.Reporter;

import com.basedriver.Basedriver;
import com.pages.Loginclass;

public class Loginflow extends Basedriver{

Loginclass lc=new Loginclass();

public void flow_login(String username,String password) throws InterruptedException {
	
	lc.username(username);
	lc.password(password);
	lc.clicklogin();
//	System.out.println("print username");
//	Reporter.log(username);
//	System.out.println("print password");
//	Reporter.log(password);
	
}
}
