package htmlReporter;

import org.openqa.selenium.support.events.EventFiringWebDriver;

public abstract class HTMLReporter {

	private static final ThreadLocal<EventFiringWebDriver> localDriver = new ThreadLocal<EventFiringWebDriver>();
	
	public void setDriver(EventFiringWebDriver driver) {
		localDriver.set(driver);
	}
	
	public EventFiringWebDriver getDriver() {
		return localDriver.get();
	}
	
	
}
