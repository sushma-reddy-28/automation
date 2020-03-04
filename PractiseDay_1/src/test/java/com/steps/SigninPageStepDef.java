package com.steps;

import org.openqa.selenium.WebDriver;

import com.pages.SigninPage;

import io.cucumber.java.en.And;




public class SigninPageStepDef {
	
	Steps steps;
	
	public SigninPageStepDef(Steps steps) {
		this.steps=steps;
	}

	@And("User Enter email in your email as {string}")
	public void enter_Email_Address(String emailAddress) {
		steps.signinPage.enterEmailAddrss(emailAddress);
		
	}
	

	@And("user enter password as {string}")
	public void enter_Password(String password){
		steps.signinPage.enterPassword(password);
		
	}
	
	@And("user click on Sign in")
	public void click_Signin() {
		steps.homePage=steps.signinPage.clickOnSignin();
	}
	
	
	
}
