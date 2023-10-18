package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.DashboardPage;

public class TestCase10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Temp\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		//TestCase2
		driver.get("https://automationexercise.com/");
		//TestCase3		
		String ActualCurrentURL = "https://automationexercise.com/";
		String ActualTitle = "Automation Exercise";		    
		if(driver.getCurrentUrl().equals(ActualCurrentURL) && driver.getTitle().equals(ActualTitle))
		{
		System.out.println("Current URL of the page is verified." + "Current URL:" + ActualCurrentURL);
		System.out.println("Page Title of the page is verified." + "Page Title:" +  ActualTitle);	
		} 
		else
		{
			System.out.println("Exception: TimeOutException");
		}
		//Method to call DashboardPage
		DashboardPage dashboardpage = new DashboardPage(driver);
		//TestCase4
		dashboardpage.scroll();
		//TestCase5
		dashboardpage.verifySubscription();
		//TestCase6
		dashboardpage.footerEmail("gaurav.pathangej@gmail.com");
		dashboardpage.button();
		//TestCase7
		dashboardpage.subscriptionSuccess();
	}
}
