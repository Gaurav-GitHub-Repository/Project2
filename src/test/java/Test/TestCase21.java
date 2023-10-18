package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.DashboardPage2;
import Pages.DashboardPage3;

@SuppressWarnings("deprecation")
public class TestCase21 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Temp\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		//TestCase2
		driver.get("https://automationexercise.com/");
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
		//Method to call DashboardPage2
		DashboardPage2 dashboardpage2 = new DashboardPage2(driver);
		//TestCase3
		dashboardpage2.product();
		//TestCase4
		dashboardpage2.verifyProduct();
		//TestCase5
		dashboardpage2.viewProduct();
		//Method to call DashboardPage3
		DashboardPage3 dashboardpage3 = new DashboardPage3(driver);
		//TestCase6
		dashboardpage3.verifyReview();
		dashboardpage2.scrollDown();
		//TestCase7
		dashboardpage3.formName("Pathange Gaurav");
		dashboardpage3.formEmail("gaurav.pathangej@gmail.com");
		dashboardpage3.formReview("Page is continuously running");
		//TestCase8
		dashboardpage3.formButton();
		//TestCase9
		dashboardpage3.verifyFormReview();
	}
}
