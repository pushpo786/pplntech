package com.PeopleNTech.Framework.om.PeopleNTech.Frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAccount {
   public WebDriver driver;
@FindBy(xpath="(//*[text()='Select & Continue'])[1]")
WebElement CreateAnAccountButton;
@FindBy(name="email")
WebElement EmailFieldEnter;
@FindBy(name = "password")
WebElement Psswd;
@FindBy(name="zipcode")
WebElement ZipCodeFields;
@FindBy(name="phone")
WebElement PhoneNumberEnter;
@FindBy(xpath="(//*[@class='checkbox-btn__label-test u__text-align--left'])[1]")
WebElement signed;
@FindBy(xpath="(//*[@class='checkbox-btn__label-test u__text-align--left'])[2]")
WebElement mobiles;
@FindBy(xpath="(//*[text()='Create an Account'])[2]")
WebElement Create;
public CreateAnAccount(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void CreateAnAccountButtonClick() {
	CreateAnAccountButton.click();
}
public void EmailFieldSendkeys(String email) {
	EmailFieldEnter.sendKeys(email);
}
public void PsswdSendkeys(String name) {
	Psswd.sendKeys(name);
}
public void ZipcodeEnter(String zipcode) {
	ZipCodeFields.sendKeys(zipcode);
}
public void PhoneNumberEnter(String phone) {
	PhoneNumberEnter.sendKeys(phone);
}
public void SignedOfClick() {
	signed.click();
}
public void Mobiles() {
	mobiles.click();
}
public void CreateButtonClick() {
	Create.click();
}
}
