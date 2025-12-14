package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLeadAssignment 
{

	public static void main(String[] args) 
	{
		ChromeOptions option = new ChromeOptions();
		
        option.addArguments("--guest");

        ChromeDriver driver = new ChromeDriver(option);
        driver.get(" http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();
        driver.findElement(By.name("USERNAME")).sendKeys("DemoCSR");
        driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
       // driver.findElement(By.linkText("/crmsfa/control/main?externalLoginKey=EL19134865011")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Atharv");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gurram");
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
        driver.findElement(By.name("generalProfTitle")).sendKeys("Mr.");
        driver.findElement(By.name("submitButton")).click();
        System.out.println(driver.getTitle());
        driver.close();
	}

}
