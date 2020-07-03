package com.basedriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basedriver {
	
public static WebDriver driver=null;

public static void waitelement() {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
public void launchurl() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(3000);
	System.out.println("print url");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	Thread.sleep(3000);
	System.out.println("launching the url");
	driver.get("http://newtours.demoaut.com/mercuryreservation.php");
}

public static  String getpdata(String value) throws IOException {
	
	Properties prop=new Properties();
	FileInputStream fi= new FileInputStream("C:\\Users\\Usha\\Desktop\\SelemiumTraining\\Doordieproject\\config.properties");
	prop.load(fi);
	String data=prop.getProperty(value);
	return data;
			
}

public void takeScreenshot(String name) throws IOException {
	// Snapshot
			// Case the driver to TakesScreenshot
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			// Copy the snapshot taken to physical dir
			FileUtils.copyFile(file, new File(".\\Screenshots\\" +name+".png"));
				
}

public static String getdata(String testcasename, int rownumber, int cellnumber) throws IOException {
	File path =new File(".//driver//Doordieexcel.xlsx");//preparing a file
	FileInputStream src = new FileInputStream(path);

	XSSFWorkbook wb = new XSSFWorkbook(src);
	XSSFSheet ws = wb.getSheet(testcasename);

	String data = ws.getRow(rownumber).getCell(cellnumber).getStringCellValue();
	return data;

}
}
