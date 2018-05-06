package by.mitsko.librarytest.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.mitsko.librarytest.steps.Steps;

public class LogOutButtonTest {
	private Steps st = new Steps();
	private WebDriver driver;
	
	@Test
	public void LogOutButtonTest() throws InterruptedException {
		st.logInLibrary("boby", "qwer");
		st.logOut();
		Assert.assertEquals(st.startPage(), "http://node51579-env-1995265.mycloud.by/MainServlet?command=logout");
	}
	

	@BeforeClass
	public void beforeTest() {
		st.initBrowser();
	}

	@AfterClass
	public void afterTest() {
		st.closeDriver();
	}

}