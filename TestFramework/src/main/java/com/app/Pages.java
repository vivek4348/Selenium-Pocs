package com.app;

import org.openqa.selenium.support.PageFactory;

public class Pages {

	public static HomePage homePage() {
		HomePage homePage = new HomePage();
		
		return homePage;
	}

	public static PathPages pathPages() {
		PathPages pathPages = new PathPages();
		return pathPages;
	}

	public static PathPage javaPathPage() {
		PathPage javaPathPage = new JavaPathPage();
		PageFactory.initElements(Browser.driver, javaPathPage);
		return javaPathPage;
	}
	
}
