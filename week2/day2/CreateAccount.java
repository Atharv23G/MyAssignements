package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount 
{

	public static void main(String[] args) 
	{
			ChromeOptions option = new ChromeOptions();
			
	        option.addArguments("--guest");

	        ChromeDriver driver = new ChromeDriver(option);
	        driver.get(" http://leaftaps.com/opentaps/");
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	        driver.findElement(By.id("password")).sendKeys("crmsfa");
	        driver.findElement(By.className("decorativeSubmit")).click();
	        driver.findElement(By.linkText("CRM/SFA")).click();
	        driver.findElement(By.linkText("Accounts")).click();
	        driver.findElement(By.linkText("Create Account")).click();
	        driver.findElement(By.xpath("//input[@id=\"accountName\"]")).sendKeys("Atharva Kohali");
	        driver.findElement(By.xpath("//textarea[@name=\"description\"]")).sendKeys("Selenium Automation Tester");
	        
	        WebElement industry=driver.findElement(By.name("industryEnumId"));
	        Select sel=new Select(industry);
	        sel.selectByVisibleText("Computer Software");
	        
	        WebElement Ownership=driver.findElement(By.name("ownershipEnumId"));
	        Select sel1=new Select(Ownership);
	        sel1.selectByVisibleText("S-Corporation");
	        
	        WebElement Source=driver.findElement(By.id("dataSourceId"));
	        Select sel2=new Select(Source);
	        sel2.selectByValue("LEAD_EMPLOYEE");
	        
	        WebElement Marketing_Campaign=driver.findElement(By.id("marketingCampaignId"));
	        Select sel3=new Select(Marketing_Campaign);
	        sel3.selectByIndex(6);
	        
	        WebElement State_Province=driver.findElement(By.id("generalStateProvinceGeoId"));
	        Select sel4=new Select(State_Province);
	        sel4.selectByValue("TX");
	        
	        driver.findElement(By.xpath("//input[@class=\"smallSubmit\"]")).click();
	        
	       // System.out.println(driver.findElement(By.linkText("Virat Kohali  (10459)")).getText());
	        //driver.findElement(By.linkText("Suresh Raina  (10460)")).gett
	        
	        System.out.println(driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/span")).getText());
	        driver.close();
	        
	}

}
