package com.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleStepDef {
	WebDriver driver;
	@Given("^user launch browser$")
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jars\\chrome\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	
	
	@When("^user enter url$")
	public void enterURL() {
		driver.get("http://automationpractice.com/index.php");
		
	}
	
	
	@And("^user click on signin link$")
	public void clickSignin() {
		driver.findElement(By.xpath("//a[@class='login']")).click();
	}
	
	@And("^user enter email address$")
	public void enterEmailAddrss() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("email_create")).sendKeys("chggov@hk.com");
	}
	
	@Then("^user should see account page$")
	public void verifyAccuntPage() {
		Assert.assertTrue(driver.findElement(By.id("email_create")).isDisplayed());
	}
	

@When("^user click on create account button$")
public void user_click_on_create_account_button() throws Throwable {
 
	driver.findElement(By.id("SubmitCreate")).click();
}


@Then("^user should see create account page$")
public void user_should_see_create_account_page() throws Throwable {
    Assert.assertTrue(true);
}


}
