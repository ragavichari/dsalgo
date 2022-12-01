package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import dsalgo.homepage;
import io.qameta.allure.Allure;

public class screenshot_utility  {
public static void capturescreenshot(WebDriver driver,String screenshotName)
{
	try {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Users\\general\\eclipse-workspace\\dsalgoproject\\screenshot\\"+ screenshotName +".png"));
	                                 //	C:\Users\general\eclipse-workspace\dsalgoproject\screenshot
		Allure.addAttachment("Title not matched",FileUtils.openInputStream(source));
		System.out.println("screenshot taken");
	}
	catch(Exception e)
	{
		System.out.println("Exception while taking screenshot"+e.getMessage());
	}
}
}

		
	