package demowebshop;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC01_Register{
	WebDriver driver;
	 @Test(groups ="functionality")
	 @Parameters("browsername")
	public void register(String browsername) throws IOException, AWTException 
	{
		//WebDriver driver =new ChromeDriver();
		 if(browsername.equalsIgnoreCase("chrome"))
			{
				driver=new ChromeDriver();
			}
			else if(browsername.equalsIgnoreCase("edge"))
			{
				driver =new EdgeDriver();
			}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	   	driver.findElement(By.xpath("//a[text()='Register']")).click();
	   TakesScreenshot ts =(TakesScreenshot)driver;
	   File reg =ts.getScreenshotAs(OutputType.FILE);
	   File ist =new File("./screenshot/s1.png");
	   FileHandler.copy(reg, ist);
	   driver.findElement(By.name("Gender")).click();
	   WebElement fir =driver.findElement(By.id("FirstName"));
	   fir.sendKeys("S",Keys.TAB,"Likith",Keys.TAB,"settilikith376@gmail.com",Keys.TAB,"Setti@2424",Keys.TAB,"Setti@2424",Keys.TAB,Keys.ENTER);
	   driver.quit();
	   Reporter.log("working");
	   
		// TODO Auto-generated method stub

	}

}
