package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClass.EditBaseClass;

public class VerifySubject extends EditBaseClass {
	
//	public VerifySubject(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		this.driver=driver;
//	}

	public VerifySubject subjectName() {
	WebElement Subject = driver.findElement(By.xpath("(//span[@class='uiOutputText'])[72]"));
	// String SubjectName = Subject.getAttribute("Subject");
	Subject.getText();
	//System.out.println("Subject Name is " + Subject);
	return this;
}
}
