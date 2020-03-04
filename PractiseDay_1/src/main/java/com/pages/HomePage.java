package com.pages;

import org.openqa.selenium.WebDriver;

import com.objectrepo.HomePageProp;
import com.utils.WebDriverUtils;

public class HomePage extends WebDriverUtils implements HomePageProp {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}
	public String getAccountName()
	{
		return getTextValue(usernameLocator);
	}

}
