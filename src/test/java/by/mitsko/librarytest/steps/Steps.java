package by.mitsko.librarytest.steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import by.mitsko.librarytest.driver.SingletonDriver;
import by.mitsko.librarytest.pages.LoginPage;


public class Steps {
	
	private WebDriver driver;

	private final Logger logger = LogManager.getRootLogger();
	
	public void initBrowser(){
		driver = SingletonDriver.getDriver();
	}

		
	public void closeDriver(){
		SingletonDriver.closeDriver();
	}

	public void logInLibrary(String username, String password) throws InterruptedException{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openPage();
		Thread.sleep(4000);
		loginPage.logIn(username, password);
		logger.info("User page is opened");
				
	}

	public void logOut() throws InterruptedException{
		Thread.sleep(4000);
		WebElement logOutButton = driver.findElement(By.xpath("//*[@id='bttLogout']"));
		logOutButton.click();
		logger.info("User was returned on the start page");
		
	}
	

	public void showBooks() throws InterruptedException{
		Thread.sleep(4000);
		WebElement showBooksButton = driver.findElement(By.xpath("//*[@id='AVAILABLEBOOKS']"));
		showBooksButton.click();
		
	}
	
	public void profile() throws InterruptedException{
		Thread.sleep(4000);
		WebElement profile = driver.findElement(By.xpath("//*[@id='PROFILE']"));
		profile.click();
		
	}
	
	public void myBooks() throws InterruptedException{
		Thread.sleep(4000);
		WebElement myBooks = driver.findElement(By.xpath("//*[@id='MYBOOKS']"));
		myBooks.click();
		
	}
	
	public void myBooksHistory() throws InterruptedException{
		Thread.sleep(4000);
		WebElement myBooksHistory = driver.findElement(By.xpath("//*[@id='history']"));
		myBooksHistory.click();
		
	}
		
	public String header() throws InterruptedException{
		Thread.sleep(4000);
		WebElement header = driver.findElement(By.xpath("//*[@id='header']"));
		String str = header.getText();
		return str;
	}
	
	public String startPage() throws InterruptedException{
		Thread.sleep(4000);
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public void pageElements() throws InterruptedException{
		
		
	}
	
	
}
