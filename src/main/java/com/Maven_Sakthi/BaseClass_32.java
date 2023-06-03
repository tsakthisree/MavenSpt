package com.Maven_Sakthi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.management.openmbean.OpenMBeanAttributeInfo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass_32 {
	
	//Static WebDriver
	public static WebDriver driver;
	
//1	//driver launch
	public static WebDriver  browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+ "\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir")+"\\Web_Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir")+"\\Web_Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;
	}
//10	// Action Methods
	public static void actions(WebElement element,String option) {
		  
		Actions ac = new Actions(driver);
		if (option.equalsIgnoreCase("click")) {
			ac.click(element).build().perform();
			}
		else if(option.equalsIgnoreCase("movetoelement")) {
			ac.moveToElement(element).build().perform();
		}
		else if(option.equalsIgnoreCase("clickandhold")) {
			ac.clickAndHold(element).build().perform();
		}
		else if(option.equalsIgnoreCase("release")) {
			ac.release(element).perform();
		}
		else if(option.equalsIgnoreCase("contextclick")) {
			ac.contextClick(element).perform();
		}
		else if (option.equalsIgnoreCase("doubleclick")) {
			ac.doubleClick(element).perform();
		}
	}
	public static void dragAndDrop(WebElement element,WebElement element1,WebDriver driver) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(element, element1);
		}
	public static void moveToElement(String option,WebElement element,WebDriver driver) {
		Actions ac = new Actions(driver);
		 ac.moveToElement(element).perform();
	}
//31	//click
	public static void ClickOnElement(WebElement element) {
		element.click();
	}
	public static void click(WebElement element) {
		element.click();
	}
//27	//sendkeys
	 public static void inputElement(WebElement element,String value) {
		 element.sendKeys(value);
	 }
	 public static void sendKeys(WebElement element,String value) {
		 element.sendKeys(value);
	 }
	//find element with id and also pass send keys
	public static void findElementWithIDandSendKeys(String ID,String value) {
		driver.findElement(By.id(ID)).sendKeys(value);
	}
	//find element with IDand click
	public static void findElementWithIDandClick(String ID) {
		driver.findElement(By.id(ID)).click();
	}
	//javaScript Executor with value
	private void jsExecutorwithValue(String ID,String value) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("document.getElementById('"+ID+"').value= '"+value+"';");
	}
//21	//get URL
	public static void getURL(String URL) {
		driver.get(URL);
	}
	//current url
	public static void getUrl() {
	String currentUrl = driver.getCurrentUrl();
	System.out.println("CurrentUrl"+currentUrl);
	}
	public static void urlLaunch(String string) {
		driver.getCurrentUrl();
		
	}
	
//22  // get text	
	public static void gettext (WebElement element, String string) {
		String text = element.getText();
		System.out.println("Text Value is :"+ text);
	}
//20  //get title
	public static void getTitle(WebElement element) {
		String title = driver.getTitle();
		System.out.println("Title of the Webpage:" +title);
	}
//23 //get attribute
	public static void getAttribute(WebElement element, String string) {
		String attribute = element.getAttribute(string);
		System.out.println("Attribute Value is:" + attribute);
		}

	
//24	//Implicitly Wait
	public static void waitImolicitly() {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	}
	//maximize
	public static void windowaMaximize() {
		driver.manage().window().maximize();
	}
//4	//navigate to
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}
//2	//Close
	public static void close() {
		driver.close();
	}
//3	//Quit
	public static void quit() {
		driver.quit();
	}
//11	//Frame
	public static void frames(WebElement element) {
		driver.switchTo().frame(element);
	}
//9	//Alert
	public static void alertAccept() {
		driver.switchTo().alert().accept();
	}
	public static void alertDismiss() {
		driver.switchTo().alert().dismiss();
	}
	public static void alertPrompt(String string) {
		driver.switchTo().alert().sendKeys(string);
		driver.switchTo().alert().accept();
	}
	
//5,6,7	//Navigate Options
	public static void navigateOptions(String Option) {
		if(Option.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		}
		else if (Option.equalsIgnoreCase("back")) {
			driver.navigate().back();
		}
		else if (Option.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		}
	}   
//25	//Screen Shot
	public static void takeScreenShot(String imagename) throws IOException {
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\Screenshot\\"+imagename+".png"));
	}
//14	//Single DropDown
	public static void Dropdown(WebElement element, String option,String svalue) {
		
		Select s = new Select(element);
		if(option.equalsIgnoreCase("value")) {
			s.selectByValue(svalue);
		}
		else if (option.equalsIgnoreCase("visibleText")) {
			s.selectByVisibleText(svalue);
		}
		else if (option.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(svalue);
			s.selectByIndex(parseInt);
		}
	}
	//multi drop down 
	public static void multiple(WebElement element, String option, String mvalue) {
		Select s = new Select(element);
		if(option.equalsIgnoreCase("value")) {
			s.selectByValue(mvalue);
		}
		else if(option.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(mvalue);
		}
		else if (option.equalsIgnoreCase("text")) {
			int parseInt = Integer.parseInt(mvalue);
			s.selectByIndex(parseInt);
		}
	}
	
	
//16,17,18	//isEnable
	public static void ischeck(WebElement element, String option) {
		
		if (option.equalsIgnoreCase("enable")) {
			boolean enabled =element.isEnabled();
			System.out.println(enabled);
		}
		else if (option.equalsIgnoreCase("disable")) {
			boolean displayed = element.isDisplayed();
			System.out.println(displayed);
		}
		else if (option.equalsIgnoreCase("selected")) {
			boolean selected = element.isSelected();
			System.out.println(selected);
		}
	}
//13	//window handling
	public static void windowhandle(int windownum) {
		Set<String>windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
	
	//convert set to a list to get a particular window
	List<String> handles = new ArrayList<String>(windowHandles);
	System.out.println(handles);
	//window between window or alert and frames 
	driver.switchTo().window(handles.get(windownum));
	
	}
	
//26 //scroll
	public static void scroll(WebElement element ) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	public static void scrollup(WebElement element) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)"," ");
		Thread.sleep(3000);
	}
	public static void scrollClick(WebElement element ) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click;", element);
		Thread.sleep(3000);
	}
	
	//first option
	public static void getFirstOPtion(WebElement element) {
		Select s = new Select(element);
		WebElement firstoption = s.getFirstSelectedOption();
		System.out.println("First selected Option is :" + firstoption);
	}
	
	//robot 
	public static void robot (String option) throws AWTException {
		Robot r = new Robot();
		if (option.equalsIgnoreCase("Enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}else if (option.equalsIgnoreCase("caps lock")) {
			r.keyPress(KeyEvent.VK_CAPS_LOCK);
			r.keyRelease(KeyEvent.VK_CAPS_LOCK);
		}
		
	}
	
	//1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32  
	
}
