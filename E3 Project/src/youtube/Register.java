package youtube;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		//search the movie
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Hyper");
		//click
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		//click movie
		//driver.findElement(By.xpath("//a[contains(@id,'video-title')][2]")).click();
//		// TODO Auto-generated method stub

	}

}
