package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;

public class TestCase3 {

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
		loginpage.verifyForm();
		//TestCase6
		loginpage.loginEmail("gaurav.pathangej675789@gmail.com");
		loginpage.password("Gaurav8998");
		//TestCase7
		loginpage.login();
		//TestCase8
		loginpage.error();
		
	}
}
