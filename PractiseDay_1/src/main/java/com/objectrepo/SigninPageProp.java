package com.objectrepo;

import org.openqa.selenium.By;

public interface SigninPageProp {
	By emailLocator=By.id("j_username");
	By passwordLocator=By.id("j_password");
	By signinLocator= By.xpath("//span[text()='SIGN IN']");

}
