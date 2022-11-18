package org.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenDay1 {
public static void main(String[] args) {
	//browser configuration
	WebDriverManager.chromedriver().setup();
	//WebDriverManager.irdriver().setup();
	//launch the browser
	WebDriver driver=new ChromeDriver();
	//to open url
	driver.get("https:/www.facebook.com");
	//window maximize
	driver.manage().window().maximize();
	
}
}
