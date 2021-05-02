package com.PeopleNTech.Framework.om.PeopleNTech.Frame;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class Ilisteners extends Usability implements ITestListener{
public org.apache.log4j.Logger lg=org.apache.log4j.Logger.getLogger(Ilisteners.class.getName());
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("started");
		PropertyConfigurator.configure("/Users/khadizapushpo/eclipse-workspace/om.PeopleNTech.Frame/target/log4j.properties");
		lg.info("Starting the test");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		Date dt=new Date();
		String sw=dt.toString().replace(" ", "_").replace(":", "_");
		this.driver=((Usability)result.getInstance()).driver;
		File ds=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(ds, new File("/Users/khadizapushpo/Downloads/passed/"+sw+"shots.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String Path=System.getProperty("user.dir");
		Date dt=new Date();
		String sw=dt.toString().replace(" ", "_").replace(":", "_");
		this.driver=((Usability)result.getInstance()).driver;
		File ds=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(ds, new File("/Users/khadizapushpo/Downloads/failed/"+sw+"shots.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
