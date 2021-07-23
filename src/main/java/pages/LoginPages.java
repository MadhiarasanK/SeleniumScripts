package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClass.EditBaseClass;

public class LoginPages extends EditBaseClass {
	
//	public LoginPages(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		this.driver=driver;	
//	}


	public LoginPages userName(String uname) {
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys(uname);
		return this;
	}

	public LoginPages password(String pword) {
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(pword);
		return this;
	}

	public TogglePage login() throws InterruptedException {
		WebElement Login = driver.findElement(By.id("Login"));
		Login.click();
		System.out.println("Login should be successful");

		Thread.sleep(10000);
		return new TogglePage();
	}

}
