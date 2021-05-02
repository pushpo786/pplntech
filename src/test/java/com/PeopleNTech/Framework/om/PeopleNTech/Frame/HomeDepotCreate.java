package com.PeopleNTech.Framework.om.PeopleNTech.Frame;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class HomeDepotCreate extends Usability{
  @Test
  public void f() throws InterruptedException {
	  Home home=new Home(driver);
	  CreateAnAccount Create=new CreateAnAccount(driver);
	  home.MyAccountClicking();
	  Thread.sleep(6000);
	  home.RegistrationButtonClick();
	Create.CreateAnAccountButtonClick();
	Thread.sleep(10000);
    Create.EmailFieldSendkeys("maria@gmail.com");
    Create.PsswdSendkeys("mari");
    Create.ZipcodeEnter("12345");
    Create.PhoneNumberEnter("1234567");
    Create.SignedOfClick();
    Create.Mobiles();
    Create.CreateButtonClick();
	  
	  
	  
  }
 
 
  }


