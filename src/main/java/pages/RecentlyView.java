package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClass.EditBaseClass;

public class RecentlyView extends EditBaseClass{
	
//	public RecentlyView(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		this.driver=driver;
//	}
	public RecentlyView taskSelection() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;

	WebElement Tasks = driver.findElement(By.xpath("//span[text()='Tasks']"));

	js.executeScript("arguments[0].click();", Tasks);
//	Actions action = new Actions(driver);
//	action.moveToElement(Tasks).click().perform();
	// div[@class='none
	// navexStandardManager']/div[1]/one-appnav/div/div/div/following::one-app-nav-bar/nav/div/one-app-nav-bar-item-root[3]/a
	System.out.println("Task Selected");

	Thread.sleep(5000);
	return this;
	}
	public RecentlyView recentlyView() throws InterruptedException {
	driver.findElement(By.xpath("(//span[text()='Recently Viewed'])[1]")).click();
	//driver.findElement(By.xpath("//div[@class='oneConsoleObjectHome']/div/div[1]/div[1]/div[1]/div/div/div/h1/div/div/a")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("(//span[text()='Recently Viewed'])[3]")).click();
	return this;
	}
	
	public EditDetails editSelection() throws InterruptedException {
	Thread.sleep(5000);
	driver.findElement((By.xpath("//a[@title='Show 13 more actions']"))).click();

	Thread.sleep(2000);

	driver.findElement(By.xpath("//a[@title='Edit']")).click();
	System.out.println("Edit clicked successfully");

	Thread.sleep(5000);
	return new EditDetails();
	}

}
