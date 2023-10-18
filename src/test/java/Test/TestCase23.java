package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.DashboardPage;
import Pages.DashboardPage2;
import Pages.DashboardPage3;
import Pages.LoginPage;

public class TestCase23 {

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
		loginpage.name("Pathange Gaurav");
		loginpage.email("gaurav.pathangej@gmail.com");
		loginpage.signupbutton();
		//Method to call DashboardPage
		DashboardPage dashboardpage = new DashboardPage(driver);
		//TestCase5
		dashboardpage.title();
		dashboardpage.accountName("Pathange Gaurav");
		dashboardpage.accountEmail("gaurav.pathangej@gmail.com");
		dashboardpage.password("Gaurav");
		dashboardpage.day();
		dashboardpage.month();
		dashboardpage.year();
		dashboardpage.checkbox1();
		dashboardpage.checkbox2();
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
		dashboardpage.createButton();
		//TestCase6
		dashboardpage.verifyAccount();
		dashboardpage.continueButton();
		//TestCase7
		dashboardpage.verifyLoggedUsername();
		//Method to call DashboardPage2
		DashboardPage2 dashboardpage2 = new DashboardPage2(driver);
		//TestCase8
		dashboardpage2.scroll();
		dashboardpage2.addCart();
		//TestCase9
		dashboardpage2.viewCart();
		//TestCase10
		dashboardpage2.verifyProductCartPage();
		DashboardPage3 dashboardpage3 = new DashboardPage3(driver);
		//TestCase11
		dashboardpage3.checkout();
		//TestCase12
		
		
	}
}
