package com.flows;

import com.pages.Deliveryclass;

public class Deliveryflow {
Deliveryclass del=new Deliveryclass();

public void Deliveryclass(String postalcode,String adress,String city,
		String state,String country) throws InterruptedException {
	del.deliveryadress(adress);
	del.deliverycity(city);
	del.deliverycountry(country);
	del.deliverypostalcode(postalcode);
	del.deliverystate(state);
	
}
}
