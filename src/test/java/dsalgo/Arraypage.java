package dsalgo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.ReadConfig;

public class Arraypage {
	
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//arraymodule
	By datastructure=By.xpath("//a[@class='nav-link dropdown-toggle']");
	public By arrays=By.xpath("//a[text()='Arrays']");
	public By arrayinpytonbtn=By.xpath("//a[@href='arrays-in-python']");
	public By arrayinpyton_tryhere=By.xpath("//a[@href='/tryEditor']");
	public By pythoneditor=By.xpath("//div[@class='CodeMirror-lines']");
	public By pytontextarea=By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	public By pythonrun=By.xpath("//button[@onclick='runit()']");
	//arrayusinglist
	public By arrayusinglist=By.xpath("//a[@href='arrays-using-list']");
	public By arraylisttryhere=By.xpath("//a[@href='/tryEditor']");
	public By arraylisteditor=By.xpath("//pre[@class=' CodeMirror-line ']");
	public By listtextarea=By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	public By listrun=By.xpath("//button[@onclick='runit()']");
	//basicoperation
	public By basicoperation=By.xpath("//a[@href='basic-operations-in-lists']");
	public By basictry=By.xpath("//a[@href='/tryEditor']");
	public By basic_editor=By.xpath("//pre[@class=' CodeMirror-line ']");
	public By basic_textarea=By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	public By basic_run=By.xpath("//button[@onclick='runit()']");
	//applicationofarray
	public By app_ofarray=By.xpath("//a[@href='applications-of-array']");
	public By app_try=By.xpath("//a[@href='/tryEditor']");
	public By app_editor=By.xpath("//pre[@class=' CodeMirror-line ']");
	public By app_textarea=By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	public By app_run=By.xpath("//button[@onclick='runit()']");//practicequestion
	public By  practicequestion_array=By.xpath("//a[text()='Practice Questions']");
	By numpyninja=By.xpath("//a[text()='NumpyNinja']");
	By getstarted=By.xpath("//button[text()='Get Started']");
	
	String home="https://dsportalapp.herokuapp.com/home";
	private WebDriver driver;


public Arraypage(WebDriver driver )
{
	this.driver=driver;
	
}
public  void Arraybtn()throws Exception {
	//driver.findElement(getstarted).click();
	//driver.findElement(signin).click();
	//driver.findElement(username).sendKeys("uagavi123");
	//driver.findElement(passwordforlogin).sendKeys("Password123!");
	//driver.findElement(login).click();
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(900,0)");	
	
	driver.findElement(datastructure).click();
	driver.findElement(arrays).click();
	driver.findElement(arrayinpytonbtn).click();
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0,900)");
	tryhere();
	Thread.sleep(1000);
	

driver.navigate().back();
	//driver.findElement(datastructure).click();
	//driver.findElement(arrays).click();
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0,400)");
	driver.findElement(arrayusinglist).click();
	//js.executeScript("window.scrollBy(0,400)");
	tryhere();
	Thread.sleep(1000);


	driver.navigate().back();
	driver.findElement(datastructure).click();
	driver.findElement(arrays).click();
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0,400)");
	driver.findElement(basicoperation).click();
	//js.executeScript("window.scrollBy(0,900)");
	tryhere();//same
	Thread.sleep(1000);


	driver.navigate().back();
	driver.findElement(datastructure).click();
	driver.findElement(arrays).click();
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0,400)");
	driver.findElement(app_ofarray).click();
	tryhere();
	Thread.sleep(1000);
	driver.navigate().back();
	driver.findElement(numpyninja).click();
	driver.findElement(getstarted).click();
	
}
public void tryhere() throws Exception {
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
	//@BeforeMethod	
	/*public void setupTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\general\\eclipse-workspace\\dsalgoproject\\src\\test\\resources\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(getstarted).click();
		driver.findElement(signin).click();
		driver.findElement(username).sendKeys("uagavi123");
		driver.findElement(passwordforlogin).sendKeys("Password123!");
		driver.findElement(login).click();

}*/
