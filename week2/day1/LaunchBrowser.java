package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//div[@class=\"_9ay7\"]")).getText());
		driver.findElement(By.linkText("Find your account and log in.")).click();
		//System.out.println(driver.getTitle());

		//System.out.println(driver.findElement(By.partialLinkText("The email address you entered isn't connected to an account.")));
		//driver.close();
	}

}
