
import java.time.Duration;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditTaskinSales {

	static String Today;

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("cypress@testleaf.com");

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Selbootcamp@1234");

		WebElement Login = driver.findElement(By.id("Login"));
		Login.click();
		System.out.println("Login should be successful");

		Thread.sleep(10000);

		// TODO Auto-generated method stub
		//WebElement Toggle = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@aria-haspopup='dialog']")));
		WebElement Toggle = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		Toggle.click();
		System.out.println("Toggle clicked");

		Thread.sleep(5000);
		WebElement Viewall = driver.findElement(By.xpath("//button[@class='slds-button']"));
		Viewall.click();
		System.out.println("Viewall clicked");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		System.out.println("Sales Clicked");

		Thread.sleep(10000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Tasks = driver.findElement(By.xpath("//span[text()='Tasks']"));

		js.executeScript("arguments[0].click();", Tasks);
//		Actions action = new Actions(driver);
//		action.moveToElement(Tasks).click().perform();
		// div[@class='none
		// navexStandardManager']/div[1]/one-appnav/div/div/div/following::one-app-nav-bar/nav/div/one-app-nav-bar-item-root[3]/a
		System.out.println("Task Selected");

		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Recently Viewed'])[1]")).click();
		//driver.findElement(By.xpath("//div[@class='oneConsoleObjectHome']/div/div[1]/div[1]/div[1]/div/div/div/h1/div/div/a")).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("(//span[text()='Recently Viewed'])[3]")).click();

		driver.findElement((By.xpath("//a[@title='Show 13 more actions']"))).click();

		Thread.sleep(10000);

		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		System.out.println("Edit clicked successfully");

		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"//div[@class='actionBody']/div/div/following::div[6]/div/div[4]/div[1]/div/div/div/div/div[1]/div/div/a"))
				.click();
		driver.findElement(By.xpath("//a[@title='Low']")).click();
		System.out.println("Priority Changed to Low");

		Thread.sleep(2000);

		// Today=getCurrentday();

		WebElement Duedate = driver.findElement(By.xpath("//input[@class='inputDate input']"));
		Duedate.click();

		WebElement TodaysDate = driver.findElement(By.xpath("//button[text()='Today']"));
		TodaysDate.click();
		System.out.println("Todays Date Selected");

//		WebElement datepicker = driver.findElement(By.xpath("//div[@class='scroller slds-datepicker']"));
//		datepicker.click();
//		
//		
//		List<WebElement> date = Duedate.findElements(By.tagName("td"));
//		for(WebElement Cell:date) {
//         if(Cell.getText().equals(Today)) {
//        	 Cell.click();
//        	 break;
//         }

		driver.findElement(By.xpath("//button[@title='Save']")).click();

		Thread.sleep(5000);

		WebElement Subject = driver.findElement(By.xpath("(//span[@class='uiOutputText'])[72]"));
		// String SubjectName = Subject.getAttribute("Subject");
		Subject.getText();
		System.out.println("Subject Name is " + Subject);

//	private static String getCurrentday() {
//		// TODO Auto-generated method stub
//		
//		Calendar Obj1 = Calendar.getInstance(TimeZone.getDefault());
//		int i = Obj1.get(Calendar.DAY_OF_MONTH);
//		String string = Integer.toString(i);
//		return string;
//	}

	}
}
