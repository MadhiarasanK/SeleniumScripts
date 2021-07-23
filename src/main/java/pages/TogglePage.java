package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClass.EditBaseClass;

public class TogglePage extends EditBaseClass {
	
//	public TogglePage(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		this.driver=driver;
//	}

	public TogglePage toggleSelection() throws InterruptedException {
	WebElement Toggle = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
	Toggle.click();
	System.out.println("Toggle clicked");
	Thread.sleep(5000);
	return this;
	}
	
	public TogglePage viewallSelection() throws InterruptedException {
	WebElement Viewall = driver.findElement(By.xpath("//button[@class='slds-button']"));
	Viewall.click();
	System.out.println("Viewall clicked");
	Thread.sleep(5000);
	return this;
	}

   public RecentlyView salesSelection() throws InterruptedException {
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
	System.out.println("Sales Clicked");

	Thread.sleep(5000);
	return new RecentlyView();
}

}
