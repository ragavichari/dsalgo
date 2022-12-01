package dsalgo;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.qameta.allure.Allure;
import utility.screenshot_utility;



public class homepage  {
	static //private static final String Stri = null;
	public WebDriver driver;
	
	public String URL="https://dsportalapp.herokuapp.com/";
	By getstarted=By.xpath("//button[text()='Get Started']");
	By datastructure=By.xpath("//a[@class='nav-link dropdown-toggle']");
	By datastructuregetstartedbtn=By.xpath("//a[@href='data-structures-introduction']");
	By signin=By.xpath("//a[text()='Sign in']");
	
	public homepage(WebDriver driver )
	{
		this.driver=driver;
		
	}
	public void started() throws Exception
	{
		
		driver.findElement(getstarted).click();
	}
	public void verifydropdown() throws InterruptedException 
	{
			
					driver.findElement(datastructure).click();
			
	}
	public void verifyTitleTest()
	{
		String title=driver.getTitle();
	Assert.assertEquals(title,"NumpyNinja");	
	}
	public static void Test1()
	{
		String title=driver.getTitle();
		try {
			screenshot_utility.capturescreenshot(driver, "+");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	Assert.assertEquals(title,"NumpyNinja1");	
	}
	/*public static void takescreenshot(WebDriver driver)throws IOException{
		File screenshotAs=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Allure.addAttachment("Screenshot", FileUtils.openInputStream(screenshotAs));
	}*/

	/*public void setupTest()throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\general\\eclipse-workspace\\dsalgoproject\\src\\test\\resources\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(URL);
		driver.manage().window().maximize();
		//driver.findElement(getstarted).click();
		//driver.findElement(signin).click();
	}*/
	

/*@BeforeMethod	
	public void setupTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\general\\eclipse-workspace\\dsalgoproject\\src\\test\\resources\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(getstarted).click();

}
/*@Test(priority=1)
	public void verifyRegisterbutton()
{
	
	
	driver.findElement(register).click();
	driver.findElement(username).sendKeys("yagavi123");
	driver.findElement(password).sendKeys("Password123!");
	driver.findElement(passconfirm).sendKeys("Password123!");
	driver.findElement(registersubmit).click();
	String alert7=driver.findElement(By.xpath("//div[@class='alert alert-primary']")).getText();
	System.out.println("Account created:" +alert7);

	
}

	
@Test(priority=2)
public void signinbutton()
{
	//driver.findElement(getstarted).click();
	driver.findElement(signin).click();
		driver.findElement(username).sendKeys("uagavi123");
		driver.findElement(passwordforlogin).sendKeys("Password123!");
		driver.findElement(login).click();
		String alert11=driver.findElement(By.xpath("//div[@class='alert alert-primary']")).getText();
		System.out.println("you are logged in:" +alert11);//logged in
}

*/	
	//@Test(priority=1)
	//public void verifydropdown() throws InterruptedException
{
	//	driver.findElement(getstarted).click();
		//driver.findElement(signin).click();
		//driver.findElement(username).sendKeys("uagavi123");
		//driver.findElement(passwordforlogin).sendKeys("Password123!");
		//driver.findElement(datastructure).click();
		//driver.findElement(arrays).click();
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert alert-primary']")));
		
		//String alert=driver.findElement(By.xpath("//div[@class='alert alert-primary']")).getText();
		//System.out.println("alert:" + alert);
}
	/*@Test(priority=0)
	public void verifyTitleTest()
	{
		String title=driver.getTitle();
	Assert.assertEquals(title,"NumpyNinja");	
	}
	
	/*@Test
	public void Test() throws IOException {
		driver.findElement(signin).click();
		driver.findElement(username).sendKeys("ragavi0");
		driver.findElement(passwordforlogin).sendKeys("123");
		driver.findElement(login).click();
screenshot_utility.capturescreenshot(driver, "3");
		//capturescreenshot(driver, "32");
//Assert.assertTrue(false);
		//capturescreenshot(driver, "Typeuname");
		driver.close();
		Assert.assertTrue(false);
	}
	
	
		/*@Test
	public void verifyTitleTestfail() throws IOException
	{
		String title=driver.getTitle();
	Assert.assertEquals(title,"NumpyNinja13");
	screenshot_utility.capturescreenshot(driver, "123");
	driver.close();
			
	}*/
	


/*	public  void capturescreenshot(WebDriver driver,String screenshotName) throws IOException
	{
		
			TakesScreenshot ts=(TakesScreenshot)driver;
			File sourceFile=ts.getScreenshotAs(OutputType.FILE);
			File destinationFile= new File("C:\\Users\\general\\eclipse-workspace\\dsalgoproject\\screenshot\\"+ screenshotName +".png");
		                                 
			FileHandler.copy(sourceFile, destinationFile);
			System.out.println("screenshot taken");
		}
	*/	


	}

//@AfterMethod
//public void closeBrowser() {
	//driver.quit();
	


