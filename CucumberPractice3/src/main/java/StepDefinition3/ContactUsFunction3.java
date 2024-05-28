package StepDefinition3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsFunction3 {
	 WebDriver driver;
	 @Before("@Adhoc")
	 public void setup() {
		  String Path = System.getProperty("user.dir");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\CucumberPractice3\\src\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.protrainingtech.com");
		 driver.manage().window().maximize();
	 }
	 @After("@Adhoc")
	 public void teartdown() {
		driver.close();
	 }
	 @Before("@Function")
	 public void setupFunction() {
		  System.out.println("This is to show before function tags");
	 }
	 @After("@Function")
	 public void teartdownFunction() {
		System.out.println("This is to show after function tags");
	
	
		 
	 }
	@Given("^I navigate to the protrainingtech\\.com$")
	public void i_navigate_to_the_protrainingtech_com() throws Throwable {
	 System.out.println("This is to navigate to site"); 
	 
	}

	@When("^I click on Contact Us link$")
	public void i_click_on_Contact_Us_link() throws Throwable {
	    System.out.println("Click to contact us.");
	    
	}

	@Then("^The Contact Us form displays$")
	public void the_Contact_Us_form_displays() throws Throwable {
	 System.out.println("Form is displayed");   
	   
	}

	@When("^I click on register button$")
	public void i_click_on_register_button() throws Throwable {
	    
	    
	}

	@Then("^I am able to see the validation error$")
	public void i_am_able_to_see_the_validation_error() throws Throwable {
	}
		@When("^I enter the name \"([^\"]*)\"$")
	public void i_enter_the_name(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		  System.out.println("Name is = " + arg1);  
		}

		@Then("^I will see the \"([^\"]*)\"$")
		public void i_will_see_the(int digited) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   System.out.println("Ids is = " + digited); 
		}

	    
	}




