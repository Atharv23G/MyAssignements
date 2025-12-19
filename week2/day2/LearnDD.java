package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDD 
{

	public static void main(String[] args) 
	{
        ChromeOptions option = new ChromeOptions();
		
        option.addArguments("--guest");

        ChromeDriver driver = new ChromeDriver(option);
        driver.get(" http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();
        
        
        driver.findElement(By.xpath("//input[@name=\"USERNAME\"]")).sendKeys("demosalesmanager");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
       // driver.findElement(By.linkText("/crmsfa/control/main?externalLoginKey=EL19134865011")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Atharv");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gurram");
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
        
        WebElement sourcedd=driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select sel=new Select(sourcedd);
        sel.selectByIndex(4);
        
    	WebElement MCdd=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
    	Select sel1=new Select(MCdd);
    	sel1.selectByVisibleText("Automobile");
    	
    	WebElement Ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
    	Select sel2=new Select(Ownership);
    	sel2.selectByValue("OWN_CCORP");
    	
        driver.findElement(By.name("submitButton")).click();
    	System.out.println(driver.getTitle());
    	
    	driver.close();
	}

}


