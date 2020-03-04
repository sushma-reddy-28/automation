package com.objectrepo;

import org.openqa.selenium.By;

public interface HomePageProp   {
	//By usernameLocator = By.xpath("(//span[@class='MuiButton-label']/div)[12]");
	//By usernameLocator = By.xpath("(//span[@class='MuiButton-label']/div[starts-with(@class, 'MuiBox-root jss')])[9]");
	By usernameLocator = By.xpath("//*[@id=\"__next\"]/div[1]/div/div[1]/div/div[2]/div/div/div[2]/div[1]/div/button/span[1]/div");
	

}
