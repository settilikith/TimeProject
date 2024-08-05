package demowebshop;

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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tc02_Login {
	@Test(groups="System Testing")
	public  void login(String browsername) throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
	    WebElement log  =driver.findElement(By.id("Email"));
	    log.sendKeys("settilikith376@gmail.com",Keys.TAB,"Setti@2424",Keys.TAB,Keys.TAB,Keys.ENTER);
	    TakesScreenshot ts =(TakesScreenshot)driver;
	    File f1 =ts.getScreenshotAs(OutputType.FILE);
	    File f2 =new File("./screenshot/log.png");
	    FileHandler.copy(f1, f2);
	    driver.quit();
		// TODO Auto-generated method stub

	}

}
