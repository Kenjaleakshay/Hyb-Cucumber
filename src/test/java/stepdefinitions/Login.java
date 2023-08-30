package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Login {
	
	
	@Given("User navigates to login page")
	public void user_navigates_to_login_page() {
	   
		System.out.println("//User navigates to login page");
	}

	@When("user enters valid emailid (.+)$")
	public void user_enters_valid_emailid(String st) {
	 
		System.out.println("//User enters valid email " + st);
		
	}

	@When("^User enters valid password (.+)$")
	public void user_enters_valid_password(String st) {
	   
		System.out.println("//User enters valid password" + st);
		
	}

	@When("click on login button")
	public void click_on_login_button() {
	   
		System.out.println("//click on login button");
	}

	@Then("User should be logged in")
	public void user_should_be_logged_in() {
	  
		System.out.println("//user logged in");
	}

	
    @When("enters invalid emailid {string}")
	public void enters_invalid_emailid(String string) {
	   
		System.out.println("//enters invalid email "+ string);
	}

	@When("enters invalid password {string}")
	public void enters_invalid_password(String string) {
	   
		System.out.println("//enters invalid password " + string);
	}



	@Then("user should not be logged in")
	public void user_should_not_be_logged_in() {
	  
		System.out.println("//not logged in");
	}

	@Then("should get proper warning")
	public void should_get_proper_warning() {
	   
		System.out.println("//should get proper warning");
	}

	@When("user doesnot enter any emailid")
	public void user_doesnot_enter_any_emailid() {
	   
		System.out.println("//doesnot enter email");
	}

	@When("doesnot enter any password")
	public void doesnot_enter_any_password() {
	  
		System.out.println("//doesnot enter password");
	}

	



}
