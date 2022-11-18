package org.baseclass;

import java.awt.Robot;
import java.io.File;
import java.nio.file.Files;
import java.util.List;

import javax.swing.Action;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableBaseClass {
	WebDriver driver;
	//BASECLASS
	//1.GETURL
	public void gettitle(int title) {
	List<WebElement> driver;
	driver.get(title);
	}
	 //2.GERCURRENTURL
	public void getcurrenturl(String currenturl) {
		driver.getCurrentUrl(); 
	}
	//3.NAVIGATION LAUNCH BROWSER
	public void navigate(String url) {
		driver.navigate().to(url);
	}
	//4.NAVIGATE BACKWARD
	public void naviback() {
		driver.navigate().back();
	}
	//5.NAVIGATE FORWARD
	public void naviforward() {
	driver.navigate().forward();
	}
	//6.NAVIGATE REFRESH
	public void navirefresh() {
		driver.navigate().refresh();
	}
	//7.LOCATORBY CLASS
	public WebElement locatorbyclass(String value ) {
		WebElement element=driver.findElement(By.className(value));
		return element;
	}
	//8LOCATOR BY ID
	public WebElement locatorbyid(String value ) {
		WebElement element=driver.findElement(By.id(value));
		return element;
	}
	//9.LOCATOR BY NAME
	public WebElement locatorbyname(String name) {
		WebElement element=driver.findElement(By.id(name));
		return element;
	}

	//10.LOCATORBY xpath
	public WebElement findxpath() {
	WebElement element= driver.findElement(By.xpath("xpath expression"));
	return element;
	}
	//11.get the text from webpage
	public void gettext(WebElement element) {
		String text = element.getText();
	System.out.println(text);
	}
	//12.GETATTRIBUTES THE TEXT FROM WEBPAGE
	public void getattributes(WebElement element) {
		String text = element.getText();
	System.out.println(text);
	}
	//13.SENDKEYS
	public void sendkeys(WebElement element,String value) {
		element.sendKeys(value);
	}

	//14.MOUSEOVER ACTION
	public WebElement mouseover(WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
		return element;
	}
	//15.DRAG AND DROP
	public WebElement draganddrop(WebElement source,WebElement destination) {
		Actions ddp=new Actions(driver);
		ddp.dragAndDrop(source,destination).perform();
		return destination;
	}
	//16.RIGHT CLICK ACTION
	public WebElement mouserightclick(WebElement ref) {
		Actions r=new Actions(driver);
		r.contextClick(ref).perform();
		return ref;
	}
	//17.DOUBLECLICK action
		public void doubleclickaction() {
		Actions a=new Actions(driver);
		a.doubleClick();
		}

	//18.ALERT AND ACCEPT
	public void simplealert() {
		Alert al=driver.switchTo().alert();
		al.accept();
	}
	//19.ALERT AND DISMISS
	public void confirmalert() {
		Alert confirm=driver.switchTo().alert();
		confirm.accept();
		confirm.dismiss();
	}
	//20.ALERT AND SENDKEYS
	public void promptalert(String text) {
		Alert prompt=driver.switchTo().alert();
		prompt.sendKeys(text);
	    prompt.dismiss();
	}
	//21.TAKESCREENSHOT
	public WebElement takescreenshot(String path) throws Exception{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("path");
		FileUtils.copyFile(source,destination);
		return null;
	}
	//22.USING JAVASCRIPTEXECUTOR set and get value
	public WebElement javascript(WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("argument[0].setattributes('value','manju')",element);
	return element;
	}
	//23.GETATTRIBUTES
	public WebElement jsgetattributes(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].getattributes('value')",element);
		return element;
	}
	//24.CLICK JAVASCRIPTEXECUTOR
	public void jsclick(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].click()",element);
	}
	//25.FRAMESid
	public void frames(String id) {
		driver.switchTo().frame(id);
	}
	//26.FRAMESBYNAME
	public void framesbyname(String name) {
		driver.switchTo().frame(name);
	}
	//27.FRAMESBYVALUE
		public WebElement framebyvalue(WebElement element) {
			driver.switchTo().frame(element);
	return element;
		}
	//28. DROPDOWNBYINDEX
		public WebElement selectbyvalue(WebElement element,String txt) {
		Select s=new Select(element);
		s.selectByValue(txt);
		return element;
		}
	//29.SELET BY ID
		public void selectbyid(WebElement element,int index) {
			Select s=new Select(element);
			s.selectByIndex(index);
		}
	//30.selectbyvisible value
		public void selectbyvisiblevalue(WebElement element,String text) {
			Select s=new Select(element);
			s.selectByVisibleText(text);
		}
	//31.DESELECTALL
		public void deselectall(WebElement element) {
		Select s=new Select(element);
		s.deselectAll();
		}
	//32.DESELECTBYINDEX
	public void deselectbyindex(WebElement element,int index) {
			Select s=new Select(element);
			s.deselectByIndex(index);
		}
	//33.DESELECTBYVALUE
		public void deselectbyvalue(WebElement element,String value) {
			Select s=new Select(element);
			s.deselectByValue(value);
		}
	//34DESELECTBYVISIBLETEXT
		public void deselectbyvisibletext(WebElement element,String text) {
			Select s=new Select(element);
			s.deselectByVisibleText(text);
		}
	//35..launch browser navigate
		public void launchbrownavi(String url) {
	    driver.navigate().to(url);
		}
	//36.navigate forward
		public void naviagateforward() {
			driver.navigate().forward();
		}
	 //37.navigate backward
		public void navigatebackward() {
			driver.navigate().back();
		}
	//38.navigate refresh
	    public void navigaterefresh() {
			driver.navigate().refresh();
		}
	//39.PARENT FRAMES
		public void parentframes() {
		driver.switchTo().parentFrame();
		}
	//40.GETOPTIONS
		public void getoptions(WebElement element) {
			Select s=new Select(element);
	  List<WebElement>options=s.getOptions();
			for(int i=0;i<options.size();i++);
			options.get(i);
		}
	//41.GETFIRSTSELECTEDOPTIONS
		public void getfirstselectoption(WebElement element) {
			Select s=new Select(element);
			WebElement element1=s.getFirstSelectedOption();
			System.out.println(element1);

		}
	//42.JAVASCRIPT SCROLLDOWN
		public void jsscrolldown(WebElement element) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("argument[0].ScrollIntoView(true)",element);
		}
	//43.JAVASCRIPT SCROLLUP
		public void jsscrollup(WebElement element) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("argument[0].ScrollIntoView(false)",element);
		}
		
	//44.CLOSE CURRENT WINDOW
		public void closewindow() {
			driver.close();
		}
	//45.QUIT THE WINDOW
		public void quitwindow() {
			driver.quit();
		}
	//46.CLICK
		public void clickbtn(WebElement element){ 
		element.click();
		}
		//47.ISMULTIPLE
		public void ismultiple(WebElement element) {
			Select s=new Select(element);
			boolean b=s.isMultiple();
			return;
		}	

	}


