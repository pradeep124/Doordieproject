package com.pages;

import org.openqa.selenium.By;

import com.basedriver.Basedriver;

public class Loginclass extends Basedriver {

	public void username(String username) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("userName")).sendKeys(username);
		System.out.println("print username");
}
	public void password(String password) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys(password);
		System.out.println("print password");
	}
	public void clicklogin() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		System.out.println("click on login");
	}
}
