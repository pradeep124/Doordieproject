package com.testcases;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.basedriver.Basedriver;
import com.flows.Billingadress_flow;

public class Testcase5 extends Basedriver{

	@Test
	public void testBillingadress() throws InterruptedException, IOException {
	
	Billingadress_flow bif=new Billingadress_flow();
	takeScreenshot("Billingadress");
	bif.BillingAddress(getdata("Billingadress",1,0),getdata("Billingadress",1,1),getdata("Billingadress",1,2),
			getdata("Billingadress",1,3),getdata("Billingadress",1,4)); 
	
}
}