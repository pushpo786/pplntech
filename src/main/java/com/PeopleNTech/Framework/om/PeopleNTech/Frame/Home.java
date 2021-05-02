package com.PeopleNTech.Framework.om.PeopleNTech.Frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
public WebDriver driver;
@FindBy(xpath="//*[text()='My Account']")
WebElement MyAccountclick;
@FindBy(xpath="//*[text()='Register']")
WebElement Registration;
public Home(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
public void MyAccountClicking() {
	MyAccountclick.click();
}
public void RegistrationButtonClick() {
	Registration.click();
}
}
