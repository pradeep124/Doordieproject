package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.basedriver.Basedriver;

public class Billingadress extends Basedriver {

	public void adress(String adress) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("billAddress1")).clear();
		driver.findElement(By.name("billAddress1")).sendKeys(adress);
		System.out.println("selecting the billing adress:"+adress);
	}
	public void city (String cityname) {
		driver.findElement(By.name("billCity")).clear();
		driver.findElement(By.name("billCity")).sendKeys(cityname);
		System.out.println("print city name");
	}
	public void state(String statename) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("billState")).clear();
		driver.findElement(By.name("billState")).sendKeys(statename);
		System.out.println("print state name");
	}
	public void postalcode(String postalcode) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("billZip")).clear();
		driver.findElement(By.name("billZip")).sendKeys(postalcode);
		System.out.println("print postalcode");
	}
	public void country(String country) throws InterruptedException {
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.name("billCountry"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(country);
		System.out.println("billing country");
	}
}
