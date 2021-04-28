package com.app;

public abstract class PathPage {

	public abstract void goTo();
	
	public abstract String pathName();

	public boolean isAtPathPage(String pathName) {
		return pathName().equals(pathName);
	}
	
}
