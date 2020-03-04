package com.steps;

import org.openqa.selenium.WebDriver;

import com.basePage.TestBase;
import com.pages.LandingPage;
import com.utils.SetUp;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;



public class TestBaseStepDef {

	Steps steps;
	
	public TestBaseStepDef(Steps steps) {
	this.steps=steps;
	}
	
	@Given("^User Launch Browser$")
	public void user_Launch_Browser() {
		steps.testBase=new TestBase();
		
		steps.testBase.intilizeDriver();
	
	}

	@When("^Enter URL$")
	public void enter_Url() {
		steps.landingPage=steps.testBase.enterURL();
	}

}
