package dsalgo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.qameta.allure.Allure;
import utility.screenshot_utility;

public class loginpag {
	public WebDriver driver;
	By username=By.xpath("//input[@name='username']");
	By passwordforlogin=By.xpath("//input[@name='password']");
	By login=By.xpath("//input[@value='Login']");
	By signin=By.xpath("//a[text()='Sign in']");
	By signout=By.xpath("//a[text()='Sign out']");
	By getstarted=By.xpath("//button[text()='Get Started']");
	

	public loginpag(WebDriver driver )
	{
		this.driver=driver;
		
	}
	public void logintest(String user,String pass,String result) throws InterruptedException {
		driver.findElement(signin).click();
		driver.findElement(username).sendKeys(user);
		driver.findElement(passwordforlogin).sendKeys(pass);
		driver.findElement(login).click();
	}
	public void log1() {
	driver.findElement(signin).click();
	driver.findElement(username).sendKeys("ragavi0");
	driver.findElement(passwordforlogin).sendKeys("123");
	driver.findElement(login).click();
	
}
	public void log() {
		driver.findElement(signin).click();
		driver.findElement(username).sendKeys("uagavi123");
		driver.findElement(passwordforlogin).sendKeys("Password123!");
		driver.findElement(login).click();
	}
public void getcredential(String usercre,String passcre) {
	driver.findElement(username).sendKeys(usercre);
	driver.findElement(passwordforlogin).sendKeys(passcre);
}
	public void clicklogin() {
		driver.findElement(signin).click();
	}
	public void Test() throws IOException, InterruptedException {
		driver.findElement(signin).click();
		driver.findElement(username).sendKeys("ragavi0");
		driver.findElement(passwordforlogin).sendKeys("123");
		driver.findElement(login).click();
		Thread.sleep(1000);
		//Allure.description("");
screenshot_utility.capturescreenshot(driver, "0");
		//capturescreenshot(driver, "32");
//Assert.assertTrue(false);
		//capturescreenshot(driver, "Typeuname");
		driver.close();
		Assert.assertTrue(false);
	}
	
}