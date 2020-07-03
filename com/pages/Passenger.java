package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.basedriver.Basedriver;

public class Passenger extends Basedriver {

	public void firstname(String name) {
		driver.findElement(By.name("passFirst0")).sendKeys(name);
		System.out.println("print name");				
	}
	public void lastname(String lastname) {
		driver.findElement(By.name("passLast0")).sendKeys(lastname);
		System.out.println("print lastname");
	}
	public void mealoption(String mealtype) {
		WebElement ele=driver.findElement(By.name("pass.0.meal"));
		Select mealoption=new Select(ele);
		mealoption.selectByVisibleText(mealtype);
		System.out.println("mealtype");
	}
}
