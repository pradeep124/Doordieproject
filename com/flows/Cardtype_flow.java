package com.flows;

import com.basedriver.Basedriver;
import com.pages.Cardtypeclass;

public class Cardtype_flow extends Basedriver {
	Cardtypeclass car = new Cardtypeclass();

	public void Cardtype(String cardtype, String date, String name, String lastname, String cardnumber)
			throws InterruptedException {
		car.cardnumber(cardnumber);
		car.cardtype(cardtype);
		car.exprirydate(date);
		car.firstname(name);
		car.lastname(lastname);

	}
}

