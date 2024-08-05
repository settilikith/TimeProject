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
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC03_Giftcarts{
    @Test(groups="Integration")
	public  void giftcarts() throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart'][1]")).click();
		WebElement gift =driver.findElement(By.className("recipient-name"));
		gift.sendKeys("Lucky",Keys.TAB,"Lucky@gmail.com",Keys.TAB,"Likith",Keys.TAB,"likith@gmail.com",Keys.TAB,"9999",Keys.TAB,Keys.CLEAR,"5");
		driver.findElement(By.id("add-to-cart-button-1")).click();
		TakesScreenshot ts =(TakesScreenshot)driver;
	    File ca =ts.getScreenshotAs(OutputType.FILE);
	    File rt =new File("./screenshot/gif.png");
	    FileHandler.copy(ca, rt);
	    driver.quit();
	    Reporter.log("passed");
		// TODO Auto-generated method stub

	}

}
