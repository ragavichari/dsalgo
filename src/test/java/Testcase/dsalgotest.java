package Testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dsalgo.Arraypage;
import dsalgo.datastructure;
import dsalgo.homepage;
import dsalgo.loginpag;
import dsalgo.registrationpage;
import utility.screenshot_utility;

public class dsalgotest {

WebDriver driver;
String URL="https://dsportalapp.herokuapp.com/";
homepage homepag;
loginpag loging;
registrationpage regis;
Arraypage array;
datastructure datastr;
@BeforeMethod
public void setupTest()throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\general\\eclipse-workspace\\dsalgoproject\\src\\test\\resources\\drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get(URL);
	driver.manage().window().maximize();
	
	}

@Test(priority=0)
public void verifyhomepage() throws Exception
{
	
	homepag=new homepage(driver);
	
	homepag.started();
	homepage.Test1();
	homepag.verifydropdown();
	homepag.verifyTitleTest();
	
	
	
}

@Test(dataProvider="logindata",priority=1)
public void verifylogin(String user,String pass,String result) throws Exception
{
	
	homepag=new homepage(driver);
	homepag.started();
	loging=new loginpag(driver);
	
	loging.logintest(user, pass, result);
	//loging.getdata();
	
	
}
@DataProvider(name="logindata")
public String[][] getdata() throws IOException {
	
	String path = System.getProperty("user.dir")+"/src/test/resources/TestData/login.xls";
	//String path = System.getProperty("C:\\Users\\general\\eclipse-workspace\\dsalgoproject\\src\\test\\resources\\TestData\\login.xls");
	
	utility.xlutility xl=new utility.xlutility(path);
	int totalrows=xl.getRowCount("Sheet1");
	int totalcells=xl.getCellCount("Sheet1", 1);
	 String logindata[][]=new String[totalrows][totalcells];
	 for(int i=1;i<=totalrows;i++)
	 {
		 for(int j=0;j<totalcells;j++)
		 {
			 logindata[i-1][j]=xl.getCelldata("Sheet1", i, j);
			 
		 }
	 }
	return logindata;
}
@Test(priority=2)
public void reg() throws Exception {
	homepag=new homepage(driver);
	homepag.started();
	regis=new registrationpage(driver);
	regis.registersubmitbtn();
	regis.registerusername();
	regis.registerpassword();
	regis.register_validname();
	regis.pwd_mismatch();
	regis.account_creation();
}
@Test(priority=3)
public void arr() throws Exception {
	homepag=new homepage(driver);
	homepag.started();
	loging=new loginpag(driver);
	loging.clicklogin();
	loging.log();
	array=new Arraypage(driver);
	array.Arraybtn();
	//driver.navigate().back();
	datastr=new datastructure(driver);
	datastr.datastructureintropage();
}

public void data() throws Exception {
	homepag=new homepage(driver);
	homepag.started();
	loging=new loginpag(driver);
	loging.clicklogin();
	loging.log();
	datastr=new datastructure(driver);
	datastr.datastructureintropage();
	
	
}


@AfterMethod
public void closeBrowser() {
	driver.quit();
}
}