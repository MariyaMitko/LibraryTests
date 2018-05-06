package by.mitsko.librarytest.tests;

import org.testng.annotations.Test;
import by.mitsko.librarytest.steps.Steps;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class ShowBooksTest {
	
	private Steps st = new Steps();
	private WebDriver driver;
	
  @Test
  public void showBooks() throws InterruptedException {
	  
	  st.logInLibrary("boby", "qwer");
	  st.showBooks();
	  Assert.assertEquals(st.header(), "Show books");
	 
	  
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