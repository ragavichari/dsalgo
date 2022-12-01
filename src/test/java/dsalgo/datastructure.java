package dsalgo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.ReadConfig;

public class datastructure   {
	public WebDriver driver;
	//datastructuremodule
	public By arrays=By.xpath("//a[text()='Arrays']");
	By datastructuregetstartedbtn=By.xpath("//a[@href='data-structures-introduction']");
	public By timecomplexity=By.xpath("//a[@href='time-complexity']");
	By practicequestion=By.xpath("//a[@href='/data-structures-introduction/practice']");
	By tryhere=By.xpath("//a[@href='/tryEditor']");
	By editor=By.xpath("//div[@class='CodeMirror-lines']");
	By datatextares=By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By run=By.xpath("//button[@onclick='runit()']");	
	By datastructure=By.xpath("//a[@class='nav-link dropdown-toggle']");
	By getstarted=By.xpath("//button[text()='Get Started']");
	By numpyninja=By.xpath("//a[text()='NumpyNinja']");
	//public By arrays=By.xpath("//a[text()='Arrays']");
	public By arrayinpytonbtn=By.xpath("//a[@href='arrays-in-python']");
	public By arrayinpyton_tryhere=By.xpath("//a[@href='/tryEditor']");
	public By pythoneditor=By.xpath("//div[@class='CodeMirror-lines']");
	public By pytontextarea=By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	public By pythonrun=By.xpath("//button[@onclick='runit()']");

	String home="https://dsportalapp.herokuapp.com/home";
	//public WebElement Run;
public datastructure(WebDriver driver )
{
	this.driver=driver;
	
}
/*public void home_datastructureintropage() throws InterruptedException {
		
		
			driver.findElement(datastructuregetstartedbtn).click();
			JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(timecomplexity).click();
		driver.findElement(practicequestion).click();
				driver.navigate().back();
		*/		
				
				
				
	//}

	
	//@Test(priority=1)
	public void datastructureintropage() throws Exception {
		
		//driver.findElement(getstarted).click();
		driver.findElement(datastructuregetstartedbtn).click();
		//driver.findElement(datastructure).click();
		//JavascriptExecutor js1=(JavascriptExecutor)driver;
	//js1.executeScript("window.scrollBy(0,300)");
	driver.findElement(timecomplexity).click();
	
			tryhere1();
		Thread.sleep(1000);
		//driver.navigate().back();
		
	
}
	public void tryhere1() throws Exception {
		driver.findElement(arrayinpyton_tryhere).click();
		 driver.findElement(pythoneditor).click();
		 ReadConfig red=new ReadConfig();
		 String cv=red.getpythoncode();
		 driver.findElement(pytontextarea).sendKeys(cv);
		driver.findElement(pythonrun).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		
	}
	
}

	

