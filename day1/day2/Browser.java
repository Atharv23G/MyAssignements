package week1.day2;

public class Browser 
{
	public void launchBrowser(String browserName)
	{
		browserName="Google Chrome";
		System.out.println(browserName);
	}
	
	public String loadurl()
	{
		return "Url loaded sucessfully";
	}

	public static void main(String[] args) 
	{
		Browser b=new Browser();
		b.launchBrowser(null);
		System.out.println(b.loadurl());
		
		
	}

}
