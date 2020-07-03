package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.basedriver.Basedriver;

public class Flightdetailsclass  extends Basedriver{

	public void departfrom(String location) throws InterruptedException {
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.name("fromPort"));
		Select departfrom=new Select(ele);
		departfrom.selectByVisibleText(location);
		System.err.println("arrival port");
		Reporter.log("print passengers :"+location);
	}
	public void arriveto(String location) throws InterruptedException {
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.name("toPort"));
		Select arriveto=new Select(ele);
		arriveto.selectByVisibleText(location);
		System.out.println("destination port");
		Reporter.log("print location :"+location);
	}
	public void fromdate(String date) throws InterruptedException {
		Thread.sleep(3000);
		WebElement ele =driver.findElement(By.name("fromMonth"));
		Select fromdate=new Select(ele);
		fromdate.selectByVisibleText(date);
		System.out.println("print from date");
		Reporter.log("print from date :"+date);	
		
	}
	public void todate(String date) throws InterruptedException {
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.name("toMonth"));
		Select todate=new Select(ele);
		todate.selectByVisibleText(date);
		System.out.println("print to date");
		Reporter.log("print todate :"+date);
	}
	public void clickcontinue() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("findFlights")).click();
		System.out.println("click on flights");
		Reporter.log("click on flights");
		
	}
	public void clickreserveFlightcontinue() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("reserveFlights")).click();
		System.out.println("click on reserve flights");
		Reporter.log("click on reserve flights");
		}
	
	
}
