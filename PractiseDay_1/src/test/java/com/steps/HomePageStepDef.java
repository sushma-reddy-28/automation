package com.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;




public class HomePageStepDef {
	
	Steps steps;
	public HomePageStepDef(Steps steps)
	{
		this.steps=steps;
	}
	@Then("user should see username on the top left corner in HomePage as{string}")
	public void verifyUserName(String AccountName)
	{
		System.out.println("expected :"+AccountName);
		System.out.println("actual 14786 :"+steps.homePage.getAccountName());
		Assert.assertEquals(AccountName, steps.homePage.getAccountName());
	}

}
