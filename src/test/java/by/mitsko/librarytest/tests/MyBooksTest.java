package by.mitsko.librarytest.tests;

import org.testng.annotations.Test;

import by.mitsko.librarytest.steps.Steps;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class MyBooksTest {

	private Steps st = new Steps();
	private WebDriver driver;
	
  @Test
  public void myBooks() throws InterruptedException {
	  
	  st.logInLibrary("boby", "qwer");
	  st.myBooks();
	  Assert.assertEquals(st.header(), "Book catalog");
	 
	  
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