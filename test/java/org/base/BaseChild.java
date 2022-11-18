package org.base;

import org.openqa.selenium.WebElement;

public class BaseChild extends BaseClass  {
public static void main(String[] args) {
	BaseChild b=new BaseChild();
	b.browserconfigchrome();
	b.OpenUrl("http://www.facebook.com");
	b.maximizeWindow();
	WebElement txtemail = b.locatebyid("email");
	b.textinput(txtemail,"arun@gmail.com");
	WebElement txtpass = b.locatebyid("pass");
	b.textinput(txtpass,"testing");
	WebElement btnlogin = b.locatebyname("login");
	b.click(btnlogin);
	
}
}

