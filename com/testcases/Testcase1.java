package com.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.basedriver.Basedriver;
import com.flows.Loginflow;

public class Testcase1 extends Basedriver {
@Test
public void testflow() throws InterruptedException, IOException {
	Loginflow lo=new Loginflow();
	takeScreenshot("Login");


	
	
	
	lo.flow_login(getdata("Login",1,0),getdata("Login",1,1));
	
	System.out.println("fill in user name as :"+getdata("Login", 1,0));
	
	System.out.println("fill passwords as:"+getdata("Login", 1,1));
	
	
}
	
	
	
}

