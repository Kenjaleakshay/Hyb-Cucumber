package forLearning;

import io.cucumber.java.en.*;

public class Learning {
	
	@Given("user goes .+$")
	public void user_goes_to_page() {
		
		System.out.println("/// user goes to page");
	}
	
	@When("^user enters email (.+)$")
	public void user_enters_email_var(String email){
		
		System.out.println("/// user enters email " + email );
		
	}
	
	@When("^user enters pw1(.+)$")
	public void user_enters_pw1_var2(String pw1) {
		
		System.out.println("/// user enters pw1<var2> " + pw1);
	}
	
	@And("user enters valid {string}")
	public void user_enters_valid(String pw2) {
		
		System.out.println("/// user enters valid \"aks\" "+ pw2 );
	}
	
	@And("user enters invalid {string}")
	public void user_enters_invalid(String pw3) {
		
		System.out.println("/// user enters invalid \"ken\" "+pw3);
	}
	
	@Then("user learns")
	public void user_learns() {
		
		System.out.println("/// user learns");
	}
	

}
