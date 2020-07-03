package com.flows;

import org.testng.Reporter;

import com.pages.Flightdetailsclass;

public class Flightdetails_flow {
	Flightdetailsclass fli=new Flightdetailsclass();

public void Flightdetails(String location,String month,String date1) throws InterruptedException {
	fli.arriveto(location);
	fli.departfrom(location);
	fli.fromdate(month);
	fli.todate(date1);
	fli.clickcontinue();
	fli.clickreserveFlightcontinue();
//	System.out.println("print location");
//	Reporter.log(location);
//	System.out.println("print date");
//	Reporter.log(date);
//	System.out.println("print date1");
//	Reporter.log(date1);
}
}

