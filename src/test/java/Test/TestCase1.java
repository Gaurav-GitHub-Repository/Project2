package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.DashboardPage;
import Pages.LoginPage;
import Pages.LogoutPage;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException, IOException {
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
	System.out.println("TestCase1:Current URL of the page is verified." + "Current URL:" + ActualCurrentURL);
	System.out.println("TestCase1:Page Title of the page is verified." + "Page Title:" +  ActualTitle);	
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
	loginpage.verifySignup();
	//TestCase6
	loginpage.name("Pathange Gaurav");
	loginpage.email("gaurav.pathangej@gmail.com");
	//TestCase7
	loginpage.signupbutton();
	//Method to call Dashboard page
	DashboardPage dashboardpage = new DashboardPage(driver);
	//TestCase8
	dashboardpage.verifyAccountInformationForm();
	//TestCase9
	dashboardpage.title();
	dashboardpage.accountName("Pathange Gaurav");
	dashboardpage.accountEmail("gaurav.pathangej@gmail.com");
	dashboardpage.password("Gaurav");
	dashboardpage.day();
	dashboardpage.month();
	dashboardpage.year();
	//TestCase10
	dashboardpage.checkbox1();
	//TestCase11
	dashboardpage.checkbox2();
	//TestCase12
	dashboardpage.firstName("Pathange");
	dashboardpage.lastName("Gaurav");
	dashboardpage.company("Working in company");
	dashboardpage.address("Gachibowli");
	dashboardpage.addressInfo("Gachibowli");
	dashboardpage.country();
	dashboardpage.state("Telangana");
	dashboardpage.city("Hyderabad");
	dashboardpage.zipcode("518002");
	dashboardpage.mobile("8919876100");
	//TestCase13
	dashboardpage.createButton();
	//TestCase14
	dashboardpage.verifyAccount();
	//TestCase15
	dashboardpage.continueButton();
	//TestCase16
	dashboardpage.verifyLoggedUsername();
	//Method to call Logoutpage
	LogoutPage logoutpage = new LogoutPage(driver);	
	//TestCase17
	logoutpage.deleteAccount();
	//TestCase18
	logoutpage.verifyDeletedAccount();
	logoutpage.ContinueButton();
	
	}
}
