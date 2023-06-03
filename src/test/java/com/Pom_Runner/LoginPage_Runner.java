
package com.Pom_Runner;

import java.util.Scanner;
import org.apache.commons.collections4.Get;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.Maven_Sakthi.BaseClass_32;
import com.Maven_pom.LoginPage;

public class LoginPage_Runner extends BaseClass_32 {
	
	public static LoginPage dri;
	public static void main(String[]agrs) {
		browserLaunch("Chrome");
		driver = new ChromeDriver();
		getURL("https://www.nykaa.com/");
		System.out.println("browser");
//		BaseClass_32 base = new BaseClass_32();
		
//		LoginPage page = new LoginPage(driver);
	}
	
	public static void signIn() {
	
		click(dri.getSignin());
		System.out.println("signin");
		
		click(dri.getSigninmobile());
		System.out.println("mobile no:");
		
		sendKeys(dri.getEmail(), "6385042039");
		
		click(dri.getProceed());
		
		click(dri.getSendotp());
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the otp");
		String otp = scan.nextLine();
		sendKeys(dri.getSendotp(),otp);
		
		ClickOnElement(dri.getVerify());
		scan.close();
	}
	
	public static void addtobag() {
		
		actions(dri.getAppliances(),"moveToElement");
		
		
		
	}
	
	

}

	
		
	

