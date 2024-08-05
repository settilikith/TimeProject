package demowebshop;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tc05_Computer {
	@Test(groups="functionality")
	public  void Computers() {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Computers')]")).click();
		driver.findElement(By.xpath("//a[@title='Show products in category Desktops'][1]")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart'][1]")).click();
		List<WebElement> add =driver.findElements(By.name("product_attribute_72_5_18"));
		for(WebElement o:add)
		{
			o.click();
			System.out.println(o.getText());
		}
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		WebElement q =driver.findElement(By.className("qty-input"));
		q.clear();
		q.sendKeys("5",Keys.TAB,Keys.ENTER);
		driver.quit();
		
		
		// TODO Auto-generated method stub

	}

}
