package pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class proxify {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://proxify.gg/login");
		
		driver.manage().window().maximize();
		  
		driver.findElement(By.id("email")).sendKeys("admin@gmail.com");	
		
		driver.findElement(By.id("password")).sendKeys("7ERssaf51Z39n");
		
		Thread.sleep(5000);
		
		//driver.findElement(By.cssSelector("[id='recaptcha-anchor']")).click();
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Plans']")).click();
		
		Thread.sleep(2000);
		
	
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;

          // Scroll down by 1000 pixels
          js.executeScript("window.scrollBy(0, 2000);");

          Thread.sleep(5000);
          js.executeScript("window.scrollBy(0, -2000);");
          
          
         
          driver.findElement(By.cssSelector("span[class='truncate text-xs']")).click();
          
          
          driver.findElement(By.cssSelector("div:nth-child(5)")).click();

          
         driver.navigate().back();
		

	}

}
