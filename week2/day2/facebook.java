package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook 
{

	public static void main(String[] args) 
	{
		ChromeOptions option = new ChromeOptions();
		
        option.addArguments("--guest");

        ChromeDriver driver = new ChromeDriver(option);
        
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Atharva");
        driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Gurram");
        driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("90989012312");
        driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("ViratKohali@1919");
        
        WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
        Select s1=new Select(day);
        s1.selectByVisibleText("6");
        
        WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
        Select s2=new Select(month);
        s2.selectByVisibleText("Aug");
        
        WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
        Select s3=new Select(year);
        s3.selectByVisibleText("2000");
        
        //driver.findElement(By.linkText("Male")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/span/span[2]/label/input")).click();
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

}
