package stepdefinitions;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class Register {
	
	@Given("User navigates to register page")
	public void user_navigates_to_register_page() {
		
		System.out.println(" 99 User navigates to login page");
	}
    
	@When("user enters the below info fields")
	public void user_enters_the_below_info_fields(DataTable data){
		
		Map<String,String> map = data.asMap();
		
		System.out.println("first name field is = "+ map.get("firstname"));
		System.out.println("lastname field is = "+ map.get("lastname"));
		System.out.println("email is "+ map.get("email"));
		System.out.println("telephone is = "+ map.get("telephone"));
		System.out.println("password is "+ map.get("password"));
		System.out.println("confirm password is "+ map.get("passwordconfirm"));
		
		
		
	}
	
	
	@When("click on continue button")
	public void click_on_continue_button() {
		
		System.out.println("99 click on continue button");
		
	}
	
	@Then("User account should be created")
	public void User_account_should_be_created() {
		
		System.out.println(" 99 User navigates to login page");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
