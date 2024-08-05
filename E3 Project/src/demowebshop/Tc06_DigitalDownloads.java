package demowebshop;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc06_DigitalDownloads 
{
        @Test(groups="Regression")
	    public  void digital() {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Digital')][1]")).click();
		List<WebElement> p=driver.findElements(By.xpath("//span[@class='price actual-price']/../../div"));
		for(WebElement r:p)
			//System.out.println(r.getText());
			Reporter.log(r.getText());
		driver.quit();
		// TODO Auto-generated method stub

	}

}
