package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead 
{

	public static void main(String[] args) 
	{
        ChromeOptions option = new ChromeOptions();
		
        option.addArguments("--guest");

        ChromeDriver driver = new ChromeDriver(option);
        
        driver.get("http://leaftaps.com/opentaps/.");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("DemoSalesManager");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.xpath("//input[@id=\"createLeadForm_companyName\"]")).sendKeys("Hexaware Technologies");
        driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstName\"]")).sendKeys("Atharva");
        driver.findElement(By.xpath("//input[@id=\"createLeadForm_lastName\"]")).sendKeys("Gurram");
        driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstNameLocal\"]")).sendKeys("AtharvaG");
        driver.findElement(By.xpath("//input[@id=\"createLeadForm_departmentName\"]")).sendKeys("GTT");
        driver.findElement(By.xpath("//textarea[@id=\"createLeadForm_description\"]")).sendKeys("This is the Sample Desc.");
        driver.findElement(By.xpath("//input[@id=\"createLeadForm_primaryEmail\"]")).sendKeys("atharv.1919@gmail.com");
        
        WebElement State_Province=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select s1=new Select(State_Province);
        s1.selectByVisibleText("New York");
        
        driver.findElement(By.xpath("//input[@value=\"Create Lead\"]")).click();
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.xpath("//textarea[@id=\"updateLeadForm_description\"]")).clear();
        driver.findElement(By.xpath("//textarea[@id=\"updateLeadForm_importantNote\"]")).sendKeys("Updated Text");
        driver.findElement(By.xpath("//input[@name=\"submitButton\"]")).click();
        System.out.println(driver.getTitle());
        driver.close();
        
        
	}

}
