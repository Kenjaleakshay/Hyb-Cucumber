package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Myhooks {
	
	
	@Before
	public void setup(Scenario scenario) {
		
		System.out.println("// Execution started for scenario - " + scenario.getName());
		System.out.println("browser launched");
	}
	
	@After
	public void teardown(Scenario scenario) {
		
		System.out.println("browser closed");
		System.out.println("// Execution ended for scenario - "+ scenario.getName());
	}

}
