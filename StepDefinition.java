package step;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	public ChromeDriver driver;
	@Given("Launch browser and load the url and maximize the screen")
	public void launch_browser_and_load_the_url_and_maximize_the_screen() {
		ChromeOptions d=new ChromeOptions();
		d.addArguments("--disable-notifications");
		driver= new ChromeDriver(d);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://login.salesforce.com/");
	    
	}

	@Given("Enter the username as {string}")
	public void enter_the_username_as(String username) {
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");	    
	}



	@Given("Enter the password as {string}")
	public void enter_the_password_as(String password) {
	    driver.findElement(By.id("password")).sendKeys("leaf@2024");
	    
	}

	@When("Click on Loginbutton")
	public void click_on_loginbutton() {
	    driver.findElement(By.id("Login")).click();
	    
	}

	@Then("Click toggle")
	public void click_toggle() {
        driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	    
	}

	@Then("Click ViewAll")
	public void click_view_all() {
	    driver.findElement(By.xpath("//button[text()='View All']")).click();
	    
	}

	@Then("Click Sales")
	public void click_sales() {
	    driver.findElement(By.xpath("//p[text()='Sales']")).click();
	    
	}

	@Then("Click Opportunities")
	public void click_opportunities() {
		WebElement oppur = driver.findElement(By.xpath("//span[text()='Opportunities']"));
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", oppur);	    
	}

	@Then("Click New")
	public void click_new() {
	    driver.findElement(By.xpath("//div[text()='New']")).click();
	    
	}

	@When("Enter name as {string}")
	public void enter_name_as(String OpportunityName) {
	    driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(OpportunityName,Keys.ENTER);
	    
	}

	@When("Enter amount as {string}")
	public void enter_amount_as(String Amount) {
	    driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(Amount,Keys.ENTER);
	    
	}

	@Then("Close the date as today")
	public void close_the_date_as_today() {
	    driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
	    driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-align_absolute-center')]")).click();
	}

@Then("Click Stage select NeedAnalysis")
public void click_stage_select_need_analysis() {
	 driver.findElement(By.xpath("//button[@aria-label='Stage']")).click();
	    driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();   
}

@Then("save the changes")
public void save_the_changes() {
    driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
}

@Then("Verify all")
public void verify_all() {
    String text = driver.findElement(By.xpath("//lightning-formatted-text[text()='Salesforce Automation by Iswarya']")).getText();
    System.out.println(text);
if(text.contains("Iswarya")) {
    	System.out.println("Verified");
    }else {
    	System.out.println("Not Verified");
    	
    		
    }}


	}


