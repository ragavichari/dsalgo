package dsalgo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class registrationpage   {
	
	 By register=By.xpath("//a[@href='/register']");
	 By registersubmit=By.xpath("//input[@type='submit']");
	 By username=By.xpath("//input[@name='username']");
	 By password=By.xpath("//input[@name='password1']");
	 By passconfirm=By.xpath("//input[@name='password2']");
	By signin=By.xpath("//a[text()='Sign in']");
	public WebDriver driver;

 public registrationpage (WebDriver driver)
{
	this.driver=driver;
	
}
public void registersubmitbtn() throws InterruptedException {
	
	driver.findElement(register).click();
	driver.findElement(registersubmit).click();
	Thread.sleep(1000);
	String missingfield=driver.findElement(By.xpath("//form[@method='post']")).getText();
	System.out.println("alert1:" +missingfield);
}
public void registerusername() throws InterruptedException {
	driver.findElement(register).click();
	driver.findElement(username).sendKeys("$&^*&&&#");
	driver.findElement(registersubmit).click();
	Thread.sleep(1000);
	String alert2=driver.findElement(By.xpath("//input[@name='password1']")).getText();
	System.out.println("please fill the form:" +alert2);
}

public void registerpassword() throws InterruptedException {
	driver.findElement(register).click();
	driver.findElement(username).sendKeys("$&^*&&&#");
	driver.findElement(password).sendKeys("apple123");
	driver.findElement(registersubmit).click();
	Thread.sleep(1000);
	String alert3=driver.findElement(By.xpath("//input[@name='password2']")).getText();
	System.out.println("please fill out the form:" +alert3);
}

public void register_validname() throws InterruptedException {
	
	
	driver.findElement(register).click();
	driver.findElement(username).sendKeys("$&^*&&&#");
	driver.findElement(password).sendKeys("apple123");
	driver.findElement(passconfirm).sendKeys("apple123");
	driver.findElement(registersubmit).click();
	Thread.sleep(1000);
	String alert4=driver.findElement(By.xpath("//div[@class='alert alert-primary']")).getText();
	System.out.println("please enter valid username:" +alert4);
	
}


public void pwd_mismatch() throws InterruptedException
{
	driver.findElement(register).click();
	driver.findElement(username).sendKeys("ragavi");
	driver.findElement(password).sendKeys("apple123");
	driver.findElement(passconfirm).sendKeys("apple124");
	driver.findElement(registersubmit).click();
	Thread.sleep(1000);
	String alert5=driver.findElement(By.xpath("//div[@class='alert alert-primary']")).getText();
	System.out.println("password missmatch:" +alert5);
	}
//change username
public void account_creation() throws InterruptedException {
	driver.findElement(register).click();
	driver.findElement(username).sendKeys("mbagavi123");
	driver.findElement(password).sendKeys("Password123!");
	driver.findElement(passconfirm).sendKeys("Password123!");
	driver.findElement(registersubmit).click();
	Thread.sleep(1000);
	String alert7=driver.findElement(By.xpath("//div[@class='alert alert-primary']")).getText();
	System.out.println("Account created:" +alert7);
}
}