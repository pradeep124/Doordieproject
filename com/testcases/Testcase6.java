package com.testcases;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.basedriver.Basedriver;
import com.pages.Deliveryclass;

public class Testcase6 extends Basedriver {

	@Test	
	public void deliveryclass() throws InterruptedException, IOException {
		takeScreenshot("deliveryclass");
		Deliveryclass del=new Deliveryclass();
		del.deliveryadress(getdata("Deliveryadress",1,0));
		del.deliverycity(getdata("Deliveryadress", 1,1));
		del.deliverystate(getdata("Deliveryadress", 1, 2));
		del.deliverypostalcode(getdata("Deliveryadress",1,3));
		del.deliverycountry(getdata("Deliveryadress", 1,4));
		
	}
}
