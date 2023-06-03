package com.Maven_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Maven_Sakthi.BaseClass_32;

public class LoginPage extends BaseClass_32 {

	public  WebDriver driver;
	
	@FindBy(xpath ="// button[text()=\"Sign in\"]")
	private WebElement signin;
	
	@FindBy(xpath = "//button[text()=\"Sign in with Mobile / Email\"]")
	private WebElement signinmobile;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[1]/div/div[2]/div/section/div/form/div[1]/div/input")	
	private WebElement email;
	
	@FindBy(id ="submitVerification ")
	private WebElement proceed;
	
	@FindBy(id="otpField")
	private WebElement sendotp;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[1]/div/div[2]/div/section/div/div[2]/div[2]/form/button")
	private WebElement verify;
	
	
	
	public  WebDriver getDriver() {
		return driver;
	}
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getSigninmobile() {
		return signinmobile;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getSendotp() {
		return sendotp;
	}

	public WebElement getVerify() {
		return verify;
	}
	
	@FindBy (xpath="//a[text()=\"appliances\"]")
	private WebElement appliances;
	
	@FindBy(xpath= "//a[text()=' Straighteners']")
	private WebElement  Straighteners;
	
	@FindBy(xpath="//div[text()=\"PHILIPS BHS397/40 Kerashine Titanium Straightener With SilkP...\"]")
	private WebElement philipsstraightener;
	
	@FindBy(xpath="(//span[text()=\"Add to Bag\"])[1]")
	private WebElement addtobag;
	
	@FindBy(xpath="//span[@class=\"cart-count\"]")
	private WebElement bag;
	
	@FindBy(xpath="//div[@class=\"css-15vhhhd e25lf6d4\"]")
	private WebElement proceedbuy;
	
	@FindBy (xpath="//button[text()=\"Deliver here\"]")
	private WebElement deliver;
	
	@FindBy (xpath="//p[text()=\"Cash on delivery\"]")
	private WebElement cashondelivery;
	
	public WebElement getAppliances() {
		return appliances;
	}
	public WebElement getStraighteners() {
		return Straighteners;
	}
	public WebElement getPhilipsstraightener() {
		return philipsstraightener;
	}
	public WebElement getAddtobag() {
		return addtobag;
	}
	public WebElement getBag() {
		return bag;
	}
	public WebElement getProceedbuy() {
		return proceedbuy;
	}
	public WebElement getDeliver() {
		return deliver;
	}
	public WebElement getCashondelivery() {
		return cashondelivery;
	} 
	public LoginPage(WebDriver d) {
		driver = d;
		
		PageFactory.initElements(driver, this);
	}

	

}










