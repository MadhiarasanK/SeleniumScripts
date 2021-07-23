package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClass.EditBaseClass;

public class EditDetails extends EditBaseClass{
	
//	public EditDetails(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		this.driver=driver;
//	}

	public EditDetails prioritySelection() throws InterruptedException {

	driver.findElement(By.xpath("//div[@class='actionBody']/div/div/following::div[6]/div/div[4]/div[1]/div/div/div/div/div[1]/div/div/a")).click();
	driver.findElement(By.xpath("//a[@title='Low']")).click();
	System.out.println("Priority Changed to Low");

	Thread.sleep(2000);
	return this;

	// Today=getCurrentday();
	}
	
	public EditDetails duedateSelection() {
	WebElement Duedate = driver.findElement(By.xpath("//input[@class='inputDate input']"));
	Duedate.click();

	WebElement TodaysDate = driver.findElement(By.xpath("//button[text()='Today']"));
	TodaysDate.click();
	System.out.println("Todays Date Selected");
	return this;
	}

//	WebElement datepicker = driver.findElement(By.xpath("//div[@class='scroller slds-datepicker']"));
//	datepicker.click();
//	
//	
//	List<WebElement> date = Duedate.findElements(By.tagName("td"));
//	for(WebElement Cell:date) {
//     if(Cell.getText().equals(Today)) {
//    	 Cell.click();
//    	 break;
//     }
    public VerifySubject clickSave() throws InterruptedException {
	driver.findElement(By.xpath("//button[@title='Save']")).click();

	Thread.sleep(5000);
	return new VerifySubject();
    }

}
