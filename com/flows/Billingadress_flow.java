package com.flows;

import com.basedriver.Basedriver;
import com.pages.Billingadress;

public class Billingadress_flow extends Basedriver{
	Billingadress bil=new Billingadress();
	
	public void BillingAddress(String adress,String cityname,String statename,String postalcode,String country) throws InterruptedException {
		bil.adress(adress);
		bil.city(cityname);
		bil.state(statename);
		bil.postalcode(postalcode);
		bil.country(country);
	}
}
