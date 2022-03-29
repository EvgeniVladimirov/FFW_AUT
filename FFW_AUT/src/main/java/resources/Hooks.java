package resources;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends HelpingClasses{
	
	@Before
    public void beforeScenario(){
		System.out.println("-----------------------");
    }	
	
	@After
    public void afterScenario(){
		ConfigDataReader.ClosingDriver(driver);
    }
}