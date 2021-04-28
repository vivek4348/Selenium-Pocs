package com.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class JavaPathPage extends PathPage {

	@FindBy(how = How.CSS, using = ".large-7 > h1:nth-child(2)")
	WebElement pageElement;
	
	@Override
	public void goTo() {
		Browser.driver.findElement(By.xpath("//div[@id='pathContent']/div[59]/a/div/div[2]")).click();
	}

	@Override
	public String pathName() {
		return pageElement.getText();
	}

}
