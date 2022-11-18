`1package org.base;

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

public class BaseClass {
	WebDriver driver;
public void browserconfigchrome() {
 WebDriverManager.chromedriver().setup();
  driver=new ChromeDriver();
}
public void OpenUrl(String Url) {
	driver.get(Url);
}

public void maximizeWindow() {
	driver.manage().window().maximize();
}
public WebElement locatebyid(String id) {
	WebElement element=driver.findElement(By.id(id));
	return element;
}
public WebElement locatebyname(String name) {
WebElement element=driver.findElement(By.name(name));
return element;
}
public void textinput(WebElement element,String value) {
	element.sendKeys(value);

}
public void click(WebElement element) {
	element.click();}
	

}
}





