package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.basedriver.Basedriver;

public class Cardtypeclass extends Basedriver {

	public void cardtype(String cardtype) throws InterruptedException {
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.name("creditCard"));
		Select arriveto = new Select(ele);
		arriveto.selectByVisibleText(cardtype);
		System.out.println("select card type");
		Reporter.log("select card type :" + cardtype);

	}

	public void cardnumber(String cardno) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("creditnumber")).sendKeys(cardno);
		System.out.println("print card no");
		Reporter.log("print card no:" + cardno);
	}

	public void exprirydate(String date) throws InterruptedException {
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.name("cc_exp_dt_mn"));
		Select value = new Select(ele);
		value.selectByVisibleText(date);
		System.out.println("print expiry date");
		Reporter.log("print expiry date:" + date);

	}
	public void firstname(String name) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("cc_frst_name")).sendKeys(name);
		System.out.println("print first name");
		Reporter.log("print name:"+name);
		
	}
	public void lastname(String lastname) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("cc_last_name")).sendKeys(lastname);
		System.out.println("print last name:"+lastname);
		
	}
}
