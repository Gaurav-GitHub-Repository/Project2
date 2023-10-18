package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.DashboardPage;
import Pages.DashboardPage2;
import Pages.DashboardPage3;
import Pages.LoginPage;
import Pages.LogoutPage;

@SuppressWarnings("deprecation")

public class TestCase16 {
	
	public static void main(String[] args) throws InterruptedException {
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
		//Method to call LoginPage
		LoginPage loginpage = new LoginPage(driver);
		//TestCase4
		loginpage.signup();
		//TestCase5
		loginpage.loginEmail("gaurav.pathangej@gmail.com");
		loginpage.password("Gaurav");
		loginpage.login();
		//Method to call DashboardPage
		DashboardPage dashboardpage = new DashboardPage(driver);
		//TestCase6
		dashboardpage.verifyLoggedUsername();
		//Method to call DashboardPage2
		DashboardPage2 dashboardpage2 = new DashboardPage2(driver);
		//TestCase7
		dashboardpage2.scroll();
		dashboardpage2.addCart();
		//TestCase8
		dashboardpage2.viewCart();
		//TestCase9
		dashboardpage2.verifyProductPage();
		//Method to call DashboardPage3
		DashboardPage3 dashboardpage3 = new DashboardPage3(driver);
		//TestCase10
		dashboardpage3.checkout();
		//TestCase11
		dashboardpage3.verifyAddress();
		dashboardpage3.verifyOrder();
		//TestCase12
		dashboardpage3.enterDescription("Product is verified");
		dashboardpage3.button();
		//TestCase13
		dashboardpage3.cardName("Pathange Gaurav");
		dashboardpage3.cardNumber("123456789123");
		dashboardpage3.cvcNumber("321");
		dashboardpage3.enterMonth("12");
		dashboardpage3.enterYear("2024");
		//TestCase14
		dashboardpage3.paymentBtn();
		//TestCase15
		dashboardpage3.verifySuccess();
		//Method to call LogoutPage
		LogoutPage logoutpage = new LogoutPage(driver);
		//TestCase16
		logoutpage.deleteAccount();
		//TestCase17
		logoutpage.verifyDeletedAccount();
		logoutpage.ContinueButton();
		
	}
}
