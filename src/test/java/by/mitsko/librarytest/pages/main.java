package by.mitsko.librarytest.pages;

import org.openqa.selenium.WebDriver;

import by.mitsko.librarytest.steps.Steps;

public class main {
	private WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Steps st  = new Steps();
		
		st.initBrowser();
		st.logInLibrary("boby", "qwer");
		st.logOut();
		
		//st.showBooks();
	}

}
