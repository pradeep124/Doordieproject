package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.basedriver.Basedriver;

public class Deliveryclass extends Basedriver{

	public void deliveryadress(String adress) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("delAddress1")).clear();
		driver.findElement(By.name("delAddress1")).sendKeys(adress);
		System.out.println("print del adress");
	}
	public void deliverycity(String city) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("delCity")).clear();
		driver.findElement(By.name("delCity")).sendKeys(city);
		System.out.println("print city name");
	}
	public void deliverystate(String state) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("delState")).clear();
		driver.findElement(By.name("delState")).sendKeys(state);
		System.out.println("print state name");
	}
	public void deliverypostalcode(String postalcode) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("delZip")).clear();
		driver.findElement(By.name("delZip")).sendKeys(postalcode);
		System.out.println("print postalcode");
	}
	public void deliverycountry(String country) throws InterruptedException {
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.name("delCountry"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(country);
		System.out.println("print country");
	}
	public void clicksecurepurchase() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("buyFlights")).click();
		System.out.println("click on flights");
	}
	public void clicklogout() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img"))
				.click();
		
	}
}
