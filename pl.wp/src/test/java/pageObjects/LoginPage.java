package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	WebDriver driver = new ChromeDriver();
	
	By loginLabel=By.id("login");
	By passwordLabel=By.id("password");
	By submitBtn=By.id("btnSubmit");
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void typeUserName(String username)
	{
		driver.findElement(loginLabel).sendKeys(username);
	}
	public void typePassword(String password)
	{
		driver.findElement(passwordLabel).sendKeys(password);
	}
	public void clickBtnSubmit()
	{
		driver.findElement(submitBtn).click();
	}

}
