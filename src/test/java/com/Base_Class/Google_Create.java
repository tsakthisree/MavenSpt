package com.Base_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Maven_Sakthi.Base_run_class;


public class Google_Create extends Base_run_class{
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suren\\eclipse-workspace\\Maven_Sakthi\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		urllaunch(driver,"https://accounts.google.com/signup/v2/createaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("sakthi");
		
		WebElement surname = driver.findElement(By.id("lastName"));
		
		inputElement(surname,"suren");
		
		WebElement click =driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
		clickonElement(click);
		
		WebElement sign = driver.findElement(By.id ("accountDetailsNext"));
		
		clickonElement(sign);
	}
}





