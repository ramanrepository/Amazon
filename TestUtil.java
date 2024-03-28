package com.amazon.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.amazon.qa.base.TestBase;

public class TestUtil extends TestBase{
    public  static long PAGE_LOAD_TIMEOUT = 20;
     public static long IMPLICIT_WAIT =10;

     
     public void switchToFrame() {
    	 driver.switchTo().frame("HomePage");
     }
     
     
public static void takeScreenshot(String fileName) throws IOException{

	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	FileUtils.copyFile(src, 
			new File("C:\\Users\\raman\\git\\repository\\Amazon\\Screenshots" + fileName +".png"));

}}