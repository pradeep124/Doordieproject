
package com.testcases;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.basedriver.Basedriver;
import com.flows.Flightdetails_flow;

public class Testcase2 extends Basedriver {

	@Test
	public void testFlightdetailsflow() throws InterruptedException, IOException {
		Flightdetails_flow fli=new Flightdetails_flow();
		takeScreenshot("Flight details");
		fli.Flightdetails(getdata("Flightdetails", 1,0),getdata("Flightdetails",1,1),getdata("Flightdetails",1, 2));
}
}