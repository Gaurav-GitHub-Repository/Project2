package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.DashboardPage;
import Pages.DashboardPage2;
import Pages.DashboardPage3;
import Pages.LoginPage;
import Pages.LogoutPage;

@SuppressWarnings("deprecation")

public class TestCase15 {

	public static void main(String[] args) throws InterruptedException, IOException {
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
		dashboardpage.company("Linkedin");
		dashboardpage.address("Gachibowli");
		dashboardpage.addressInfo("Flat 505, Asvasidh Abode, JV Colony, Gachibowli");
		dashboardpage.country();
		dashboardpage.state("Hyderabad");
		dashboardpage.city("Telangana");
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
		dashboardpage2.ViewCart();
		//TestCase10
		dashboardpage2.verifyProductPage();
		//Method to call DashboardPage3
		DashboardPage3 dashboardpage3 = new DashboardPage3(driver);
		//TestCase11
		dashboardpage3.checkout();
//		dashboardpage3.login();
		//TestCase12
		dashboardpage3.verifyAddress();
		dashboardpage3.verifyOrder();
		//TestCase13
		dashboardpage3.enterDescription("Product is verified");
		dashboardpage3.button();
		//TestCase14
		dashboardpage3.cardName("Pathange Gaurav");
		dashboardpage3.cardNumber("123456789123");
		dashboardpage3.cvcNumber("321");
		dashboardpage3.enterMonth("12");
		dashboardpage3.enterYear("2024");
		//TestCase15
		dashboardpage3.paymentBtn();
		//TestCase16
		dashboardpage3.verifySuccess();
		//Method to call Logout
		//TestCase17
		LogoutPage logoutpage = new LogoutPage(driver);
		logoutpage.deleteAccount();
		//TestCase18
		logoutpage.verifyDeletedAccount();
		logoutpage.ContinueButton();
	}
}
