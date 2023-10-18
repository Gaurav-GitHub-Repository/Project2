package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage3 {

	WebDriver driver;
	
	public DashboardPage3(WebDriver driver)
	{
		this.driver=driver;
	}

	//Locator for checkout button
	By Checkout = By.xpath("//a[text()='Proceed To Checkout']");
	//Locator for Register/Login button
	By Login_ViewCart = By.xpath("//div[@class='modal-content']/div[2]/p[2]/a");
	//Locator for continue button
	By Continue_Button = By.xpath("//div[@class='modal-content']/div[3]/button");
	//Locator for Address
	By Delivery_Address = By.xpath("//ul[@class='address item box' and @id='address_delivery']");
	//Locator to verify Address
	By address = By.xpath("//ul[@class='address item box' and @id='address_delivery']/li[6]");
	//Locator to verify review order
	By Review_Order = By.xpath("//table[@class='table table-condensed']/tbody/tr/td[2]/h4/a");
	//Locator for Description 
	By Description = By.xpath("//div[@class='form-group']/textarea[@name='message']");
	//Locator for place order button
	By Place_Order = By.xpath("//a[text()='Place Order']");
	
	//Locator for payment card name
	By Card_Name = By.xpath("//form[@id='payment-form']/div/div/input");
	//Locator for card number
	By Card_Number = By.xpath("//form[@id='payment-form']/div[2]/div/input");
	//Locator for CVC
	By CVV = By.xpath("//input[@name='cvc']");
	//Locator for month
	By Month = By.xpath("//input[@name='expiry_month']");
	//Locator for year
	By Year = By.xpath("//input[@name='expiry_year']");
	//Locator for button
	By Payment_Button = By.xpath("//button[text()='Pay and Confirm Order']");
	//Locator for Success Message
	By Success_Message = By.xpath("//div[@class='alert-success alert']");
	
	//Locator to verify review
	By Review = By.xpath("//a[text()='Write Your Review']");
	//Locator for review name
	By Review_Name = By.xpath("//form[@id='review-form']/span/input[@id='name']");
	//Locator for review email address
	By Review_Email = By.xpath("//form[@id='review-form']/span/input[2]");
	//Locator for review 
	By Review_Form = By.xpath("//form[@id='review-form']/textarea[@id='review']");
	//Locator for review button
	By Review_Button = By.xpath("//form[@id='review-form']/button");
	//Locator to verify review
	By form = By.xpath("//form[@id='review-form']/div/div/div/span");
	
	//Locator to verify recommended items
	By Items = By.xpath("//div[@class='recommended_items']/h2");
	//Locator for product
	By Product = By.xpath("//a[text()='Add to cart']");

	//Locator for arrow to move upward
	By arrow = By.xpath("//a[@id='scrollUp']");
	//Locator to verify automation engineer text
	By Automation = By.xpath("//div[@id='slider-carousel']/div/div/div/h2[text()='Full-Fledged practice website for Automation Engineers']");
	
	//Method to click on checkout button
	public void checkout()
	{
		driver.findElement(Checkout).click();
	}
	//Method to click on cart button
	public void cartButton() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(Continue_Button).click();
	}
	//Method to click on Register/Login 
	public void login()
	{
		driver.findElement(Login_ViewCart).click();
	}
	//Method to verify address
	public void verifyAddress() throws InterruptedException
	{
		Thread.sleep(5000);
		String Address = driver.findElement(Delivery_Address).getText();
		System.out.println(Address);
		if(Address.contains("Gachibowli"))
		{
			System.out.println("Address is verified");
		}
		else
		{
			System.out.println("Address is not verified");
		}
	}
	//Method to verify order
	public void verifyOrder()
	{
		String Product = driver.findElement(Review_Order).getText();
		System.out.println(Product);
		if(Product.contains("Blue Top"))
		{
			System.out.println("Blue top product is verified");
		}
		else
		{
			System.out.println("Blue top product is not verified");
		}
	}
	//Method to enter description
	public void enterDescription(String description)
	{
		driver.findElement(Description).sendKeys(description);
	}
	//Method to click on place order button
	public void button()
	{
		driver.findElement(Place_Order).click();
	}
	//Method to enter card name
	public void cardName(String name)
	{
		driver.findElement(Card_Name).sendKeys(name);
	}
	//Method to enter card number
	public void cardNumber(String number)
	{
		driver.findElement(Card_Number).sendKeys(number);
	}
	//Method to enter cvv
	public void cvcNumber(String value)
	{
		driver.findElement(CVV).sendKeys(value);
	}
	//Method to enter month
	public void enterMonth(String month)
	{
		driver.findElement(Month).sendKeys(month);
	}
	//Method to enter year
	public void enterYear(String yearValue)
	{
		driver.findElement(Year).sendKeys(yearValue);
	}
	//Method to click payment button
	public void paymentBtn() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(Payment_Button).click();
	}
	//Method to verify success message
	public void verifySuccess()
	{
		String Payment = driver.findElement(Success_Message).getText();
		System.out.println(Payment);
		if(Payment.contains("Your order has been placed successfully!"))
		{
			System.out.println("Order is successfully placed");
		}
		else
		{
			System.out.println("Order is not placed");
		}
	}
	
	//Method to verify review 
	public void verifyReview()
	{
		String FormReview =	driver.findElement(Review).getText();
		System.out.println(FormReview);
		if(FormReview.equals("Write Your Review"))
		{
			System.out.println("Review is verified");
		}
		else
		{
			System.out.println("Review is not verified");
		}
	}
	//Method to enter name
	public void formName(String Name)
	{
		driver.findElement(Review_Name).sendKeys(Name);
	}
	//Method to enter email
	public void formEmail(String Email)
	{
		driver.findElement(Review_Email).sendKeys(Email);
	}
	//Method to enter review
	public void formReview(String value)
	{
		driver.findElement(Review_Form).sendKeys(value);
	}
	//Method to click on submit button
	public void formButton()
	{
		driver.findElement(Review_Button).click();
	}
	//Method to verify review
	public void verifyFormReview()
	{
		String FormReview = driver.findElement(form).getText();
		System.out.println(FormReview);
		if(FormReview.equals("Thank you for your review."))
		{
			System.out.println("Review is verified");
		}
		else
		{
			System.out.println("Review is not verified. Unable to match webelement text");
		}
	}
	//Method to scroll
	public void scroll() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement Element = driver.findElement(By.xpath("//div[@class='recommended_items']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
	}
	//Method to verify recommended items
	public void verifyRecommendedItems()
	{
		String RecommendedProducts = driver.findElement(Items).getText();
		System.out.println(RecommendedProducts);
		if(RecommendedProducts.equals("recommended_items"))
		{
			System.out.println("Recommended Items are verified");
		}
		else
		{
			System.out.println("Recommended Items are not verified. Unable to match webelement text");
		}
	}
	//Method to add recommended product
	public void addRecommendedProduct()
	{
		driver.findElement(Product).click();
	}
	//Method to click on arrow button
	public void arrowButton() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(arrow).click();
	}
	//Method to verify automation text
	public void verifyAutomation()
	{
		String HeaderAutomation = driver.findElement(Automation).getText();
		System.out.println(HeaderAutomation);
		if(HeaderAutomation.equals("Full-Fledged practice website for Automation Engineers"))
		{
			System.out.println("Automation Engineer text is verified.");
		}
		else
		{
			System.out.println("Automation Engineer text is not verified. Unable to match webelement text.");
		}
	}
	//Method to scroll header
	public void scrollHeader() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement Element = driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
	}
	
}
