package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteLead 
{

	public static void main(String[] args) 
	{
		ChromeOptions option = new ChromeOptions();
		
        option.addArguments("--guest");

        ChromeDriver driver = new ChromeDriver(option);
        
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.linkText("Phone")).click();
        driver.findElement(By.xpath("//input[@name=\"phoneAreaCode\"]")).sendKeys("+91");
        driver.findElement(By.xpath("//input[@name=\"phoneNumber\"]")).sendKeys("9999999123456");
        driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ext-gen935\"]")).click();
        
        String lead_id=driver.findElement(By.xpath("//*[@id=\"ext-gen1691\"]")).getText();
        System.out.println("lead ID is:"+lead_id);
        //driver.findElement(By.xpath("//*[@id=\"ext-gen1711\"]")).click();
        /*
        String lead_id=driver.findElement(By.linkText("10082")).getText();
        System.out.println("lead ID is:"+lead_id);
        driver.findElement(By.linkText("10082")).click();
        driver.findElement(By.linkText("Delete")).click();
        //driver.findElement(By.linkText("Find Leads")).click();
        //driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[1]/div[2]/ul/li[3]/a")).click();
        driver.findElement(By.id("ext-gen866")).click();
        
        //driver.findElement(By.linkText("10081")).click();
        //driver.findElement(By.linkText("Delete")).click();
        //driver.findElement(By.linkText("Find Leads")).click();
        */
        
        
	}

}
