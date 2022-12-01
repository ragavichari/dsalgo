package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReadConfig {
	WebDriver driver;
	Properties prop= new Properties();
	/*public void ReadConfi() throws IOException
	{
	FileInputStream ip=new FileInputStream("C:\\Users\\general\\eclipse-workspace\\dsalgoproject"
			+ "\\Configuration\\config.properties");
	prop.load(ip);
	System.out.println(prop.getProperty("browser"));
	}
	
	/*driver.get(prop.getProperty("URL"));
driver.findElement(By.name("")).sendKeys(prop.getProperty("username"));
driver.findElement(By.name("")).sendKeys(prop.getProperty("passwordforlogin"));
driver.findElement(By.name("")).sendKeys(prop.getProperty("tryeditor"));

}*/
	/*public String geturl()
	{
		String url=prop.getProperty("URL");
		return url;
	}
	public String getusername()
	{
		String username=prop.getProperty("username");
		return username;
	}
	public String getpassword()
	{
		String password=prop.getProperty("Password123!");
		return password;
	}
	public String getpath()
	{
		String chromepath=prop.getProperty("chrome");
		return chromepath;
	}*/
	public String getpythoncode() throws Exception
	{
		FileInputStream ip=new FileInputStream("C:\\Users\\general\\eclipse-workspace\\dsalgoproject"
				+ "\\Configuration\\config.properties");
		prop.load(ip);
		String pythoncode=prop.getProperty("tryeditor");
		return pythoncode;
		
	}
	/*public static void main(String [] args)throws Exception  {
		ReadConfig r=new ReadConfig();
		String trydata=r.getpythoncode();
		System.out.println(trydata);
	}*/
}

