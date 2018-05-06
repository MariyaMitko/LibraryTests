package by.mitsko.librarytest.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class MainPage extends AbstractPage{
	
private final Logger logger = LogManager.getRootLogger();

private final String BASE_URL = "http://node51579-env-1995265.mycloud.by/";

	
	public MainPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	
	@Override
	public void openPage()
	{
		driver.navigate().to(BASE_URL);
		logger.info("Main page opened");
	}

	
	  

}
