package by.mitsko.librarytest.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage{
	
	private final Logger logger = LogManager.getRootLogger();
	private final String BASE_URL = "http://node51579-env-1995265.mycloud.by/login.jsp";
	
	@FindBy(name = "login")
	private WebElement inputLogin;

	@FindBy(name = "password")
	private WebElement inputPassword;

	@FindBy(xpath = "//*[@id='login_form']/button")
	private WebElement buttonSubmit;
	
	

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
		
	}

	@Override
	public void openPage() {
		driver.navigate().to(BASE_URL);
		logger.info("Login page opened");
		
	}

	public void logIn(String username, String password)
	{
		inputLogin.sendKeys(username);
		inputPassword.sendKeys(password);
		buttonSubmit.click();
		logger.info("Login performed");
	}
	
	
}
