package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.DashboardPage;
import Pages.LoginPage;
import Pages.LogoutPage;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//TestCase1	
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
		System.out.println("TestCase2:Current URL of the page is verified." + "Current URL:" + ActualCurrentURL);
		System.out.println("TestCase2:Page Title of the page is verified." + "Page Title:" +  ActualTitle);	
		}  
		else
		{
			System.out.println("Exception: TimeOutException");
		}
		//Method to call Loginpage
		LoginPage loginpage = new LoginPage(driver);
		//TestCase4
		loginpage.signup();
		//TestCase5
		loginpage.verifyForm();
		//TestCase6
		loginpage.loginEmail("gaurav.pathangej@gmail.com");
		loginpage.password("Gaurav");
		//TestCase7
		loginpage.login();
		//Method to call DashboardPage
		DashboardPage dashboardpage = new DashboardPage(driver);
		//TestCase8
		dashboardpage.verifyLoggedUsername();
		//Method to call LogoutPage
		LogoutPage logoutpage = new LogoutPage(driver);
		//TestCase9
		logoutpage.deleteAccount();
		//TestCase10
		logoutpage.verifyDeletedAccount();
	}
}
