package com.testcases;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.basedriver.Basedriver;
import com.flows.Cardtype_flow;

public class Testcase4 extends Basedriver{

	@Test
	public void testCardType() throws InterruptedException, IOException {
		Cardtype_flow car=new Cardtype_flow();
		takeScreenshot("cardtype");
		car.Cardtype(getdata("creditcard",1,0),getdata("creditcard",1,1),getdata("creditcard",1,2),getdata("creditcard",1,3),getdata("creditcard",1,4));
	}
}

