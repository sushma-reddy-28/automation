package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.ClickAction;

import com.objectrepo.LandingPageProp;
import com.utils.WebDriverUtils;

public class LandingPage extends WebDriverUtils implements LandingPageProp {

	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}

	public SigninPage clickSigninIn() {
	click(signLocator);
	return new SigninPage(driver);
	}

}
