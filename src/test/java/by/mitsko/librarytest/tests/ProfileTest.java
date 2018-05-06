package by.mitsko.librarytest.tests;

import org.testng.annotations.Test;

import by.mitsko.librarytest.steps.Steps;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class ProfileTest {

	private Steps st = new Steps();
	private WebDriver driver;
	
  @Test
  public void profile() throws InterruptedException {
	  
	  st.logInLibrary("boby", "qwer");
	  st.profile();
	  Assert.assertEquals(st.header(), "Hello, boby");
	 
	  
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