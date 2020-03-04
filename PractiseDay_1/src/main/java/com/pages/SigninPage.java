package com.pages;

import org.openqa.selenium.WebDriver;

import com.objectrepo.SigninPageProp;
import com.utils.WebDriverUtils;

public class SigninPage extends WebDriverUtils implements SigninPageProp {

	WebDriver driver;
	public SigninPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	public void enterEmailAddrss(String emailAddress) {
		enterText(emailLocator, emailAddress);
		
		
	}
	
	public void enterPassword(String password) {
		enterText(passwordLocator, password);
	}
	
	public HomePage clickOnSignin() {
		click(signinLocator);
		return new HomePage(driver);
	}
}
