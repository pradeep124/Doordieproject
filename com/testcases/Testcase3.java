package com.testcases;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.basedriver.Basedriver;
import com.flows.Passenger_flow;

public class Testcase3 extends Basedriver{

	@Test
	public void testPassengersClass() throws IOException {
		takeScreenshot("passengerclass");
	Passenger_flow pas=new Passenger_flow();
	pas.Passengrs(getdata("Passengers",1,0),getdata ("Passengers",1,1),getdata("Passengers",1,2));
}
} 