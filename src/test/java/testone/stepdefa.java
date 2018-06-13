package testone;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefa {
	
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition()  {
		System.out.println("given1");
	}

	@When("^I complete action$")
	public void i_complete_action()  {
		System.out.println("when1");

	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes()  {
		System.out.println("then1");

	}

	@Given("^one$")
	public void one()  {
		System.out.println("givenscenario2");
	}

	@When("^two$")
	public void two()  {
		System.out.println("whenscenario2");

	}

	@Then("^three$")
	public void three()  {
		System.out.println("thenscenario2");

	}

}
