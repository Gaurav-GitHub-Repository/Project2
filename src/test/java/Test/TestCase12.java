package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.DashboardPage2;

@SuppressWarnings("deprecation")
public class TestCase12 {

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
		//Method to call DashboardPage
		DashboardPage2 dashboardpage2 = new DashboardPage2(driver);
		//TestCase4
		dashboardpage2.product();
		dashboardpage2.scroll();
		//TestCase5
		dashboardpage2.addCart();
		//TestCase6
		dashboardpage2.continueButton();
		//TestCase7
		dashboardpage2.addCart2();
		//TestCase8
		dashboardpage2.viewCart();
		//TestCase9&10
		dashboardpage2.Price();
		dashboardpage2.Quantity();
		dashboardpage2.totalPrice();		
	}
}
