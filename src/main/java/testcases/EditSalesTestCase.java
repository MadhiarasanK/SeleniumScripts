package testcases;

import org.testng.annotations.Test;

import baseClass.EditBaseClass;
import pages.LoginPages;

public class EditSalesTestCase extends EditBaseClass{
	
	
	@Test
	public void editSales() throws InterruptedException {
		new LoginPages()
		.userName("cypress@testleaf.com")
		.password("Selbootcamp@1234")
		.login()
		.toggleSelection()
		.viewallSelection()
		.salesSelection()
		.taskSelection()
		.recentlyView()
		.editSelection()
		.prioritySelection()
		.duedateSelection()
		.clickSave()
		.subjectName();
	}

}
