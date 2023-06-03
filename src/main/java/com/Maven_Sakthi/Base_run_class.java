package com.Maven_Sakthi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base_run_class {

	
		//webelement.click();
		public static void clickonElement(WebElement element) {
			element.click();
		}
		//element.sendkeys("value");
		public static void inputElement(WebElement element,String value) {
			element.sendKeys(value);
		}
		
		//urllaunch
		public static void urllaunch(WebDriver driver,String value) {
			driver.get(value);
		}
		
	}
	
	
	
	

