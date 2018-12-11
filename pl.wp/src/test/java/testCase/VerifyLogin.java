package testCase;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LoginPage;

public class VerifyLogin {


	
	@Test
	public void verifyValidLogin() {
		 WebDriver driver=new ChromeDriver();
		 System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		 driver.get("https://profil.wp.pl/login.html?zaloguj=poczta");
		LoginPage login = new LoginPage(driver);
		login.typeUserName("testystudent1");
		login.typePassword("alamakota");
		
		login.clickBtnSubmit();	
	}
}
