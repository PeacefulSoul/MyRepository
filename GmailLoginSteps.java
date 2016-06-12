package steps;

import java.util.List;

import org.junit.After;
import org.junit.Before;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.GmailPage;
import util.DriverFactory;


public class GmailLoginSteps extends DriverFactory{
	
		@Before
	public void beforeScenario() {
		System.out.println("in before scenario");
		driver = new DriverFactory().getDriver();
		
		
	}

	@After
	public void afterScenario() {
		System.out.println("in after scenario");
		new DriverFactory().destroyDriver();
		
		System.out.println("in after1 scenario");
	}
	
	@Given("^Open application Url$")
	public void open_application_Url()  {
	    try {
	    	System.out.println("Open Application Url");
	    	new GmailPage(driver).openGmail();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.fail();
		}
	}

	// scenario outline  -- GmailLogin
	//@When("^Enter Username .*")
	public void enter_Username(String arg1)  {
	   
	    try {
	    	System.out.println("to enter username");
	    	new GmailPage(driver).EnterUsername(arg1);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.fail();
		}
	}

	
	@When("^Click Next$")
	public void click_Next()  {
	    // Write code here that turns the phrase above into concrete actions
	    try {
	    	System.out.println("Clicking Next Buttpn");
			new GmailPage(driver).ClickNext();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.fail();
		}
	}

	//@When("^Enter Password .*$")
		public void enter_Password(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
		try {
			System.out.println("Entering Password");
	    	new GmailPage(driver).EnterPassword(arg1);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.fail();
		}
	    
	}

	@When("^click Signin$")
	public void click_Signin()  {
	    // Write code here that turns the phrase above into concrete actions
		try {
			System.out.println("Clicking Signin");
	    	new GmailPage(driver).ClickSignIn();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Then("^Verify user logged in$")
	public void verify_user_logged_in()  {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("vwerifying User logged in");
	}
	
	

	
	
	// scenario -- GmailLogin2
	@When("^Enter Username$")
	public void enter_Username(DataTable arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		System.out.println("using feature file gmail login2");
	   List<List<String>> data=arg1.raw();
	   
	   String username= data.get(1).get(0);
	   System.out.println("USername is : "+ username);
	   
	   new GmailPage(driver).EnterUsername(username);
	   
	   }

	@When("^Enter Password$")
	public void enter_Password(DataTable arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		System.out.println("using feature file gmail login2");
		List<List<String>> data=arg1.raw();
		   
		   String password= data.get(1).get(0);
		   System.out.println("passowrd is : "+ password);
		   
		   new GmailPage(driver).EnterPassword(password);
	    
	}


}
