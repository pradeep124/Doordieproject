package com.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.basedriver.Basedriver;

public class Setupclass extends Basedriver {
@BeforeTest

public void launchlogin() throws InterruptedException {
	launchurl();	
}
@AfterTest
public void closeTheBrowser() {
	driver.quit();	
}
@Test
public void samplemethod() {
	
}
}
